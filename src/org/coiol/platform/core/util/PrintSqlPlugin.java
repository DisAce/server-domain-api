/**   
* @Project: PlatFormCore 
* @Title: PrintSqlPlugin.java 
* @Package com.coiol.platform.core.util 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月20日 下午10:17:16 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.util;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.coiol.platform.core.log.PlatFormLogger;
import org.coiol.platform.core.log.PlatFormLoggerFactory;

/** 
 * @ClassName PrintSqlPlugin  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月20日 
 * 
 */
public class PrintSqlPlugin  implements Interceptor
{

	private static final PlatFormLogger log = PlatFormLoggerFactory.getPlatFormLogger(PrintSqlPlugin.class);

	  public Object intercept(Invocation invocation)
	    throws Throwable
	  {
	    MappedStatement mappedStatement = (MappedStatement)invocation.getArgs()[0];
	    Object parameter = invocation.getArgs()[1];
	    BoundSql boundSql = mappedStatement.getSqlSource().getBoundSql(parameter);
	    try
	    {
	      Object parameterObject = boundSql.getParameterObject();
	      List<Object> param = new LinkedList<Object>();
	      addParam(param, mappedStatement, boundSql, parameterObject);
	      String sql = formatSql(boundSql.getSql());
	      if ((sql != null) && (sql.length() > 0))
	      {
	        char[] chars = sql.toCharArray();
	        int i = 0;
	        String ret = "";
	        for (char c : chars)
	        {
	          if (c == '?')
	          {
	            ret = ret + "'" + param.get(i) + "'";
	            i++;
	          }
	          else {
	            ret = ret + c;
	          }
	        }
	        log.info("- ==>  打印SQL[" + mappedStatement.getId() + "]:" + ret, new Object[0]);
	      }
	    }
	    catch (Exception e)
	    {
	      log.error("- ==>  打印SQL出错[" + mappedStatement.getId() + "]：" + e.getMessage() + "原Sql[" + 
	        mappedStatement.getId() + "]：" + formatSql(boundSql.getSql()), new Object[0]);
	    }
	    return invocation.proceed();
	  }

	  public void addParam(List<Object> params, MappedStatement mappedStatement, BoundSql boundSql, Object parameterObject)
	    throws SQLException
	  {
	    List<?> parameterMappings = boundSql.getParameterMappings();
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
	            else if ((propertyName.startsWith("__frch_")) && 
	              (boundSql.hasAdditionalParameter(prop.getName())))
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
	        params.add(value);
	      }
	    }
	  }

	  public Object plugin(Object arg0)
	  {
	    return Plugin.wrap(arg0, this);
	  }

	  public void setProperties(Properties p)
	  {
	  }

	  public String formatSql(String sql)
	  {
	    while (sql.indexOf("\n") > 0)
	    {
	      sql = sql.replace("\n", " ");
	    }
	    while (sql.indexOf("\t") > 0)
	    {
	      sql = sql.replace("\t", " ");
	    }
	    while (sql.indexOf("  ") > 0)
	    {
	      sql = sql.replace("  ", " ");
	    }
	    return sql;
	  }
}
