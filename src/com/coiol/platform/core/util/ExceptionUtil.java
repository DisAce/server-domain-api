/**   
* @Project: PlatFormCore 
* @Title: ExceptionUtil.java 
* @Package com.coiol.platform.core.util 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月17日 下午10:24:34 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.util;

/** 
 * @ClassName ExceptionUtil  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月17日 
 * 
 */
public class ExceptionUtil
{

	  public static String buildMessage(String message, Throwable cause)
	  {
	    if (cause != null) {
	      StringBuilder buf = new StringBuilder();
	      if (message != null) {
	        buf.append(message).append("; ");
	      }
	      buf.append("nested exception is ").append(cause);
	      return buf.toString();
	    }
	    return message;
	  }
}
