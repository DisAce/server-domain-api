/**   
* @Project: PlatFormCore 
* @Title: AuthenticationInterceptor.java 
* @Package com.coiol.platform.core.interceptor 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:07:29 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.interceptor;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/** 
 * @ClassName AuthenticationInterceptor  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class AuthenticationInterceptor extends HandlerInterceptorAdapter
{

	private List<String> mapping = new ArrayList();

	  private String redirectUrl = "";

	  public String getRedirectUrl()
	  {
	    return this.redirectUrl;
	  }

	  public void setRedirectUrl(String redirectUrl)
	  {
	    this.redirectUrl = redirectUrl;
	  }

	  public List<String> getMapping()
	  {
	    return this.mapping;
	  }

	  public void setMapping(List<String> mapping)
	  {
	    this.mapping = mapping;
	  }

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
	    boolean ret = true;

	    String servletPath = request.getServletPath();

	    if (!this.mapping.contains(servletPath))
	    {
	      Object user = request.getSession().getAttribute("user");

	      if (user == null)
	      {
	        ret = false;

	        String path = request.getContextPath();

	        response.sendRedirect(path + this.redirectUrl);
	      }
	    }
	    return ret;
	  }
}
