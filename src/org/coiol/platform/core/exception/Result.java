/**   
* @Project: PlatFormCore 
* @Title: Result.java 
* @Package com.coiol.platform.core.exception 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:13:05 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.exception;

import java.io.Serializable;

/** 
 * @ClassName Result  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class Result implements Serializable
{

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 4854178405810562071L;

	public static final Result ZBUP_SUCCESS = new Result(0, "成功");
	  public static final Result ZBUP_SYS_ERROR = new Result(-9999, "系统错误");

	  private int code = 0;
	  private String msg = "成功";

	  public Result(int code, String msg)
	  {
	    this.code = code;
	    this.msg = msg;
	  }

	  public Result(Result result) {
	    this.code = result.getCode();
	    this.msg = result.getMsg();
	  }

	  public int getCode() {
	    return this.code;
	  }

	  public void setCode(int code) {
	    this.code = code;
	  }

	  public String getMsg() {
	    return this.msg;
	  }

	  public void setMsg(String msg) {
	    this.msg = msg;
	  }

	  public boolean equals(Object r)
	  {
	    boolean b = false;
	    if ((r instanceof Result)) {
	      if (getCode() == ((Result)r).getCode())
	        b = true;
	      else
	        b = false;
	    }
	    else b = super.equals(r);
	    return b;
	  }

	  public int hashCode()
	  {
	    return super.hashCode();
	  }

	  public String toString()
	  {
	    StringBuilder sb = new StringBuilder();
	    sb.append("<code>");
	    sb.append(getCode());
	    sb.append("</code>");
	    sb.append("<msg>");
	    sb.append(getMsg());
	    sb.append("</msg>");
	    return sb.toString();
	  }
}
