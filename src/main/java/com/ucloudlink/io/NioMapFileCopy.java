package com.ucloudlink.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class NioMapFileCopy 
{
	public static void main(String args[])
	{
		String sourcePath = "D:\\learning\\leaning-repository\\IO\\io.txt";
		String destPath = "D:\\learning\\leaning-repository\\IO\\io_map_cp.txt";
		
		File destFile = new File(destPath);
		
		if(!destFile.exists())
		{
			try {
				destFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileChannel sourceCh = null;
		FileChannel destCh = null;
		
		MappedByteBuffer mbb = null;
		
		long wasteTime = System.currentTimeMillis();
		
		try
		{
			
			sourceCh = new FileInputStream(sourcePath).getChannel();
			destCh = new FileOutputStream(destPath).getChannel();
			
			mbb = sourceCh.map(FileChannel.MapMode.READ_ONLY, 0, sourceCh.size());
			destCh.write(mbb);
			
			System.out.println("wasteTime:"+ (System.currentTimeMillis() - wasteTime));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				sourceCh.close();
				destCh.close();
			} catch (Exception e) {

			}
		}
	}

}
