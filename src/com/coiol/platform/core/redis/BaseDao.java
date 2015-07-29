/**   
* @Project: PlatFormCore 
* @Title: BaseDao.java 
* @Package com.coiol.platform.core.redis 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月26日 上午10:04:51 
* @Copyright: 2015  
* @version V1.0 
 */
package com.coiol.platform.core.redis;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

/** 
 * @ClassName BaseDao  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月26日 
 * 
 */
public class BaseDao
{
	 @Resource
	  protected RedisTemplate<Serializable, Serializable> redisTemplate;

	  public void save(final String key, final String value)
	  {
	    this.redisTemplate.execute(new RedisCallback<Object>()
	    {

		public Object doInRedis(RedisConnection connection) throws DataAccessException {
	        connection.set(BaseDao.this.redisTemplate.getStringSerializer().serialize(key), 
	          BaseDao.this.redisTemplate.getStringSerializer().serialize(value));
			return connection;
	      }
	    });
	  }

	  public String getByKey(final String key)
	  {
	    return (String)this.redisTemplate.execute(new RedisCallback<String>()
	    {
	      public String doInRedis(RedisConnection connection) throws DataAccessException {
	        byte[] tmpkey = BaseDao.this.redisTemplate.getStringSerializer().serialize(key);
	        if (connection.exists(tmpkey).booleanValue()) {
	          byte[] value = connection.get(tmpkey);
	          String str = (String)BaseDao.this.redisTemplate.getStringSerializer().deserialize(value);
	          return str;
	        }
	        return null;
	      }
	    });
	  }

	  public void deleteByKey(final String keyPattern)
	  {
	    this.redisTemplate.execute(new RedisCallback<String>()
	    {
	      public String doInRedis(RedisConnection connection) {
	        connection.del(new byte[][] { BaseDao.this.redisTemplate.getStringSerializer().serialize(keyPattern) });
	        return null;
	      }
	    });
	  }

	  public void delAllKey()
	  {
	    deleteByKey("*");
	  }

	  @SuppressWarnings("unchecked")
	public Set<String> getKeys(final String keyPattern)
	  {
	    return (Set)this.redisTemplate.execute(new RedisCallback<Object>()
	    {
	      public Object doInRedis(RedisConnection connection)
	        throws DataAccessException
	      {
	    	@SuppressWarnings("rawtypes")
	        Set setStr = new HashSet();

	        @SuppressWarnings("rawtypes")
			Set set = connection.keys(BaseDao.this.redisTemplate.getStringSerializer().serialize(keyPattern));

	        @SuppressWarnings("rawtypes")
			Iterator it = set.iterator();
	        while (it.hasNext()) {
	          setStr.add((String)BaseDao.this.redisTemplate.getStringSerializer().deserialize((byte[])it.next()));
	        }

	        return setStr;
	      }
	    });
	  }

	  public Set<String> getAllKeys()
	  {
	    return getKeys("*");
	  }
}
