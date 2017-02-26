package com.ucloudlink.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorNext 
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		
		list.add("123");
		list.add("222");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.remove();
		}
		
		System.out.println(list.size());
		
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("123", "123");
		
		Iterator<Entry<String, String>> mapIt = map.entrySet().iterator();
		
		while(mapIt.hasNext())
		{
			System.out.println(mapIt.next().getValue());
		}
		
		for(Entry<String, String> entry:map.entrySet())
		{
			System.out.println(entry.getValue());
		}
	}

}
