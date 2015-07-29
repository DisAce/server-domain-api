/**   
* @Project: PlatFormCore 
* @Title: LogbackConfigListener.java 
* @Package com.coiol.platform.core.log 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月17日 下午10:12:59 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.log;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/** 
 * @ClassName LogbackConfigListener  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月17日 
 * 
 */
public class LogbackConfigListener implements ServletContextListener
{

	public void contextInitialized(ServletContextEvent event)
	  {
	    LogbackWebConfigurer.initLogging(event.getServletContext());
	  }

	  public void contextDestroyed(ServletContextEvent event)
	  {
	    LogbackWebConfigurer.shutdownLogging(event.getServletContext());
	  }

}
