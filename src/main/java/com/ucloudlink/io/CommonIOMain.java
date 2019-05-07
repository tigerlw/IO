package com.ucloudlink.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;

public class CommonIOMain {
	
	public static void main(String args[])
	{
		String path = "D:\\learning\\leaning-repository\\IO\\io2.txt";
		
		File file = new File(path);
		LineIterator it = null;
		
		try {
			
			/*List<String> lines = FileUtils.readLines(file, "UTF-8");
			
			for (String line : lines) 
			{
				System.out.println(line);
			}*/
			
			it = FileUtils.lineIterator(file, "UTF-8");
			
			while (it.hasNext()) 
			{
				String line = it.nextLine();
				System.out.println(line);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			//IOUtils.closeQuietly(in);
			LineIterator.closeQuietly(it);
		}
	}

}
