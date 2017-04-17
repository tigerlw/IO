package com.ucloudlink.redis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

//import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;
import redis.clients.jedis.JedisShardInfo;


/**
 * Redis 链接管理工具类
 * 
 * @author liuwei
 *
 */
public class RedisConnectionUitl
{
	//private static Logger logger = Logger.getLogger(RedisConnectionUitl.class);
	private  JedisPool pool = null;
	private static JedisCluster jedisCluster;
	private JedisSentinelPool sentinelPool;
	private int maxConnection = 500;
	private int connectTimeout = 1; //单位 秒
	
	private int redisMode = REDIS_MODE_SINGLE;
	public static final int REDIS_MODE_SINGLE=0;
	public static final int REDIS_MODE_CLUSTER=1;
	public static final int REDIS_MODE_SENTINE=2;
	
	public RedisConnectionUitl(int redis_mode){
		redisMode = redis_mode;
		switch (redis_mode) {
			case REDIS_MODE_SENTINE:
				initSentinelPool();
				break;
			case REDIS_MODE_SINGLE:
				initJedisPool();
				break;
			case REDIS_MODE_CLUSTER:
				initJedisCluster();
				break;
			default:
				break;
		}
	}
    
	private void initJedisPool(){
		JedisPoolConfig config = initGeneralConfig();
        String[] ipPort = getConnectString().get(0);
        pool = new JedisPool(config, ipPort[0], Integer.parseInt(ipPort[1]));
	}
	
	private JedisPoolConfig initGeneralConfig(){
		Resource resource = new ClassPathResource("META-INF/conf/redis.properties");
		try {
			Properties props = PropertiesLoaderUtils.loadProperties(resource);
			String max_s = props.getProperty("redis.connect.max");
			if(max_s != null && !max_s.trim().isEmpty())
				maxConnection = Integer.parseInt(max_s);
			
			String timeout_s = props.getProperty("redis.connect.timeouot");
			if(timeout_s != null && !timeout_s.trim().isEmpty())
				connectTimeout = Integer.parseInt(timeout_s);
		} catch (Exception e) {
			//logger.equals(e);
		}
		
		JedisPoolConfig config = new JedisPoolConfig();
        //控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；
        //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
        config.setMaxIdle(5);
        config.setMaxTotal(maxConnection);
        //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例。
        //表示当borrow(引入)一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException；
        config.setMaxWaitMillis(1000 * connectTimeout);
        //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
        config.setTestOnBorrow(true);
        return config;
	}
	
	/**
	 * 初始化cluster
	 */
	private void initJedisCluster(){
		JedisPoolConfig config = initGeneralConfig();
		List<String[]> connections = getConnectString();
		List<JedisShardInfo> shards = new ArrayList<JedisShardInfo>();
		Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		
		for(String[] connect:connections)
		{
		  shards.add(new JedisShardInfo(connect[0], Integer.valueOf(connect[1])));
		  jedisClusterNodes.add(new HostAndPort(connect[0], Integer.valueOf(connect[1])));
		}
		jedisCluster = new JedisCluster(jedisClusterNodes,2000,6,config);
	}
	
	public JedisCluster getJedisCluster()
	{
		return jedisCluster;
	}
	
	/**
	 * 初始化哨兵 jedis
	 * @return
	 */
	private void initSentinelPool(){
		JedisPoolConfig config = initGeneralConfig();
		Set<String> sentinels = new HashSet<String>();
		List<String> ipPorts = getConnectString4Sentinel();
		for (String ipPort : ipPorts) {
			sentinels.add(ipPort);
		}
        sentinelPool = new JedisSentinelPool("redisMaster", sentinels,config);
	}
	
	private List<String> getConnectString4Sentinel(){
		Resource resource = new ClassPathResource("META-INF/conf/redis.properties");
		List<String> connectStr = new ArrayList<String>();
		try
		{
			Properties props = PropertiesLoaderUtils.loadProperties(resource);
			String connections = props.getProperty("redis.connect");
			connectStr = Arrays.asList(connections.split(","));
			return connectStr;
		} catch (Exception e){
			//logger.error(e);
		}
		return connectStr;
	}
	
	private List<String[]> getConnectString()
	{
		Resource resource = new ClassPathResource("META-INF/conf/redis.properties");
		List<String> connectStr = new ArrayList<String>();
		List<String[]> result = new ArrayList<String[]>();
		String [] connectAddr = null ;
		try
		{
			Properties props = PropertiesLoaderUtils.loadProperties(resource);
			String connections = props.getProperty("redis.connect");
			connectStr = Arrays.asList(connections.split(","));
			for (String tmp : connectStr)
			{
				connectAddr = tmp.split(":");
				if(connectAddr.length == 2)
				{
					result.add(connectAddr);
				}
			}
		} catch (Exception e){
			//logger.error(e);
		}
		return result;
	}
	
    /**
     * 返还到连接池
     * 
     * @param pool 
     * @param redis
     */
	public  void releaseJedis(Jedis redis) {
        if (redis != null) {
        	if(redisMode==REDIS_MODE_SENTINE)
    			sentinelPool.returnResource(redis);
    		else if(redisMode == REDIS_MODE_SINGLE)
    			pool.returnResource(redis);
        }
    }
    
	/**
	 * 获取jedis 链接
	 * @return
	 */
	public Jedis getJedis()
	{
		if(redisMode==REDIS_MODE_SENTINE)
			return sentinelPool.getResource();
		else if(redisMode == REDIS_MODE_SINGLE)
			return pool.getResource();
		else 
			return null;
	}
}
