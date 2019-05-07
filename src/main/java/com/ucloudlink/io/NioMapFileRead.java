package com.ucloudlink.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class NioMapFileRead {
	
	public static void main(String args[])
	{
		String path = "D:\\learning\\leaning-repository\\IO\\io.txt";
		
	
		FileChannel fileCh = null;
		MappedByteBuffer mbb = null;
		
		long wasteTime = System.currentTimeMillis();
		
		try {
			
			fileCh = new FileInputStream(new File(path)).getChannel();
			
			int length = (int) fileCh.size();
			
			mbb = fileCh.map(FileChannel.MapMode.READ_ONLY, 0, length);
			
			for (int i = 0; i < length; i++) 
			{
				mbb.get(i);
			}
			
			System.out.println("wasteTime:"+ (System.currentTimeMillis() - wasteTime));

		} catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			try {
				fileCh.close();
				//unmap(mbb);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
