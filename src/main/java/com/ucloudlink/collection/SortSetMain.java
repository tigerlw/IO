package com.ucloudlink.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortSetMain 
{
	public static void main(String args[])
	{
		SortedSet<String> sortedTreeSet = new TreeSet<String>();
		
		sortedTreeSet.add("aa");
		sortedTreeSet.add("bb");
		sortedTreeSet.add("cc");
		sortedTreeSet.add("dd");
		
		
		System.out.println(sortedTreeSet.size());
		
	}

}
