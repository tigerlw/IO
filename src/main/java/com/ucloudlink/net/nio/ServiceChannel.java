package com.ucloudlink.net.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class ServiceChannel 
{
	public static void main(String args[])
	{
		try {
			
			int port = 1089;
			Selector selector = Selector.open();
			ServerSocketChannel serverChannel = ServerSocketChannel.open();
			serverChannel.socket().bind(new InetSocketAddress(port), 1024);
			serverChannel.configureBlocking(false);
			
			serverChannel.register(selector, SelectionKey.OP_ACCEPT);
			
			while(true)
			{
		       selector.select();
		       
		       Set<SelectionKey> selectionKeys = selector.selectedKeys();
		       Iterator<SelectionKey> iterator = selectionKeys.iterator();
		       SelectionKey key = null;
		       
		       while(iterator.hasNext())
		       {
		    	   key = iterator.next();
		    	   iterator.remove();
		    	   
		    	   if(key.isValid())
		    	   {
		    		   if(key.isAcceptable())
		    		   {
		    			   ServerSocketChannel channel = (ServerSocketChannel) key.channel();
		    			   SocketChannel clientChannel = channel.accept();
		    			   clientChannel.configureBlocking(false);
		    			   clientChannel.register(selector, SelectionKey.OP_READ);
		    			   
		    			   ByteBuffer byteBuffer = ByteBuffer.wrap("Connect Service".getBytes("utf8"));
		    			   clientChannel.write(byteBuffer);
		    		   }
		    		   
		    		   if(key.isReadable())
		    		   {
		    			   SocketChannel clientChannel = (SocketChannel) key.channel();
		    			   ByteBuffer readBuffer = ByteBuffer.allocate(1024);
		    			   int readable = clientChannel.read(readBuffer);
		    			   
		    			   if(readable>0)
		    			   {
		    				   readBuffer.flip();
		    				   byte[] readByte = new byte[readBuffer.remaining()];
		    				   readBuffer.get(readByte);
		    				   
		    				   System.out.println(new String(readByte,"utf8"));
		    				   
		    				   ByteBuffer byteBuffer = ByteBuffer.wrap("Accept Message".getBytes("utf8"));
			    			   clientChannel.write(byteBuffer);
		    			   }
		    			   
		    			   //clientChannel.re
		    		   }
		    	   }
		    	   
		       }
		       
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
