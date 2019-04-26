package com.ucloudlink.mapdb;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;

/*import org.mapdb.DB;
import org.mapdb.DBMaker;
*/
public class MapDBMain 
{
	public static void  main(String args[])
	{/*
		DB db = DBMaker.memoryDB().make();
		ConcurrentMap<String, String> map = (ConcurrentMap<String, String>) db.hashMap("map").create();
		map.put("something", "here");
		map.put("something2", "here2");
		//String result = (String) map.get("something");
		
		DB dbfile = DBMaker.fileDB("file2.db").make();
		ConcurrentMap<String, String> mapfile = (ConcurrentMap<String, String>) dbfile.hashMap("map").createOrOpen();
		
		
		//mapfile.putAll(map);
		
		map.putAll(mapfile);
		
		dbfile.close();
		
		for(Entry<String,String> entry:map.entrySet())
		{
			System.out.println(entry.getValue());
		}
		
		
		//System.out.println(result);
	*/}

}
