package com.ucloudlink.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamCopyFile 
{
	public static void main(String args[])
	{
		
		String sourcePath = "D:\\learning\\leaning-repository\\IO\\io.txt";
		String destPath = "D:\\learning\\leaning-repository\\IO\\io_stream_cp.txt";
		
		if(args.length>=2)
		{
			sourcePath = args[0];
			destPath = args[1];
		}
		
		File destFile = new File(destPath);
		
		if(destFile.exists())
		{
			destFile.delete();
		}
		

		InputStream inputStream = null;
		OutputStream outputStream = null;
		
		long wasteTime = System.currentTimeMillis();
		
		try {
			inputStream = new BufferedInputStream(new FileInputStream(new File(sourcePath)));
			outputStream = new BufferedOutputStream(new FileOutputStream(new File(destPath), true));
			
			byte[] byteAarry = new byte[512];
			
			while(inputStream.read(byteAarry)!=-1)
			{
				outputStream.write(byteAarry);
				
			}
			
			System.out.println("wasteTime:"+(System.currentTimeMillis() - wasteTime));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			try {
				inputStream.close();
				outputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
