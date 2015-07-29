/**   
* @Project: PlatFormCore 
* @Title: Annotation.java 
* @Package com.coiol.platform.core.authority.annotation 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:27:47 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.authority.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @ClassName Annotation  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
@Target({java.lang.annotation.ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Authority
{
  public abstract String value();

  public abstract String dataSource();
}
