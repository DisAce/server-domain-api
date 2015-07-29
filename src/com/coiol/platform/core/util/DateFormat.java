/**   
* @Project: PlatFormCore 
* @Title: DateFormat.java 
* @Package com.coiol.platform.core.util 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月17日 下午10:23:07 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * @ClassName DateFormat  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月17日 
 * 
 */
public class DateFormat
{

	public static String getStringCurrentTime(Date date, String formatStr)
	  {
	    SimpleDateFormat formatter = new SimpleDateFormat(formatStr);
	    String dateString = formatter.format(date);
	    return dateString;
	  }

	  public static String getStringCurrentDate()
	  {
	    return getStringCurrentTime(new Date(), "yyyy-MM-dd HH:mm:ss");
	  }

	  public static String getStringCurrentDateShort()
	  {
	    return getStringCurrentTime(new Date(), "yyyy-MM-dd");
	  }

	  public static String getStringCurrentTime()
	  {
	    return getStringCurrentTime(new Date(), "HH:mm:ss");
	  }

	  public static Date strToDateLong(String strDate)
	  {
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    ParsePosition pos = new ParsePosition(0);
	    Date strtodate = formatter.parse(strDate, pos);
	    return strtodate;
	  }

	  public static Date getNow()
	  {
	    Date currentTime = new Date();
	    return currentTime;
	  }
}
