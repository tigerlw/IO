package com.ucloudlink.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest 
{
	public static void main(String args[])
	{
		Map<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < 1000; i++) {
			map.put(String.valueOf(i), "liuwei");
		}

		System.out.println(map.get("1"));
	}

}
