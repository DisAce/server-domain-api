/**   
* @Project: PlatFormCore 
* @Title: SmoException.java 
* @Package com.coiol.platform.core.exception 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:12:29 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.exception;

/** 
 * @ClassName SmoException  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class SmoException extends ZbupRuntimeException
{

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = -5390957884289028849L;

	public SmoException(Result result, Throwable cause)
	  {
	    super(result, cause);
	  }

	  public SmoException(int code, String msg)
	  {
	    super(code, msg);
	  }

	  public SmoException(Result result, String detail)
	  {
	    super(result, detail);
	  }

	  public SmoException(Result result, String detail, Throwable cause)
	  {
	    super(result, detail, cause);
	  }

	  public SmoException(int code, String msg, Throwable cause)
	  {
	    super(code, msg, cause);
	  }

	  public SmoException(int code, Throwable cause)
	  {
	    super(code, cause);
	  }
}
