/**   
* @Project: PlatFormCore 
* @Title: SqlSegment.java 
* @Package com.coiol.platform.core.sqlParser 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:02:00 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.sqlParser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * @ClassName SqlSegment  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class SqlSegment
{

	  private String start;
	  private String body;
	  private String end;
	  private String curSql;
	  private String bodySplitPattern;
	  private String segmentRegExp;
	  private List<String> bodyPieces;

	  public SqlSegment(String segmentRegExp, String bodySplitPattern)
	  {
	    this.start = "";
	    this.body = "";
	    this.end = "";
	    this.segmentRegExp = segmentRegExp;
	    this.bodySplitPattern = bodySplitPattern;
	    this.bodyPieces = new ArrayList<String>();
	  }

	  public void parse(String sql)
	  {
	    Pattern pattern = Pattern.compile(this.segmentRegExp, 2);
	    for (int i = 0; i <= sql.length(); i++)
	    {
	      String shortSql = sql.substring(0, i);

	      Matcher matcher = pattern.matcher(shortSql);
	      if (!matcher.find())
	        continue;
	      this.curSql = shortSql;
	      this.start = matcher.group(1);
	      this.body = matcher.group(2);

	      this.end = matcher.group(3);

	      parseBody();
	      return;
	    }
	  }

	  private void parseBody()
	  {
	    List<String> ls = new ArrayList<String>();
	    Pattern p = Pattern.compile(this.bodySplitPattern, 2);

	    this.body = this.body.trim();
	    Matcher m = p.matcher(this.body);
	    StringBuffer sb = new StringBuffer();
	    boolean result = m.find();
	    while (result)
	    {
	      m.appendReplacement(sb, m.group(0) + "@");
	      result = m.find();
	    }
	    m.appendTail(sb);

	    String[] arr = sb.toString().split(" ");
	    int arrLength = arr.length;
	    for (int i = 0; i < arrLength; i++)
	    {
	      String temp = "　　" + arr[i];

	      ls.add(temp);
	    }
	    this.bodyPieces = ls;
	  }

	  public String getParsedSqlSegment()
	  {
	    StringBuffer sb = new StringBuffer();
	    sb.append(this.start + "@");
	    for (String piece : this.bodyPieces)
	    {
	      sb.append(piece + "@");
	    }
	    return sb.toString();
	  }

	  public String getBody()
	  {
	    return this.body;
	  }

	  public void setBody(String body)
	  {
	    this.body = body;
	  }

	  public String getEnd()
	  {
	    return this.end;
	  }

	  public void setEnd(String end)
	  {
	    this.end = end;
	  }

	  public String getStart()
	  {
	    return this.start;
	  }

	  public void setStart(String start)
	  {
	    this.start = start;
	  }

	  public String getCurSql()
	  {
	    return this.curSql;
	  }

	  public void setCurSql(String curSql)
	  {
	    this.curSql = curSql;
	  }
}
