/**   
* @Project: PlatFormCore 
* @Title: DaoException.java 
* @Package com.coiol.platform.core.exception 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:14:28 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.exception;

/** 
 * @ClassName DaoException  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class DaoException extends ZbupRuntimeException
{

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = -49194618555448889L;

	 public DaoException(Result result, Throwable cause)
	  {
	    super(result, cause);
	  }

	  public DaoException(int code, String msg)
	  {
	    super(code, msg);
	  }

	  public DaoException(Result result, String detail)
	  {
	    super(result, detail);
	  }

	  public DaoException(Result result, String detail, Throwable cause)
	  {
	    super(result, detail, cause);
	  }

	  public DaoException(int code, String msg, Throwable cause)
	  {
	    super(code, msg, cause);
	  }

	  public DaoException(int code, Throwable cause)
	  {
	    super(code, cause);
	  }
}
