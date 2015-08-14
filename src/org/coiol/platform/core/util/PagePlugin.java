/**   
* @Project: PlatFormCore 
* @Title: PagePlugin.java 
* @Package com.coiol.platform.core.util 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月20日 下午10:11:26 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
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
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.coiol.platform.core.dto.Page;
import org.coiol.platform.core.log.PlatFormLogger;
import org.coiol.platform.core.log.PlatFormLoggerFactory;

/** 
 * @ClassName PagePlugin  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月20日 
 * 
 */
public class PagePlugin implements Interceptor
{

	private static final PlatFormLogger log = PlatFormLoggerFactory.getPlatFormLogger(PagePlugin.class);
	  private static String dialect = "";
	  private static String pageSqlId = "";

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

	      if (mappedStatement.getId().matches(pageSqlId))
	      {
	        log.debug("==>检测到需要分页:{}", new Object[] { mappedStatement.getId() });
	        BoundSql boundSql = delegate.getBoundSql();
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

	  @Override
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
	  }
}
