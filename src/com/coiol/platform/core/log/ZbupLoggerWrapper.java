/**   
* @Project: PlatFormCore 
* @Title: ZbupLoggerWrapper.java 
* @Package com.coiol.platform.core.log 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月17日 下午10:08:07 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName ZbupLoggerWrapper  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月17日 
 * 
 */
public class ZbupLoggerWrapper
{
	private Logger _logger;
	  private static final String defaultLogName = "com.zbiti.core.util.Log";

	  public ZbupLoggerWrapper(String name)
	  {
	    this._logger = LoggerFactory.getLogger(name);
	  }

	  public void debug(String message, Object[] args) {
	    this._logger.debug(message, args);
	  }

	  public void info(String message, Object[] args) {
	    this._logger.info(message, args);
	  }

	  public void warn(String message, Object[] args) {
	    this._logger.warn(message, args);
	  }

	  public void trace(String message, Object[] args) {
	    this._logger.trace(message, args);
	  }

	  public void error(String message, Object[] args) {
	    this._logger.error(message, args);
	  }

	  public void error(String message, Throwable e) {
	    this._logger.error(message, e);
	  }

	  public boolean isDebugEnabled() {
	    if (this._logger == null)
	      return false;
	    return this._logger.isDebugEnabled();
	  }

	  public boolean isErrorEnabled() {
	    if (this._logger == null)
	      return false;
	    return this._logger.isErrorEnabled();
	  }

	  public boolean isInfoEnabled() {
	    if (this._logger == null)
	      return false;
	    return this._logger.isInfoEnabled();
	  }

	  public boolean isTraceEnabled() {
	    if (this._logger == null)
	      return false;
	    return this._logger.isTraceEnabled();
	  }

	  public boolean isWarnEnabled() {
	    if (this._logger == null)
	      return false;
	    return this._logger.isWarnEnabled();
	  }

}
