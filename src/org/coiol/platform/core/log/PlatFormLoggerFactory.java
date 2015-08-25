/**
 * 
 * PlatForm - Application Product Development Platform
 * Copyright (c) 2015, master@coiol.com
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package org.coiol.platform.core.log;

import java.util.HashMap;
import java.util.Map;

/**
 *日志输出支持多国语言切换解决方案工厂类
 * @author master@coiol.com
 */
public class PlatFormLoggerFactory {
    private static final Map<Class<?>,PlatFormLogger> CACHE = new HashMap<Class<?>,PlatFormLogger>();
    
    private PlatFormLoggerFactory() {
    }

    public static PlatFormLogger getPlatFormLogger(Class<?> clazz) {
    	
        PlatFormLogger log = CACHE.get(clazz);

        if(log == null){
            synchronized(clazz) {
				if (!CACHE.containsKey(clazz)) {
                    log = new PlatFormLoggerImpl(clazz);
                    CACHE.put(clazz, log);
                }else{
                    log = CACHE.get(clazz);
                }
            }
        }
        return log;
    }
}
