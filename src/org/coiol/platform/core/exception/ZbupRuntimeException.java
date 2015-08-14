/**   
* @Project: PlatFormCore 
* @Title: ZbupRuntimeException.java 
* @Package com.coiol.platform.core.exception 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:10:48 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

import org.coiol.platform.core.util.ExceptionUtil;

/** 
 * @ClassName ZbupRuntimeException  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class ZbupRuntimeException extends RuntimeException
{

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = -2941180045028397320L;

	private Result result;

	  public ZbupRuntimeException(Result result, Throwable cause)
	  {
	    super(result.getMsg(), cause);
	    this.result = result;
	  }

	  public ZbupRuntimeException(int code, String msg)
	  {
	    super(msg);
	    this.result = new Result(code, msg);
	  }

	  public ZbupRuntimeException(Result result, String detail)
	  {
	    super(result.getMsg() + "," + detail);
	    this.result = new Result(result.getCode(), result.getMsg() + "," + detail);
	  }

	  public ZbupRuntimeException(Result result, String detail, Throwable cause)
	  {
	    super(result.getMsg() + "," + detail, cause);
	    this.result = new Result(result.getCode(), result.getMsg() + "," + detail);
	  }

	  public ZbupRuntimeException(int code, String msg, Throwable cause)
	  {
	    super(msg, cause);
	    this.result = new Result(code, msg);
	  }

	  public ZbupRuntimeException(int code, Throwable cause)
	  {
	    super(cause);
	    this.result = new Result(code, null);
	  }

	  public String getMessage()
	  {
	    return ExceptionUtil.buildMessage(super.getMessage(), getCause());
	  }

	  public String toXmlString()
	  {
	    StringBuilder sb = new StringBuilder();
	    sb.append("<exception>");

	    if (getResult() != null) {
	      sb.append(this.result.toString());
	    }
	    sb.append("<exceptionTrace>");
	    sb.append(getMessage());
	    sb.append("</exceptionTrace>");

	    sb.append("<exception/>");
	    return sb.toString();
	  }

	  public void printStackTrace(PrintStream ps)
	  {
	    ps.print("<exception>");
	    if (getResult() != null) {
	      ps.print(this.result.toString());
	    }
	    ps.append("<exceptionTrace>");

	    Throwable cause = getCause();
	    if (cause == null) {
	      super.printStackTrace(ps);
	    } else {
	      ps.println(this);
	      ps.print("Caused by: ");
	      cause.printStackTrace(ps);
	    }
	    ps.append("</exceptionTrace>");
	    ps.println("</exception>");
	  }

	  public void printStackTrace(PrintWriter pw)
	  {
	    pw.print("<exception>");
	    if (getResult() != null) {
	      pw.print(this.result.toString());
	    }
	    pw.append("<exceptionTrace>");

	    Throwable cause = getCause();
	    if (cause == null) {
	      super.printStackTrace(pw);
	    } else {
	      pw.println(this);
	      pw.print("Caused by: ");
	      cause.printStackTrace(pw);
	    }
	    pw.append("</exceptionTrace>");
	    pw.println("</exception>");
	  }

	  public Result getResult()
	  {
	    return this.result;
	  }

	  public void setResult(Result result) {
	    this.result = result;
	  }
}
