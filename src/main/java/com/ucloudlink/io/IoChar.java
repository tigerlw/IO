package com.ucloudlink.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IoChar 
{
	public static void main(String args[])
	{
		Reader reader = null ;
		Writer writer = null;
		String path = "D:\\learning\\JAVA_DEMO\\io.txt";
		
		try {
			
			reader = new BufferedReader(new FileReader(new File(path)));
			writer = new BufferedWriter(new FileWriter(new File(path),true));
			
			StringBuilder strBuilder = new StringBuilder();
			
			char[] charArray = new char[1];
			
			while(reader.read(charArray)!=-1)
			{
				strBuilder.append(charArray);
			}
			
			System.out.println(strBuilder.toString());
			
			writer.write("刷新");
			writer.flush();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
