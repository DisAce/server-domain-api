/**   
* @Project: PlatFormCore 
* @Title: SqlExcutePlugin.java 
* @Package com.coiol.platform.core.sqlParser 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午9:55:22 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.sqlParser;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.PropertyException;

import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.executor.ExecutorException;
import org.apache.ibatis.executor.statement.BaseStatementHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.coiol.platform.core.authority.interceptor.DataAuthorityValue;
import org.coiol.platform.core.dto.Page;
import org.coiol.platform.core.log.PlatFormLogger;
import org.coiol.platform.core.log.PlatFormLoggerFactory;
import org.coiol.platform.core.util.ReflectHelper;

import com.alibaba.fastjson.JSONObject;

/** 
 * @ClassName SqlExcutePlugin  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
@Intercepts({@org.apache.ibatis.plugin.Signature(type=org.apache.ibatis.executor.statement.StatementHandler.class, method="prepare", args={Connection.class})})
public class SqlExcutePlugin  implements Interceptor
{ 

	 private static final PlatFormLogger log = PlatFormLoggerFactory.getPlatFormLogger(SqlExcutePlugin.class);
	  private static String dialect = "";
	  private static String pageSqlId = "";
	  boolean isAuthority = false;

	  public Object intercept(Invocation ivk)
	    throws Throwable
	  {
	    if ((ivk.getTarget() instanceof RoutingStatementHandler))
	    {
	      RoutingStatementHandler statementHandler = (RoutingStatementHandler)ivk.getTarget();
	      BaseStatementHandler delegate = (BaseStatementHandler)ReflectHelper.getValueByFieldName(statementHandler, 
	        "delegate");
	      MappedStatement mappedStatement = (MappedStatement)ReflectHelper.getValueByFieldName(delegate, 
	        "mappedStatement");
	      BoundSql boundSql = delegate.getBoundSql();

	      SqlCommandType commondType = mappedStatement.getSqlCommandType();
	      if (!"SELECT".equals(commondType.toString())) return ivk.proceed();
	      if (boundSql.getSql().trim().toUpperCase().endsWith("DUAL")) return ivk.proceed();

	      if (this.isAuthority)
	      {
	        String authorityItems = DataAuthorityValue.getAuthorityitems();

	        if ((authorityItems != null) && (!"".equals(authorityItems)) && (!"none".equals(authorityItems)) && 
	          (!"null".equals(authorityItems)))
	        {
	          String dataSource = DataAuthorityValue.getAuthorityDataSource();
	          HashMap dataAuthority = DataAuthorityValue.getDataAuthority();
	          HashMap authoritySql = DataAuthorityValue.getAuthoritySql();
	          HashMap tableKey = DataAuthorityValue.getTableKey();
	          HashMap valueKey = DataAuthorityValue.getValueKey();

	          log.debug(
	            "---------数据源:{}-------权限控制字段:{}-------Sql转换配置:{}-------用户权限：{}------表关键字段：{}------值取值范围：{}", new Object[] { 
	            dataSource, authorityItems, JSONObject.toJSON(authoritySql).toString(), 
	            JSONObject.toJSON(dataAuthority).toString(), JSONObject.toJSON(tableKey).toString(), 
	            JSONObject.toJSON(valueKey).toString() });

	          if (dataAuthority != null)
	          {
	            String[] items = null;
	            if ("all".equals(authorityItems))
	            {
	              Set asKey = authoritySql.keySet();
	              String[] items1 = new String[asKey.size()];
	              Iterator asKeyItr = asKey.iterator();
	              int i = 0;
	              while (asKeyItr.hasNext())
	              {
	                String item = (String)asKeyItr.next();
	                items1[(i++)] = item;
	              }

	            }
	            else
	            {
	              items = authorityItems.split(",");
	            }
	            String testSql = boundSql.getSql();
	            testSql = testSql + " ENDOFSQL";

	            Queue queue = SqlParserUtil.cutByBracket(testSql);

	            String result = SqlParserUtil.parseQueueToSql(queue);
	            log.debug("-------------处理过的SQL:{}------", new Object[] { result });

	            String sqlReg = "(.*?)(@auth\\[)(.*?)(\\])";
	            Pattern pattern = Pattern.compile(sqlReg);
	            Matcher matcher = pattern.matcher(result);

	            while (matcher.find())
	            {
	              String newSql = "";
	              String sql1 = matcher.group(2) + matcher.group(3) + matcher.group(4);

	              String authTableStr = matcher.group(3);
	              String tbReg = "(.*?)(:)(.*?)(;)";
	              Pattern pattern2 = Pattern.compile(tbReg);
	              Matcher matcher2 = pattern2.matcher(authTableStr);
	              List<String> authArr = new ArrayList();
	              while (matcher2.find())
	              {
	                String tbAli = matcher2.group(1);
	                String tableName = matcher2.group(3);
	                for (String s : items)
	                {
	                  String tempStr = "";

	                  Map authColumns = (Map)tableKey.get(s);
	                  if (authColumns == null) {
	                    continue;
	                  }
	                  Map column = (Map)authColumns.get(tableName);
	                  if (column == null)
	                    continue;
	                  String relationId = (String)column.get("relationId");
	                  String columnName = (String)column.get("columnName");
	                  String sqlTemp = (String)authoritySql.get(s);
	                  sqlTemp = sqlTemp.replace("@k[" + s + "]", tbAli + "." + columnName);
	                  HashMap valueMap = (HashMap)valueKey.get(relationId);
	                  String authValue = (String)dataAuthority.get(s);
	                  if (authValue != null)
	                  {
	                    String[] authValues = authValue.split(";");
	                    if (sqlTemp.indexOf("[S]") > 0)
	                    {
	                      String tempValue = "";
	                      for (String v : authValues)
	                      {
	                        if ((valueMap != null) && (valueMap.get(v) != null))
	                        {
	                          tempValue = tempValue + "'" + valueMap.get(v) + "',";
	                        }
	                        else
	                        {
	                          tempValue = tempValue + "'" + v + "',";
	                        }
	                      }
	                      if (tempValue.endsWith(","))
	                      {
	                        tempValue = tempValue.substring(0, tempValue.length() - 1);
	                      }
	                      sqlTemp = sqlTemp.replace("[S]", tempValue);
	                    }
	                    if (sqlTemp.indexOf("[N]") > 0)
	                    {
	                      String tempValue = "";
	                      for (String v : authValues)
	                      {
	                        if ((valueMap != null) && (valueMap.get(v) != null))
	                        {
	                          tempValue = tempValue + valueMap.get(v) + ",";
	                        }
	                        else
	                        {
	                          tempValue = tempValue + v + ",";
	                        }
	                      }
	                      if (tempValue.endsWith(","))
	                      {
	                        tempValue = tempValue.substring(0, tempValue.length() - 1);
	                      }
	                      sqlTemp = sqlTemp.replace("[N]", tempValue);
	                    }
	                    if (sqlTemp.indexOf("[D]") > 0)
	                    {
	                      String tempValue = "";
	                      for (String v : authValues)
	                      {
	                        if ((valueMap != null) && (valueMap.get(v) != null))
	                        {
	                          tempValue = tempValue + "to_date('" + valueMap.get(v) + 
	                            "','yyyy-mm-dd'),";
	                        }
	                        else
	                        {
	                          tempValue = tempValue + "to_date('" + v + "','yyyy-mm-dd'),";
	                        }
	                      }
	                      if (tempValue.endsWith(","))
	                      {
	                        tempValue = tempValue.substring(0, tempValue.length() - 1);
	                      }
	                      sqlTemp = sqlTemp.replace("[D]", tempValue);
	                    }

	                    if (sqlTemp.indexOf("[T]") > 0)
	                    {
	                      String tempValue = "";
	                      for (String v : authValues)
	                      {
	                        if ((valueMap != null) && (valueMap.get(v) != null))
	                        {
	                          tempValue = tempValue + "to_date('" + valueMap.get(v) + 
	                            "','yyyy-mm-dd hh24:mi:ss'),";
	                        }
	                        else
	                        {
	                          tempValue = tempValue + "to_date('" + v + 
	                            "','yyyy-mm-dd hh24:mi:ss'),";
	                        }
	                      }
	                      if (tempValue.endsWith(","))
	                      {
	                        tempValue = tempValue.substring(0, tempValue.length() - 1);
	                      }
	                      sqlTemp = sqlTemp.replace("[T]", tempValue);
	                    }
	                    authArr.add(sqlTemp);
	                  }
	                  else
	                  {
	                    authArr.add("1=2");
	                  }

	                }

	              }

	              if (authArr.size() > 0)
	              {
	                newSql = newSql + " ( " + (String)authArr.get(0);
	                for (int i = 1; i < authArr.size(); i++)
	                {
	                  newSql = newSql + " AND " + (String)authArr.get(i);
	                }

	                newSql = newSql + " ) ";
	              }
	              result = result.replace(sql1, newSql);
	            }
	            log.debug("{}", new Object[] { result });

	            ReflectHelper.setValueByFieldName(boundSql, "sql", result);
	          }
	          else
	          {
	            ReflectHelper.setValueByFieldName(boundSql, "sql", "SELECT * FROM ( " + boundSql.getSql() + 
	              " ) WHERE 1=2");
	          }
	        }

	      }

	      if (mappedStatement.getId().matches(pageSqlId))
	      {
	        log.debug("==>检测到需要分页:{}", new Object[] { mappedStatement.getId() });
	        Object parameterObject = boundSql.getParameterObject();
	        if (parameterObject == null) throw new NullPointerException("parameterObject尚未实例化！");

	        Connection connection = (Connection)ivk.getArgs()[0];
	        String sql = boundSql.getSql();
	        String countSql = "select count(0) from (" + sql + ") tmp_count";
	        PreparedStatement countStmt = connection.prepareStatement(countSql);
	        Map additionalParameters = (Map)ReflectHelper.getValueByFieldName(
	          boundSql, "additionalParameters");
	        BoundSql countBS = new BoundSql(mappedStatement.getConfiguration(), countSql, 
	          boundSql.getParameterMappings(), parameterObject);
	        ReflectHelper.setValueByFieldName(countBS, "additionalParameters", additionalParameters);
	        ReflectHelper.setValueByFieldName(countBS, "metaParameters", mappedStatement.getConfiguration()
	          .newMetaObject(additionalParameters));
	        setParameters(countStmt, mappedStatement, countBS, parameterObject);
	        ResultSet rs = countStmt.executeQuery();
	        int count = 0;
	        if (rs.next())
	        {
	          count = rs.getInt(1);
	        }
	        rs.close();
	        countStmt.close();
	        Page page = null;

	        if ((parameterObject instanceof MapperMethod.ParamMap))
	        {
	          page = (Page)((MapperMethod.ParamMap)parameterObject).get("page");

	          page.setTotalResult(count);
	        }
	        else if ((parameterObject instanceof Page))
	        {
	          page = (Page)parameterObject;
	          page.setEntityOrField(true);

	          page.setTotalResult(count);
	        }
	        else if ((parameterObject instanceof Map))
	        {
	          Object obj = ((Map)parameterObject).get("page");
	          if (obj != null)
	          {
	            page = (Page)obj;
	            page.setEntityOrField(false);

	            page.setTotalResult(count);
	          }
	          else
	          {
	            throw new NoSuchFieldException(parameterObject.getClass().getName() + "不存在 page 属性！");
	          }
	        }
	        else
	        {
	          Field pageField = ReflectHelper.getFieldByFieldName(parameterObject, "page");
	          if (pageField != null)
	          {
	            page = (Page)ReflectHelper.getValueByFieldName(parameterObject, "page");
	            if (page == null)
	              page = new Page();
	            page.setEntityOrField(false);

	            page.setTotalResult(count);
	            ReflectHelper.setValueByFieldName(parameterObject, "page", page);
	          }
	          else
	          {
	            throw new NoSuchFieldException(parameterObject.getClass().getName() + "不存在 page 属性！");
	          }
	        }

	        String pageSql = generatePageSql(sql, page);
	        ReflectHelper.setValueByFieldName(boundSql, "sql", pageSql);
	      }
	    }

	    return ivk.proceed();
	  }

	  private void setParameters(PreparedStatement ps, MappedStatement mappedStatement, BoundSql boundSql, Object parameterObject)
	    throws SQLException
	  {
	    ErrorContext.instance().activity("setting parameters").object(mappedStatement.getParameterMap().getId());
	    List parameterMappings = boundSql.getParameterMappings();
	    if (parameterMappings != null)
	    {
	      Configuration configuration = mappedStatement.getConfiguration();
	      TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
	      MetaObject metaObject = parameterObject == null ? null : configuration.newMetaObject(parameterObject);
	      for (int i = 0; i < parameterMappings.size(); i++)
	      {
	        ParameterMapping parameterMapping = (ParameterMapping)parameterMappings.get(i);
	        if (parameterMapping.getMode() == ParameterMode.OUT) {
	          continue;
	        }
	        String propertyName = parameterMapping.getProperty();
	        PropertyTokenizer prop = new PropertyTokenizer(propertyName);
	        Object value;
	        if (parameterObject == null)
	        {
	          value = null;
	        }
	        else
	        {
	          if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass()))
	          {
	            value = parameterObject;
	          }
	          else
	          {
	            if (boundSql.hasAdditionalParameter(propertyName))
	            {
	              value = boundSql.getAdditionalParameter(propertyName);
	            }
	            else if (propertyName.startsWith("__frch_"))
	            {
	               value = boundSql.getAdditionalParameter(prop.getName());
	              if (value != null)
	              {
	                value = configuration.newMetaObject(value).getValue(
	                  propertyName.substring(prop.getName().length()));
	              }
	            }
	            else
	            {
	              value = metaObject == null ? null : metaObject.getValue(propertyName);
	            }
	          }
	        }
	        TypeHandler typeHandler = parameterMapping.getTypeHandler();
	        if (typeHandler == null)
	          throw new ExecutorException("There was no TypeHandler found for parameter " + propertyName + " of statement " + 
	            mappedStatement.getId());
	        typeHandler.setParameter(ps, i + 1, value, parameterMapping.getJdbcType());
	      }
	    }
	  }

	  private String generatePageSql(String sql, Page page)
	  {
	    if ((page != null) && (!"".equals(dialect)))
	    {
	      StringBuffer pageSql = new StringBuffer();
	      if ("mysql".equals(dialect))
	      {
	        pageSql.append(sql);
	        pageSql.append(" limit " + page.getCurrentResult() + "," + page.getShowCount());
	      }
	      else if ("oracle".equals(dialect))
	      {
	        pageSql.append("select * from (select tmp_tb.*,ROWNUM row_id from (");
	        pageSql.append(sql);
	        pageSql.append(") tmp_tb where ROWNUM<=");
	        pageSql.append(page.getCurrentResult() + page.getShowCount());
	        pageSql.append(") where row_id>");
	        pageSql.append(page.getCurrentResult());
	      }
	      return pageSql.toString();
	    }
	    return sql;
	  }

	  public Object plugin(Object arg0)
	  {
	    return Plugin.wrap(arg0, this);
	  }

	  public void setProperties(Properties p)
	  {
	    dialect = p.getProperty("dialect");
	    if ("".equals(dialect))
	    {
	      try
	      {
	        throw new PropertyException("dialect property is not found!");
	      }
	      catch (PropertyException e)
	      {
	        e.printStackTrace();
	      }
	    }
	    pageSqlId = p.getProperty("pageSqlId");
	    if ("".equals(pageSqlId))
	    {
	      try
	      {
	        throw new PropertyException("pageSqlId property is not found!");
	      }
	      catch (PropertyException e)
	      {
	        e.printStackTrace();
	      }
	    }

	    String isAuthorityStr = p.getProperty("isAuthority");

	    if (("".equals(isAuthorityStr)) && (!"true".equals(isAuthorityStr)) && (!"false".equals(isAuthorityStr)))
	    {
	      try
	      {
	        throw new PropertyException("dialect property is not found!");
	      }
	      catch (PropertyException e)
	      {
	        e.printStackTrace();
	      }

	    }
	    else
	    {
	      this.isAuthority = Boolean.parseBoolean(isAuthorityStr);
	    }
	  }
}
