/**   
* @Project: PlatFormCore 
* @Title: AuthorityMethodAspect.java 
* @Package com.coiol.platform.core.authority.aspect 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 下午8:41:50 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.authority.aspect;

import java.lang.reflect.Method;
import javax.annotation.Resource;
import org.aspectj.lang.ProceedingJoinPoint;
import com.coiol.platform.core.authority.annotation.Authority;
import com.coiol.platform.core.authority.annotation.AuthorityMethod;
import com.coiol.platform.core.authority.dto.DataAuthorityBean;
import com.coiol.platform.core.authority.interceptor.DataAuthorityValue;

/** 
 * @ClassName AuthorityMethodAspect  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class AuthorityMethodAspect
{

	  @Resource(name="dataAuthorityBean")
	  DataAuthorityBean dataAuthorityBean;

	  public Object doAuthority(ProceedingJoinPoint point)
	    throws Throwable
	  {
	    String methodName = point.getSignature().getName();

	    @SuppressWarnings("rawtypes")
		Class clazz = point.getTarget().getClass();

	    Class[] interfaces = clazz.getInterfaces();

	    boolean hasClassAnnotation = false;
	    Class targetInterface = null;
	    for (Class t : interfaces)
	    {
	      targetInterface = t;
	      hasClassAnnotation = t.isAnnotationPresent(Authority.class);
	      if (hasClassAnnotation)
	      {
	        break;
	      }

	    }

	    String authorityItem = "";
	    String dataSource = "";

	    if (targetInterface != null)
	    {
	      Method[] methods = targetInterface.getMethods();
	      Method method = getMethod(methods, methodName);
	      boolean hasMethodAnnotation = method.isAnnotationPresent(AuthorityMethod.class);

	      if (hasMethodAnnotation)
	      {
	        AuthorityMethod annotation = (AuthorityMethod)method.getAnnotation(AuthorityMethod.class);
	        authorityItem = annotation.value();
	        dataSource = annotation.dataSource();
	      }
	      else if (hasClassAnnotation)
	      {
	        Authority annotation = (Authority)targetInterface.getAnnotation(Authority.class);
	        authorityItem = annotation.value();
	        dataSource = annotation.dataSource();
	      }

	    }

	    DataAuthorityValue.setAuthorityDataSource(dataSource);
	    DataAuthorityValue.setAuthorityitems(authorityItem);
	    DataAuthorityValue.setAuthoritySql(this.dataAuthorityBean.getDataAuthorityList());
	    return point.proceed();
	  }

	  private boolean isContent(Class[] classes, String contentClassName)
	  {
	    for (Class c : classes)
	    {
	      if (c.getName().equals(contentClassName)) return true;
	    }
	    return false;
	  }

	  private Method getMethod(Method[] methods, String contentMethodName)
	  {
	    for (Method c : methods)
	    {
	      if (c.getName().equals(contentMethodName)) return c;
	    }
	    return null;
	  }
}
