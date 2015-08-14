/**   
* @Project: PlatFormCore 
* @Title: SpringLogInterceptor.java 
* @Package com.coiol.platform.core.interceptor 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:08:04 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.interceptor;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.coiol.platform.core.authority.aspect.AuthorityPlugin;
import org.coiol.platform.core.log.PlatFormLogger;
import org.coiol.platform.core.log.PlatFormLoggerFactory;
import org.coiol.platform.core.util.DateFormat;
import org.coiol.platform.core.util.Log;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/** 
 * @ClassName SpringLogInterceptor  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class SpringLogInterceptor extends HandlerInterceptorAdapter
{
	  private static final PlatFormLogger log = PlatFormLoggerFactory.getPlatFormLogger(SpringLogInterceptor.class);
	  private static final ThreadLocal contextHolder = new ThreadLocal();

	  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
	    throws Exception
	  {
	    super.afterCompletion(request, response, handler, ex);
	  }

	  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
	    throws Exception
	  {
	    log.info("结束请求:" + (String)contextHolder.get() + ",请求结束时间：{}", new Object[] { DateFormat.getStringCurrentDate() });
	    super.postHandle(request, response, handler, modelAndView);
	  }

	  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	    throws Exception
	  {
	    String uri = request.getRequestURI();
	    Map param = request.getParameterMap();
	    String paramStr = "[";
	    Set k = param.keySet();
	    Iterator it = k.iterator();
	    while (it.hasNext())
	    {
	      String key = (String)it.next();
	      paramStr = paramStr + key + ":";
	      Object valueObj = param.get(key);
	      if (valueObj == null)
	      {
	        paramStr = paramStr;
	      }
	      else if ((valueObj instanceof String[]))
	      {
	        String[] values = (String[])valueObj;
	        for (int i = 0; i < values.length; i++)
	        {
	          paramStr = paramStr + values[i] + ",";
	        }
	        paramStr = paramStr.substring(0, paramStr.length() - 1);
	      }
	      else
	      {
	        paramStr = paramStr + valueObj.toString();
	      }

	      paramStr = paramStr + "; ";
	    }
	    paramStr = paramStr + "]";
	    log.info("开始请求:{},参数：{},请求时间:{}", new Object[] { uri, paramStr, DateFormat.getStringCurrentDate() });
	    contextHolder.set(uri + ",参数：" + paramStr + ",请求时间:" + DateFormat.getStringCurrentDate());
	    return true;
	  }
}
