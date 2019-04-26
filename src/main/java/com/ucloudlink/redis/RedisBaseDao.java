package com.ucloudlink.redis;


import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ucloudlink.utils.SerializeUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

//import com.ucloudlink.ocs.common.logger.Logger;
//import com.ucloudlink.ocs.common.logger.LoggerFactory;
//import com.ucloudlink.utils.SerializeUtil;
//import com.ucloudlink.ocs.data.cache.CacheDataDao;

/**
 * Redis 缓存类     单节点
 * @author liuwei
 *
 * @param <T>
 */
public class RedisBaseDao implements CacheDataDao
{

	//private static Logger logger = LoggerFactory.getLogger(RedisBaseDao.class);
	private static RedisConnectionUitl redisUtil = new RedisConnectionUitl(0);
	
	
	
	//@Override
	public <T> T getDataByKey(String primKey, String dataKey,Class<T> entityClass)
	{
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			T result = null;
			try {
				String data = jedis.hget(primKey, dataKey);
				if(data != null){
					result = SerializeUtil.jsonUnSerialize(data, entityClass);
				}
			} catch (Exception e) {
				//logger.error(e);
			}
			return result;
		} catch (Exception e) {
			//logger.error(e);
		} finally {
			redisUtil.releaseJedis(jedis);
		}
		return null;

	}
	
	//@Override
	public <T> List<T> getListDataByKey(String primKey, String dataKey,Class<T> entityClass)
	{
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			List<Object> dataList = null;
			List<T> result = new ArrayList<T>();
			String temp = null ;
			try
			{
				
				String data = jedis.hget(primKey, dataKey);
				//result = JSON.parseObject(data,entityClass);
				dataList = SerializeUtil.jsonUnSerialize(data,List.class);
				
				if(dataList == null)
				{
					//logger.error("the cache data isn't list!primKey:{};dataKey:{}",primKey,dataKey);
					return null;
				}
				
				for (Object obj : dataList)
				{
					temp = obj.toString();
				/*	temp = temp.replace("=", "\":\"");
					temp = temp.replace("{", "{\"");
					temp = temp.replace("}", "\"}");
					temp = temp.replace(",", "\",\"").replace(" ", "").replace("\"{", "{")
							.replace("}\"", "}").replace("\"[", "[").replace("]\"", "]")
							.replace("\"null\"", "null");*/
					result.add(SerializeUtil.jsonUnSerialize(temp.trim(), entityClass));
				}

			} catch (Exception e)
			{
				//logger.error(e.toString());
				
			}
		
			
			return result;
		} catch (Exception e) {
			//logger.error(e);
		} finally {
			redisUtil.releaseJedis(jedis);
		}
		return null;

	}
	
	//@Override
	public <T> List<T> batchGetData(String primKey,Class<T> entityClass)
	{
		Jedis jedis = null;
		try {
			List<T> result = new ArrayList<T>();
			// Jedis jedis = redisUtil.getJedis();
			jedis = redisUtil.getJedis();
			Map<String, String> cachMap = jedis.hgetAll(primKey);
			for (Entry<String, String> temp : cachMap.entrySet()) {
				result.add(SerializeUtil.jsonUnSerialize(temp.getValue(),
						entityClass));
			}
			return result;
		} catch (Exception e) {
			//logger.error(e);
		}finally {
			redisUtil.releaseJedis(jedis);
		}
		return null;
	}

	//@Override
	public <T> void setDataByKey(String primKey, String dataKey, T cacheData)
	{
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			String dataJson = SerializeUtil.jsonSerialize(cacheData);
			jedis.hset(primKey, dataKey, dataJson);
		} catch (Exception e) {
			//logger.error(e);
		} finally {
			redisUtil.releaseJedis(jedis);
		}

	}
	
	//@Override
	
	public <K,T> void batchSetData(String primKey, Map<K, T> cacheData){
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			Map<String, String> cacheMap = new HashMap<String, String>();
			for (Entry<K, T> temp : cacheData.entrySet()) {
				if (temp.getValue() != null) {
					cacheMap.put(temp.getKey().toString(),
							SerializeUtil.jsonSerialize(temp.getValue()));
				}
			}
			jedis.hmset(primKey, cacheMap);

		} catch (Exception e) {
			//logger.error(e.toString());
		} finally {
			redisUtil.releaseJedis(jedis);
		}
	}
	
	//@Override
	public void deleteDataByKey(String primKey,  String ...dataKey){
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			if (dataKey == null || dataKey.length == 0) {
				jedis.del(primKey);
			} else {
				jedis.hdel(primKey, dataKey);
			}
		} catch (Exception e) {
			//logger.error(e.toString());
		} finally {
			redisUtil.releaseJedis(jedis);
		}
	}
	
	public Map<String, String> getDataMap(String primaryKey){
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			Map<String, String> datamap = new HashMap<String, String>();
			datamap = jedis.hgetAll(primaryKey);
			return datamap;
		} catch (Exception e) {
			//logger.error(e.toString());
		}
		redisUtil.releaseJedis(jedis);
		return null;
	}
	
	
	public  String serialize(Object object)
	{
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		try
		{
			
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			String bytes = baos.toString();
			return bytes;
		} catch (Exception e)
		{
			//logger.error(e.toString());
		}
		return null;
	}
	
	/*public static <T> T unserialize(byte[] bytes,Class<T> entityClass)
	{
		ByteArrayInputStream bais = null;
		try
		{
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return  (T) ois.readObject();
		} catch (Exception e)
		{
			logger.error(e.toString());
		}
		return null;
	}*/

	//@Override
	public String getStringValueByKey(String primKey, String dataKey) {
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			return jedis.hget(primKey, dataKey);
		} catch (Exception e) {
			//logger.error(e);
		}finally{
			redisUtil.releaseJedis(jedis);
		}
		return null;
	}

	//@Override
	public Set<String> getMapKeysByPrimKey(String primKey) {
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			return jedis.hkeys(primKey);
		} catch (Exception e) {
			//logger.error(e);
		}finally{
			redisUtil.releaseJedis(jedis);
		}
		return null;
	}

	//@Override
	public void deleteKey(String primKey) {
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			jedis.del(primKey);
		} catch (Exception e) {
			//logger.error(e);
		}finally{
			redisUtil.releaseJedis(jedis);
		}
	}

	//@Override
	public void zAddValueByKey(String primKey, String value, double score) {
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			jedis.zadd(primKey, score, value);
		
		} catch (Exception e) {
			//logger.error(e);
		}finally{
			redisUtil.releaseJedis(jedis);
		}
	}

	//@Override
	public void zRemoveValueByKey(String primKey, String key) {
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			jedis.zrem(primKey, key);
		} catch (Exception e) {
			//logger.error(e);
		}finally{
			redisUtil.releaseJedis(jedis);
		}
	}
	
	//@Override
	public void zRemoveValueByKeys(String primKey, String[] keys) {
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			jedis.zrem(primKey, keys);
		} catch (Exception e) {
			//logger.error(e);
		}finally{
			redisUtil.releaseJedis(jedis);
		}
	}

	//@Override
	public long zCard(String primKey) {
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			return jedis.zcard(primKey);
		} catch (Exception e) {
			//logger.error(e);
		}finally{
			redisUtil.releaseJedis(jedis);
		}
		return 0;
	}

	//@Override
	public Set<String> zRevRangeByScore(String key, double max, double min) {
		Jedis jedis = null;
		try {
			jedis = redisUtil.getJedis();
			return jedis.zrevrangeByScore(key, max, min);	
		} catch (Exception e) {
			//logger.error(e);
		}finally{
			redisUtil.releaseJedis(jedis);
		}
		return null;
	}

	//@Override
	public void zAddValueByMap(String primKey, Map<String, Double> valueMap) {
		Jedis jedis = null ;
		try {
			jedis = redisUtil.getJedis();
			jedis.zadd(primKey, valueMap);
		} catch (Exception e) {
			//logger.error(e);
		}finally{
			redisUtil.releaseJedis(jedis);
		}
	}

	//@Override
	public <T> T getDataByOneKey(String primKey,Class<T> entityClass) 
	{
		// TODO Auto-generated method stub
		Jedis jedis = null;
		
		jedis = redisUtil.getJedis();
		
		String data = jedis.get(primKey);
		
		T result = SerializeUtil.jsonUnSerialize(data, entityClass);
		
		return result;
	}

	//@Override
	public <T> void setDataByOneKey(String primKey, T cacheData) 
	{
		// TODO Auto-generated method stub
		
        Jedis jedis = null;
		
		jedis = redisUtil.getJedis();
		
		String data = SerializeUtil.jsonSerialize(cacheData);
		
		jedis.watch(primKey);
		
		
		
		Transaction tran = jedis.multi();
		
		tran.set(primKey, data);
		//tran.expire(primKey, 300);
		
		
		List<Object> result = tran.exec();
		 
		System.out.println(result.size());
		
		return ;
	}

	
}
