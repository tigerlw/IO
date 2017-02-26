package com.ucloudlink.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamTest 
{
	
	public static void main(String args[])
	{
		InputStream inputStream = null;
		OutputStream outputStream = null;
		ByteArrayOutputStream sweepStream = new ByteArrayOutputStream();
		String path = "D:\\learning\\JAVA_DEMO\\io.txt";
		try {
			
			inputStream = new BufferedInputStream(new FileInputStream(new File(path)));
			outputStream = new BufferedOutputStream(new FileOutputStream(new File(path),true));
			
			if(inputStream.available()==0)
			{
				return ;
			}
			
			//byte[] byteAarry = new byte[inputStream.available()];
			/*byte[] byteAarry = new byte[1];
			
			while(inputStream.read(byteAarry)!=-1)
			{
				//System.out.println(new String(byteAarry,"utf8"));
				sweepStream.write(byteAarry);
			}*/
			
			int readInt=0;
			while((readInt=inputStream.read())!=-1)
			{
				sweepStream.write(readInt);
			}
			
			System.out.println(new String(sweepStream.toByteArray(),"utf8"));
			
			/*String outStr="今天";
			
			outputStream.write(outStr.getBytes("utf8"));
			outputStream.flush();*/
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
