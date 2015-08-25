/**   
* @Project: PlatFormCore 
* @Title: DataSourceSwitch.java 
* @Package com.coiol.platform.core.util 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月17日 下午10:20:47 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.util;

/** 
 * @ClassName DataSourceSwitch  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月17日 
 * 
 */
public class DataSourceSwitch
{

	  private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	  public static void setDataSourceType(String dataSourceType) {
	    contextHolder.set(dataSourceType);
	  }

	  public static String getDataSourceType() {
	    return (String)contextHolder.get();
	  }

	  public static void clearDataSourceType() {
	    contextHolder.remove();
	  }
}
