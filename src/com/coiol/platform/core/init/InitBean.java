/**   
* @Project: PlatFormCore 
* @Title: InitBean.java 
* @Package com.coiol.platform.core.init 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:08:55 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.init;

import java.util.Map;

/** 
 * @ClassName InitBean  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public abstract interface InitBean
{
  public abstract Map<String, Object> toMap();
}
