package com.ucloudlink.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;

public class NioSelect {
	
	public static void main(String args[])
	{
		String path = "D:\\learning\\leaning-repository\\IO\\io.txt";

		RandomAccessFile file = null;
		FileChannel channel = null;
		
		try {
			
			final Selector selector = Selector.open();
			file = new RandomAccessFile(path, "rw");

			channel = file.getChannel();
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
