/**   
* @Project: PlatFormCore 
* @Title: LogContext.java 
* @Package com.coiol.platform.core.log 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月17日 下午10:11:57 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.log;

import java.io.Serializable;

/** 
 * @ClassName LogContext  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月17日 
 * 
 */
public class LogContext implements Serializable
{

	/**  
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = -5988465968575601608L;

	
	 private String staff;
	  private boolean logSwitch;

	  public LogContext(String staff, boolean logSwitch)
	  {
	    this.staff = staff;
	    this.logSwitch = logSwitch;
	  }

	  public String getStaff() {
	    return this.staff;
	  }

	  public void setStaff(String staff) {
	    this.staff = staff;
	  }

	  public boolean getLogSwitch()
	  {
	    return this.logSwitch;
	  }

	  public void setLogSwitch(boolean logSwitch) {
	    this.logSwitch = logSwitch;
	  }
}
