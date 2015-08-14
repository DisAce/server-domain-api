/**   
* @Project: PlatFormCore 
* @Title: AuthorityMethod.java 
* @Package com.coiol.platform.core.authority.annotation 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 下午8:40:50 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.authority.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @ClassName AuthorityMethod  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
@Target({java.lang.annotation.ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AuthorityMethod
{
  public abstract String value();

  public abstract String dataSource();
}