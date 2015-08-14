/**   
* @Project: PlatFormCore 
* @Title: DataAuthorityInterceptor.java 
* @Package com.coiol.platform.core.authority.interceptor 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 下午8:44:05 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.authority.interceptor;

import java.util.HashMap;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/** 
 * @ClassName DataAuthorityInterceptor  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */

public class DataAuthorityInterceptor extends HandlerInterceptorAdapter
{

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
    throws Exception
		  {
		    super.afterCompletion(request, response, handler, ex);
		  }

		  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
		    throws Exception
		  {
		    super.postHandle(request, response, handler, modelAndView);
		  }

		  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		    throws Exception
		  {
		    HttpSession session = request.getSession();
		    HashMap map = new HashMap();

		    map = (HashMap)session.getAttribute("dataAuthority");
		    ServletContext servletContext = request.getSession().getServletContext();
		    HashMap tableKey = (HashMap)servletContext.getAttribute("tableKey");
		    HashMap valueKey = (HashMap)servletContext.getAttribute("valueKey");
		    DataAuthorityValue.setDataAuthority(map);
		    DataAuthorityValue.setTableKey(tableKey);
		    DataAuthorityValue.setValueKey(valueKey);
		    return true;
		  }
}
