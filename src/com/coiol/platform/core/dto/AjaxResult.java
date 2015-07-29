/**   
* @Project: PlatFormCore 
* @Title: AjaxResult.java 
* @Package com.coiol.platform.core.dto 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:24:15 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.dto;

import org.springframework.stereotype.Component;

/** 
 * @ClassName AjaxResult  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
@Component
public class AjaxResult
{
	boolean isSuccess;
	  Object resultContent;

	  public boolean isSuccess()
	  {
	    return this.isSuccess;
	  }

	  public void setSuccess(boolean isSuccess)
	  {
	    this.isSuccess = isSuccess;
	  }

	  public Object getResultContent()
	  {
	    return this.resultContent;
	  }

	  public void setResultContent(Object resultContent)
	  {
	    this.resultContent = resultContent;
	  }

	  public void success()
	  {
	    setSuccess(true);
	  }

	  public void fail()
	  {
	    setSuccess(false);
	  }

}
