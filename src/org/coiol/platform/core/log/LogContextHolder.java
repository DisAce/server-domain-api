/**   
* @Project: PlatFormCore 
* @Title: LogContextHolder.java 
* @Package com.coiol.platform.core.log 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月17日 下午10:12:38 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.log;

/** 
 * @ClassName LogContextHolder  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月17日 
 * 
 */
public class LogContextHolder
{

	private static final ThreadLocal<LogContext> logContextHolder = new InheritableThreadLocal();

	  public static void clearLogContext() {
	    setLogContext(null);
	    logContextHolder.remove();
	  }

	  public static void setLogContext(LogContext logContext) {
	    logContextHolder.set(logContext);
	  }

	  public static LogContext getLogContext() {
	    return (LogContext)logContextHolder.get();
	  }
}
