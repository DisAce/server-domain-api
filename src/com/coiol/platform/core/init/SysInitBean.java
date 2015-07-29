/**   
* @Project: PlatFormCore 
* @Title: SysInitBean.java 
* @Package com.coiol.platform.core.init 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:09:23 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.init;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ServletContextAware;

/** 
 * @ClassName SysInitBean  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class SysInitBean implements InitializingBean, ServletContextAware
{ 
	ServletContext servletContext;

	  @Autowired(required=false)
	  InitBean initBean;

	  public void afterPropertiesSet()
	    throws Exception
	  {
	    if (this.initBean != null)
	    {
	      Map map = this.initBean.toMap();
	      if (map != null)
	      {
	        Set initMapSet = map.keySet();
	        Iterator it = initMapSet.iterator();
	        while (it.hasNext())
	        {
	          String key = (String)it.next();
	          this.servletContext.setAttribute(key, map.get(key));
	        }
	      }
	    }
	  }

	  public void setServletContext(ServletContext servletContext)
	  {
	    this.servletContext = servletContext;
	  }
}
