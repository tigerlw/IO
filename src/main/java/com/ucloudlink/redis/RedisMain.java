package com.ucloudlink.redis;

import java.util.ArrayList;
import java.util.List;

import com.ucloudlink.redis.domain.LimitLevel;
import com.ucloudlink.redis.domain.LimitLevelRe;

public class RedisMain 
{
	public static void main(String args[])
	{
		CacheDataDao cache = new RedisBaseDao();
		
	/*	cache.setDataByOneKey("mytest", 123);
		
		Integer result = cache.getDataByOneKey("mytest", Integer.class);*/
		
		//System.out.println(result);
	/*	
		List<LimitLevel> limitLevelList = new ArrayList<LimitLevel>();
		
		LimitLevel limitLevel1 = new LimitLevel();
		limitLevel1.setUserName("liuwei1");
		limitLevel1.setPwd("123456");
		limitLevel1.setContent("test");
		limitLevel1.setIsDisplay(1);
		
		
		LimitLevel limitLevel2 = new LimitLevel();
		limitLevel2.setUserName("liuwei2");
		limitLevel2.setPwd("123456");
		limitLevel2.setContent("test");
		limitLevel2.setIsDisplay(1);
		
		limitLevelList.add(limitLevel1);
		limitLevelList.add(limitLevel2);
		
		cache.setDataByKey("limit_level", "123", limitLevelList);
		
		List<LimitLevelRe> limitLevelListRe = cache.getListDataByKey("limit_level", "123", LimitLevelRe.class);
		
		System.out.println(limitLevelList);*/
		
		
		List<LimitLevelRe> limitLevelList = new ArrayList<LimitLevelRe>();
		
		LimitLevelRe limitLevel1 = new LimitLevelRe();
		limitLevel1.setUserName("liuwei1");
		limitLevel1.setPwd("123456");
		limitLevel1.setContent("test");
	
		
		
		LimitLevelRe limitLevel2 = new LimitLevelRe();
		limitLevel2.setUserName("liuwei2");
		limitLevel2.setPwd("123456");
		limitLevel2.setContent("test");

		
		limitLevelList.add(limitLevel1);
		limitLevelList.add(limitLevel2);
		
		cache.setDataByKey("limit_level", "123", limitLevelList);
		
		List<LimitLevel> limitLevelListRe = cache.getListDataByKey("limit_level", "123", LimitLevel.class);
		
		System.out.println(limitLevelList);
		
		
	}

}
