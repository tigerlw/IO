package com.ucloudlink.netty;

import java.util.Scanner;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.CharsetUtil;

public class NettyClient 
{
	public static void main(String args[])
	{
		
		//NettyClient.InputHandler handler = new NettyClient.InputHandler();
		
		NioEventLoopGroup work = new NioEventLoopGroup();

		final InputHandler inputHandler = new InputHandler();
		Bootstrap bootstrap = new Bootstrap();
		bootstrap.group(work).channel(NioSocketChannel.class)
		.handler(new ChannelInitializer<SocketChannel>() {

			@Override
			protected void initChannel(SocketChannel ch) throws Exception {
				// TODO Auto-generated method stub
				ch.pipeline().addLast(inputHandler);
			}

		});
		
		try {
			
			ChannelFuture future= bootstrap.connect("127.0.0.1", 1029).sync();
			
			Channel channel = future.channel();
			
			while(true)
			{
				Scanner sc = new Scanner(System.in);
				String read = sc.nextLine();
				
				
				
				/*ByteBuf sendMsg = Unpooled.buffer(1024);  
		        sendMsg.writeBytes(read.getBytes("utf8"));  
		        System.out.println("Going to Send: " + read);  
		        channel.writeAndFlush(sendMsg);  */
				
				//channel.writeAndFlush(sendMsg);
				
				inputHandler.sendMsg(read);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static class InputHandler extends SimpleChannelInboundHandler<ByteBuf>
	{
		private Channel channel;

		@Override
		protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
			// TODO Auto-generated method stub

			System.out.println("Client received: " + msg.toString(CharsetUtil.UTF_8));
		}

		@Override
		public void channelActive(ChannelHandlerContext ctx) {
			
			channel = ctx.channel();
			channel.writeAndFlush(Unpooled.copiedBuffer("Netty rocks!", CharsetUtil.UTF_8));
		}
		
		public void sendMsg(String msg)
		{
			channel.writeAndFlush(Unpooled.copiedBuffer("Netty rocks!", CharsetUtil.UTF_8));
		}

	}

}
