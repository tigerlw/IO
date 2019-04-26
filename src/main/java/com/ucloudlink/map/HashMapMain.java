package com.ucloudlink.map;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class HashMapMain 
{
	public static void main(String args[])
	{
		int DEFAULT_INITIAL_CAPACITY = 1 << 4;
		
		int MAXIMUM_CAPACITY = 1 << 30;
		
		System.out.println(DEFAULT_INITIAL_CAPACITY);
		
		System.out.println(MAXIMUM_CAPACITY);
		
		SimpleDateFormat dateFromat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		dateFromat.setTimeZone(TimeZone.getTimeZone("GMT+5:10"));
		
		String beginStr = dateFromat.format(new Date());
		
		
		System.out.println(beginStr);
	}

}
