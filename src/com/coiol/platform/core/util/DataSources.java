/**   
* @Project: PlatFormCore 
* @Title: DataSources.java 
* @Package com.coiol.platform.core.util 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月17日 下午10:21:12 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.coiol.platform.core.log.PlatFormLogger;
import com.coiol.platform.core.log.PlatFormLoggerFactory;
import com.coiol.platform.core.sqlParser.SqlExcutePlugin;

/** 
 * @ClassName DataSources  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月17日 
 * 
 */
public class DataSources extends AbstractRoutingDataSource
{


	  private static final PlatFormLogger logger = PlatFormLoggerFactory.getPlatFormLogger(DataSources.class);
	  protected Object determineCurrentLookupKey()
	  {
	    this.logger.info("---------------------当前数据源 " + (
	      DataSourceSwitch.getDataSourceType() == null ? "Default" : DataSourceSwitch.getDataSourceType()) + 
	      "----------------------", new Object[0]);
	    return DataSourceSwitch.getDataSourceType();
	  }
}
