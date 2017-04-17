package com.ucloudlink.redis;

public class RedisMain 
{
	public static void main(String args[])
	{
		CacheDataDao cache = new RedisBaseDao();
		
		cache.setDataByOneKey("mytest", 123);
		
		Integer result = cache.getDataByOneKey("mytest", Integer.class);
		
		System.out.println(result);
	}

}
