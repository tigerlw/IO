package com.ucloudlink.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioFileAccess 
{
	public static void main(String args[])
	{
		String path = "D:\\learning\\leaning-repository\\IO\\io2.txt";
		
		RandomAccessFile file = null;
		FileChannel channel = null;
		
		try {
			
			file = new RandomAccessFile(path,"rw");
			
			channel = file.getChannel();
			
			ByteBuffer buffer = ByteBuffer.allocate(48);
			
			for(int i=0;i<100000*1000;i++)
			{
				buffer.clear();
				buffer.put("test========= \n".getBytes("utf8"));
				buffer.flip();

				while (buffer.hasRemaining()) {
					channel.write(buffer);
				}
			}
			
			//channel.force(true);
			
			/*buffer.clear();
			
			while(channel.read(buffer)!=-1)
			{
				buffer.flip();
				
				while(buffer.hasRemaining())
				{
					System.out.print((char)buffer.get()); 
				}
				
				buffer.clear();
			}*/
			
			System.out.println("success==============");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally
		{
			try {
				file.close();
				channel.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
