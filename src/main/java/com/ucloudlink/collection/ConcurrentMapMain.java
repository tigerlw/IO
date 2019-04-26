package com.ucloudlink.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapMain {
	
	public static void main(String args[])
	{
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("c", 3);
		hashMap.put("a", 2);
		hashMap.put("b", 1);
		hashMap.put("d", 4);
		List<Map.Entry<String, Integer>> hashList = new ArrayList<Map.Entry<String, Integer>>(hashMap.entrySet());
		Collections.sort(hashList, new Comparator<Map.Entry<String, Integer>>() {
			// 升序排序
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		
		for (Map.Entry<String, Integer> m : hashList) 
		{
			System.out.println("Key=" + m.getKey() + ", Value=" + m.getValue());
		}
		
		String msg ="01,03INCO,GCGROUP01,MajesticFi01,CMI01,YROAM01,BJXW01,SIMLOCAL01,EPartner01,LC01,GWI01,TestMvno01,CTExcel01,DSDS,DSDSMVNO,DHI,G2V,UPartner,r11P6,0Y727,n3E7m,6y75R,37j7d,UsY2O,y588U,jYGgf,8q011,eg1I8,74196";
		
		System.out.println(msg.length());

	}

}
