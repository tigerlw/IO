package com.ucloudlink.redis;

import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;
import redis.clients.util.Hashing;
import redis.clients.util.Sharded;

public class ShareJedisPoolMain 
{
	public static void main(String args[])
	{
		JedisPoolConfig config = new JedisPoolConfig();// Jedis池配置
		config.setMaxTotal(500);// 最大活动的对象个数
		config.setMaxIdle(1000 * 60);// 对象最大空闲时间
		config.setMaxWaitMillis(1000 * 10);// 获取对象时最大等待时间
		config.setTestOnBorrow(true);
		
		List<JedisShardInfo> jdsInfoList =new ArrayList<JedisShardInfo>(2);
		
		JedisShardInfo jedisA = new JedisShardInfo("127.0.0.1",6379);
		JedisShardInfo jedisB = new JedisShardInfo("127.0.0.1",6378);
		
		jdsInfoList.add(jedisA);
		jdsInfoList.add(jedisB);
		
		ShardedJedisPool pool = new ShardedJedisPool(config, jdsInfoList, Hashing.MURMUR_HASH,
				Sharded.DEFAULT_KEY_TAG_PATTERN);
		
		ShardedJedis jds = pool.getResource();
		
		jds.hset("test","liuwei4", "123");
		
		String result = jds.hget("test","liuwei4");
		
		System.out.println(result);
	}

}
