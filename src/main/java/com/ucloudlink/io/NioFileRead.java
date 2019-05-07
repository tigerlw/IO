package com.ucloudlink.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioFileRead {

	public static void main(String args[]) {
		String path = "D:\\learning\\leaning-repository\\IO\\io.txt";

		//RandomAccessFile file = null;
		FileInputStream  file = null;
		
		FileChannel channel = null;

		try {

			long wasteTime = System.currentTimeMillis();
			
			//file = new RandomAccessFile(path, "rw");
			
			file = new FileInputStream(path);

			channel = file.getChannel();

			ByteBuffer buffer = ByteBuffer.allocate(512);

			buffer.clear();

			while (channel.read(buffer) != -1) {
				buffer.flip();

				while (buffer.hasRemaining()) {
					//System.out.println((char) buffer.get());
					 buffer.get();
				}

				buffer.clear();
			}

			System.out.println("success============== wasteTime:"+(System.currentTimeMillis()-wasteTime));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
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
