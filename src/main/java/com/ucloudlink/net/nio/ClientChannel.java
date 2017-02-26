package com.ucloudlink.net.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ClientChannel 
{
	public static void main(String args[])
	{
		try {
			
			final Selector selector = Selector.open();
			SocketChannel client = SocketChannel.open();
			client.configureBlocking(false);
			if(client.connect(new InetSocketAddress("127.0.0.1", 1089)))
			{
			   client.register(selector,SelectionKey.OP_READ);
			}
			else
			{
				client.register(selector, SelectionKey.OP_CONNECT);
			}
			
			Thread thread = new Thread(new Runnable(){

				public void run() {
					// TODO Auto-generated method stub

					try {
						
						while (true) {
							selector.select();
							Set<SelectionKey> selectionKeys = selector.selectedKeys();
							Iterator<SelectionKey> iterator = selectionKeys.iterator();

							while (iterator.hasNext()) {
								SelectionKey key = iterator.next();
								iterator.remove();

								if (key.isValid()) {
									if (key.isReadable()) {
										SocketChannel channel = (SocketChannel) key.channel();

										ByteBuffer readBuffer = ByteBuffer.allocate(1024);
										channel.read(readBuffer);

										byte[] readByte = new byte[readBuffer.remaining()];
										readBuffer.flip();
										readBuffer.get(readByte);
										System.out.println(new String(readByte, "utf8"));

									}
									
									if (key.isConnectable()) {
										
										SocketChannel channel = (SocketChannel) key.channel();
										
										if (channel.finishConnect()) {
											channel.register(selector, SelectionKey.OP_READ);
										    //doWrite(channel);
										} else
										    System.exit(1);// 连接失败，进程退出
									    }
								}
							}

						}
					} catch (Exception e) {

					}
				}
				
			});
			
			thread.start();
			
			while(true)
			{

				Scanner sc = new Scanner(System.in);
				String read = sc.nextLine();
				
				ByteBuffer writerBuffer = ByteBuffer.wrap(read.getBytes("utf8"));
				client.write(writerBuffer);
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
