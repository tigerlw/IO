package com.ucloudlink.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioFileReadEx 
{
   public static void main(String args[]) throws Exception
   {
	   int bufSize = 1000;
	   
	   String path = "D:\\logs\\new\\app-01-09-2018-67.log";
	   //String path = "D:\\learning\\leaning-repository\\spring-boot\\msg\\2018-01\\app-01-15-2018-1.log";
	   
	   File fin = new File(path); 
	   
	   FileChannel fcin = new RandomAccessFile(fin, "r").getChannel();  
	   ByteBuffer rBuffer = ByteBuffer.allocate(bufSize);  
	   
	   String enterStr = "\n"; 
	   
	   byte[] bs = new byte[bufSize]; 
	    
	   StringBuffer strBuf = new StringBuffer("");
	 
	   
		while (fcin.read(rBuffer) != -1) 
		{
			int rSize = rBuffer.position();
			rBuffer.rewind();
			rBuffer.get(bs);
			rBuffer.clear();
			String tempString = new String(bs, 0, rSize);
			

			int fromIndex = 0;
			int endIndex = 0;
			while ((endIndex = tempString.indexOf(enterStr, fromIndex)) != -1) 
			{
				String line = tempString.substring(fromIndex, endIndex);
				
				
				
				if(strBuf.length()>0)
				{
					strBuf.append(line);
					
					line = strBuf.toString();
					strBuf.delete(0, strBuf.length());
				}
				
				System.out.println(line);
				
				fromIndex = endIndex + 1;

			}
			
			if(rSize>fromIndex)
			{
			    strBuf.append(tempString.substring(fromIndex, tempString.length()));
			    
			}else
			{
				strBuf.delete(0, strBuf.length());
			}
		}
	   
   }
}
