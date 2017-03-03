package com.ucloudlink.io;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioFileRead {

	public static void main(String args[]) {
		String path = "D:\\learning\\leaning-repository\\IO\\io.txt";

		RandomAccessFile file = null;
		FileChannel channel = null;

		try {

			file = new RandomAccessFile(path, "rw");

			channel = file.getChannel();

			ByteBuffer buffer = ByteBuffer.allocate(48);

			buffer.clear();

			while (channel.read(buffer) != -1) {
				buffer.flip();

				while (buffer.hasRemaining()) {
					System.out.println((char) buffer.get());
				}

				buffer.clear();
			}

			System.out.println("success==============");

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
