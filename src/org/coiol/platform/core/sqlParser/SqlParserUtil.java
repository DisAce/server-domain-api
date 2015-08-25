/**   
* @Project: PlatFormCore 
* @Title: SqlParserUtil.java 
* @Package com.coiol.platform.core.sqlParser 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:01:02 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.sqlParser;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * @ClassName SqlParserUtil  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class SqlParserUtil
{
	public static void main(String[] args)
	  {
	    String sql = "SELECT gi.giveitemid ,gi.itemid ,gi.itemcode ,gi.itemname ,gi.auditmethod ,gi.specialsmalltype ,gi.item_type ,gi.give_money ,gi.first_money ,gi.itemprincipal ,to_char(gi.submittime, 'yyyy-MM-dd') submittime ,gi.company ,gi.department ,gi.item_url FROM m_giveitem_info gi ORDER BY gi.submittime DESC union all SELECT gi.giveitemid ,gi.itemid ,gi.itemcode ,gi.itemname ,gi.auditmethod ,gi.specialsmalltype ,gi.item_type ,gi.give_money ,gi.first_money ,gi.itemprincipal ,to_char(gi.submittime, 'yyyy-MM-dd') submittime ,gi.company ,gi.department ,gi.item_url FROM m_giveitem_info gi ORDER BY gi.submittime DESC union SELECT gi.giveitemid ,gi.itemid ,gi.itemcode ,gi.itemname ,gi.auditmethod ,gi.specialsmalltype ,gi.item_type ,gi.give_money ,gi.first_money ,gi.itemprincipal ,to_char(gi.submittime, 'yyyy-MM-dd') submittime ,gi.company ,gi.department ,gi.item_url FROM m_giveitem_info gi ORDER BY gi.submittime DESC";

	    sql = sql + " ENDOFSQL";

	    Queue<SqlSegment> queue = cutByBracket(sql);

	    String result = parseQueueToSql(queue);
	    System.out.println("SQL:" + result);
	  }

	  public static String authSql(SqlSegment seg)
	  {
	    String sql = ("SELECT ".equals(seg.getStart()) ? "SELECT " : "") + seg.getBody();

	    if (!contains(sql, "(select)(.+)(from)(.+)")) return sql;

	    sql = sql.replace(" LEFT JOIN ", " @LJ ");
	    sql = sql.replace(" OUTER JOIN ", " @OJ ");
	    sql = sql.replace(" LEFT OUTER JOIN  ", " @LOJ ");
	    sql = sql.replace(" RIGHT OUTER  JOIN ", " @ROJ ");
	    sql = sql.replace(" RIGHT JOIN ", " @RJ ");
	    sql = sql.replace(" INNER JOIN ", " @IJ ");

	    String unionReg = "(.+)(| UNION | UNION ALL | MINUS)";
	    Pattern pattern = Pattern.compile(unionReg, 2);
	    Matcher matcher = pattern.matcher(sql);
	    String newSql = "";
	    while (matcher.find())
	    {
	      String cutSql = matcher.group(1);
	      String unionStr = matcher.group(2);
	      newSql = newSql + parseSql(cutSql) + unionStr;
	    }

	    return newSql;
	  }

	  public static String parseSql(String sql)
	  {
	    LinkNode<SqlSegment> cutSqls = cutSql(
	      sql, 
	      "(SELECT | FROM | JOIN | @LJ | @RJ | @LOJ |@ROJ | @IJ | WHERE | ORDER BY | GROUP BY | CONNECT BY )(.+)( FROM | JOIN | @LJ| @RJ | @LOJ |@ROJ | @IJ | WHERE | ORDER BY | GROUP BY | CONNECT BY | ENDOFSQL)", 
	      " ");

	    LinkNode<SqlSegment> cur = cutSqls;
	    List<String> tableNames = new LinkedList<String>();
	    Map<String, String> tableAls = new HashMap<String, String>();
	    boolean hasWhere = false;
	    SqlSegment whereSeg = null;
	    LinkNode<SqlSegment> lastSeg = null;
	    while (cur != null)
	    {
	      SqlSegment curSeq = (SqlSegment)cur.getNode();
	      if (("FROM".equals(curSeq.getStart().trim())) || ("JOIN".equals(curSeq.getStart().trim())) || 
	        ("@LJ".equals(curSeq.getStart().trim())) || ("@RJ".equals(curSeq.getStart().trim())) || 
	        ("@LOJ".equals(curSeq.getStart().trim())) || ("@ROJ".equals(curSeq.getStart().trim())) || 
	        ("@IJ".equals(curSeq.getStart().trim())) || ("@OJ".equals(curSeq.getStart().trim())))
	      {
	        lastSeg = cur;

	        String body = curSeq.getBody();

	        body = body.trim();

	        if (body.indexOf(",") > 0)
	        {
	          String[] bodyArr = body.split(",");
	          for (String s : bodyArr)
	          {
	            s = s.trim();
	            while (s.indexOf("  ") > 0)
	            {
	              s = s.replace("  ", " ");
	            }

	            String[] tableInfo = s.split(" ");
	            if ((tableInfo == null) || (tableInfo.length <= 0) || (tableInfo[0].startsWith("@")))
	              continue;
	            tableNames.add(tableInfo[0]);
	            if (tableInfo.length <= 1) {
	              continue;
	            }
	            if (!"AS".equals(tableInfo[1].toUpperCase()))
	            {
	              tableAls.put(tableInfo[0], tableInfo[2]);
	            }
	            else
	            {
	              tableAls.put(tableInfo[0], tableInfo[1]);
	            }

	          }

	        }
	        else
	        {
	          body = body.trim();
	          while (body.indexOf("  ") > 0)
	          {
	            body = body.replace("  ", " ");
	          }
	          String[] tableInfo = body.split(" ");
	          String tableName = tableInfo[0];
	          tableAls.put(tableInfo[0], tableInfo[0]);
	          if (!tableName.startsWith("@"))
	          {
	            tableNames.add(tableName);
	            if (tableInfo.length > 1)
	            {
	              if (("AS".equals(tableInfo[1].toUpperCase())) || ("ON".equals(tableInfo[1].toUpperCase())))
	              {
	                tableAls.put(tableInfo[0], tableInfo[2]);
	              }
	              else
	              {
	                tableAls.put(tableInfo[0], tableInfo[1]);
	              }
	            }

	          }

	        }

	      }

	      if ("WHERE".equals(curSeq.getStart().trim()))
	      {
	        hasWhere = true;
	        whereSeg = curSeq;
	      }
	      cur = cur.getNext();
	    }

	    if ((hasWhere) && (whereSeg != null))
	    {
	      String body = whereSeg.getBody();

	      body = body.trim();
	      String tables = "";
	      if (tableNames.size() > 0)
	      {
	        boolean isDual = false;
	        for (String table : tableNames)
	        {
	          if ("DUAL".equals(table.trim()))
	          {
	            isDual = true;
	          }
	          tables = tables + ((String)tableAls.get(table)).trim() + ":" + table.trim() + ";";
	        }

	        if (!isDual)
	        {
	          String newBody = " @auth[" + tables + "] AND (" + body + ") ";
	          whereSeg.setBody(newBody);
	        }
	      }

	    }
	    else
	    {
	      LinkNode<SqlSegment> sqlSegment = new LinkNode<SqlSegment>();
	      SqlSegment newWhereSeg = new SqlSegment("( WHERE )(.+)( ENDOFSQL| GROUP BY | ORDER BY | CONNECT BY )", " ");
	      String tables = "";
	      if (tableNames.size() > 0)
	      {
	        boolean isDual = false;
	        for (String table : tableNames)
	        {
	          if ("DUAL".equals(table.trim()))
	          {
	            isDual = true;
	          }
	          tables = tables + ((String)tableAls.get(table)).trim() + ":" + table.trim() + ";";
	        }
	        if (!isDual)
	        {
	          newWhereSeg.parse(" WHERE @auth[" + tables + "] ENDOFSQL");
	          newWhereSeg.setEnd(((SqlSegment)lastSeg.getNode()).getEnd());
	          ((SqlSegment)lastSeg.getNode()).setEnd(" WHERE ");
	          sqlSegment.setNode(newWhereSeg);
	          sqlSegment.setNext(lastSeg.getNext());
	          lastSeg.setNext(sqlSegment);
	        }

	      }

	    }

	    cur = cutSqls;
	    String resultSql = "";
	    while (cur != null)
	    {
	      SqlSegment curSeg = (SqlSegment)cur.getNode();
	      resultSql = resultSql + curSeg.getStart() + " " + curSeg.getBody();
	      cur = cur.getNext();
	    }

	    return resultSql;
	  }

	  public static LinkNode<SqlSegment> cutSql(String sql, String segStr, String bodySegStr)
	  {
	    String theEnd = "";
	    String temp = sql + " ENDOFSQL";
	    LinkNode<SqlSegment> sqlNode = new LinkNode<SqlSegment>();
	    LinkNode<SqlSegment> lastNode = null;
	    while (!"ENDOFSQL".equals(theEnd))
	    {
	      LinkNode<SqlSegment> curLink = new LinkNode<SqlSegment>();
	      SqlSegment ss = new SqlSegment(segStr, bodySegStr);
	      ss.parse(temp);
	      theEnd = ss.getEnd().trim();
	      temp = temp.substring(ss.getCurSql().length() - ss.getEnd().length());
	      curLink.setNode(ss);
	      if (lastNode == null)
	      {
	        sqlNode.setNode(ss);
	        lastNode = sqlNode;
	      }
	      else
	      {
	        lastNode.setNext(curLink);
	        lastNode = curLink;
	      }
	    }
	    return sqlNode;
	  }

	  private static boolean contains(String sql, String regExp)
	  {
	    Pattern pattern = Pattern.compile(regExp, 2);
	    Matcher matcher = pattern.matcher(sql);
	    return matcher.find();
	  }

	  public static Queue<SqlSegment> cutByBracket(String sql)
	  {
	    String theEnd = "";

	    sql = sql.replaceAll("\\s{1,}", " ");
	    sql = sql + " ENDOFSQL";

	    String temp = sql.replace("(", " @L ").replace(")", " @R ").toUpperCase();
	    LinkNode<SqlSegment> sqlNode = new LinkNode<SqlSegment>();
	    LinkNode<SqlSegment> lastNode = null;
	    while (!"ENDOFSQL".equals(theEnd))
	    {
	      LinkNode<SqlSegment> curLink = new LinkNode<SqlSegment>();
	      SqlSegment ss = new SqlSegment("(SELECT | @L | @R)(.+)( @L | @R | ENDOFSQL)", "[,]");
	      ss.parse(temp);
	      theEnd = ss.getEnd().trim();
	      temp = temp.substring(ss.getCurSql().length() - ss.getEnd().length());
	      curLink.setNode(ss);
	      if (lastNode == null)
	      {
	        sqlNode.setNode(ss);
	        lastNode = sqlNode;
	      }
	      else
	      {
	        lastNode.setNext(curLink);
	        lastNode = curLink;
	      }

	    }

	    LinkNode<SqlSegment> cur = sqlNode;
	    LinkNode<SqlSegment> last = null;
	    Queue<SqlSegment> queue = new LinkedBlockingQueue<SqlSegment>();
	    boolean hasLr = true;
	    while (hasLr)
	    {
	      hasLr = false;
	      while (cur != null)
	      {
	        SqlSegment segment = (SqlSegment)cur.getNode();
	        if (("@L".equals(segment.getStart().trim())) && ("@R".equals(segment.getEnd().trim())))
	        {
	          queue.add(segment);
	          String body = ((SqlSegment)last.getNode()).getBody() + " @{" + (queue.size() - 1) + "} ";
	          cur = cur.getNext();
	          if (cur != null)
	          {
	            body = body + " " + ((SqlSegment)cur.getNode()).getBody();
	            ((SqlSegment)last.getNode()).setEnd(((SqlSegment)cur.getNode()).getEnd());
	            ((SqlSegment)last.getNode()).setBody(body);
	          }
	          else
	          {
	            ((SqlSegment)last.getNode()).setBody(body);
	            ((SqlSegment)last.getNode()).setEnd(" ");
	          }

	          last.setNext(cur.getNext());
	          hasLr = true;
	        }

	        last = cur;
	        cur = cur.getNext();
	      }
	      cur = sqlNode;
	    }
	    queue.add((SqlSegment)sqlNode.getNode());
	    return queue;
	  }

	  public static String parseQueueToSql(Queue<SqlSegment> queue)
	  {
	    String[] sqlQueue = new String[queue.size()];
	    SqlSegment[] sqlSegs = new SqlSegment[queue.size()];
	    int m = 0;
	    while (!queue.isEmpty())
	    {
	      SqlSegment curSql = (SqlSegment)queue.poll();
	      sqlSegs[m] = curSql;
	      sqlQueue[m] = authSql(curSql);
	      m++;
	    }

	    for (int i = 0; i < sqlQueue.length; i++)
	    {
	      Pattern pattern = Pattern.compile("(.*?)(@\\{.*?\\})(.*?)", 2);
	      Matcher matcher = pattern.matcher(sqlQueue[i]);
	      while (matcher.find())
	      {
	        String rep = matcher.group(2);
	        Pattern pattern2 = Pattern.compile("(@\\{)(.*?)(\\})", 2);
	        Matcher matcher2 = pattern2.matcher(rep);
	        matcher2.find();
	        String repNum = matcher2.group(2);
	        sqlQueue[i] = sqlQueue[i].replace(rep, "(" + sqlQueue[java.lang.Integer.parseInt(repNum)] + ")");
	      }
	    }
	    String result = sqlQueue[(sqlQueue.length - 1)];

	    result = result.replace(" @LJ ", " LEFT JOIN ");
	    result = result.replace(" @OJ ", " OUTER JOIN ");
	    result = result.replace(" @LOJ ", " LEFT OUTER JOIN  ");
	    result = result.replace(" @ROJ ", " RIGHT OUTER  JOIN ");
	    result = result.replace(" @RJ ", " RIGHT JOIN ");
	    result = result.replace(" @IJ ", " INNER JOIN ");
	    return result;
	  }
}
