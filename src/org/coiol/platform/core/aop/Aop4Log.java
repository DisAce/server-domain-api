/**   
* @Project: PlatFormCore 
* @Title: Aop4Log.java 
* @Package com.coiol.platform.core.aop 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月17日 下午10:04:32 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.aop;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.coiol.platform.core.log.PlatFormLogger;
import org.coiol.platform.core.log.PlatFormLoggerFactory;
import org.coiol.platform.core.util.DateFormat;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/** 
 * @ClassName Aop4Log  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月17日 
 * 
 */
public class Aop4Log
{

	private static final PlatFormLogger log = PlatFormLoggerFactory.getPlatFormLogger(Aop4Log.class);

	  public Object doRunOnRound(ProceedingJoinPoint point)
	    throws Throwable
	  {
	    HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes())
	      .getRequest();

	    HttpSession session = request.getSession();
	    String userAccountName = (String)session.getAttribute("userAccountName");

	    @SuppressWarnings("rawtypes")
		Class clazz = point.getTarget().getClass();
	    Date start = new Date();
	    log.debug("----" + userAccountName + "于" + DateFormat.getStringCurrentTime(start, "yyyy-MM-dd HH:mm:ss") + 
	      "调用类：[" + clazz + "]，方法：" + point.getSignature().getName(), new Object[0]);
	    Object object = point.proceed();
	    Date end = new Date();
	    log.debug("----" + userAccountName + "于" + DateFormat.getStringCurrentTime(end, "yyyy-MM-dd HH:mm:ss") + 
	      "调用类：[" + clazz + "]，方法：" + point.getSignature().getName() + "完成", new Object[0]);
	    log.debug("----" + userAccountName + "于" + DateFormat.getStringCurrentTime(start, "yyyy-MM-dd HH:mm:ss") + "到" + 
	      DateFormat.getStringCurrentTime(end, "yyyy-MM-dd HH:mm:ss") + "执行类：[" + clazz + "]，方法：" + 
	      point.getSignature().getName() + "耗时" + (end.getTime() - start.getTime()) + "毫秒", new Object[0]);
	    return object;
	  }
}
