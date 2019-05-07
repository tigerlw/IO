package com.ucloudlink.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class NioCopyFile {
	
	public static void main(String args[])
	{
		String sourcePath = "D:\\learning\\leaning-repository\\IO\\io.txt";
		String destPath = "D:\\learning\\leaning-repository\\IO\\io_nio_cp.txt";
		
		if(args.length>=2)
		{
			sourcePath = args[0];
			destPath = args[1];
		}
		
		File sourceFile = new File(sourcePath);
		File destFile = new File(destPath);
		
		FileChannel sourceCh = null;
		FileChannel destCh = null;
		
		/*if(destFile.exists())
		{
			destFile.delete();
		}*/
		
		try {
			
			long wasteTime = System.currentTimeMillis();
			
			sourceCh = new FileInputStream(sourceFile).getChannel();
			destCh = new FileOutputStream(destFile).getChannel();
			
			destCh.transferFrom(sourceCh, 0, sourceCh.size());
			
			System.out.println("wasteTime:"+(System.currentTimeMillis() - wasteTime));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			
			
			try {
				sourceCh.close();
				destCh.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
