/**   
* @Project: PlatFormCore 
* @Title: AuthorityPlugin.java 
* @Package com.coiol.platform.core.authority.aspect 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 下午8:42:18 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.authority.aspect;

import java.util.HashMap;
import java.util.Properties;
import org.apache.ibatis.executor.statement.BaseStatementHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.coiol.platform.core.aop.Aop4Log;
import org.coiol.platform.core.authority.interceptor.DataAuthorityValue;
import org.coiol.platform.core.jackjson.JackJson;
import org.coiol.platform.core.log.PlatFormLogger;
import org.coiol.platform.core.log.PlatFormLoggerFactory;
import org.coiol.platform.core.util.Log;
import org.coiol.platform.core.util.ReflectHelper;

/** 
 * @ClassName AuthorityPlugin  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
@Intercepts({@org.apache.ibatis.plugin.Signature(type=org.apache.ibatis.executor.statement.StatementHandler.class, method="prepare", args={java.sql.Connection.class})})
public class AuthorityPlugin implements Interceptor
{
	private static final PlatFormLogger log = PlatFormLoggerFactory.getPlatFormLogger(AuthorityPlugin.class);
	
	 public Object intercept(Invocation invocation)
			    throws Throwable
			  {
			    String dataSource = DataAuthorityValue.getAuthorityDataSource();
			    String authorityItems = DataAuthorityValue.getAuthorityitems();
			    HashMap dataAuthority = DataAuthorityValue.getDataAuthority();
			    HashMap authoritySql = DataAuthorityValue.getAuthoritySql();

			    log.debug("---------数据源:{}-------权限控制字段:{}-------Sql转换配置:{}-------用户权限：{}", new Object[] { dataSource, authorityItems, 
			    		JackJson.fromObjectToJson(authoritySql).toString(), JackJson.fromObjectToJson(dataAuthority).toString() });
			    if ((invocation.getTarget() instanceof RoutingStatementHandler))
			    {
			      RoutingStatementHandler statementHandler = (RoutingStatementHandler)invocation.getTarget();
			      BaseStatementHandler delegate = (BaseStatementHandler)ReflectHelper.getValueByFieldName(statementHandler, 
			        "delegate");
			      MappedStatement mappedStatement = (MappedStatement)ReflectHelper.getValueByFieldName(delegate, 
			        "mappedStatement");

			      BoundSql boundSql = delegate.getBoundSql();
			      String testSql = "select * from (" + boundSql.getSql() + ")";

			      ReflectHelper.setValueByFieldName(boundSql, "sql", testSql);
			    }
			    return invocation.proceed();
			  }

			  public Object plugin(Object arg0)
			  {
			    return Plugin.wrap(arg0, this);
			  }

			  @Override
			  public void setProperties(Properties arg0)
			  {
			  }

}
