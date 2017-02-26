package com.ucloudlink.netty;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.CharsetUtil;
import io.netty.channel.socket.SocketChannel;

public class NettyServer 
{
	public static void main(String args[])
	{
		new NettyServer().initailService();
	}
	
	public void initailService()
	{
		NioEventLoopGroup connectGroup = new NioEventLoopGroup();
		NioEventLoopGroup workGroup = new NioEventLoopGroup();
		
		ServerBootstrap serviceboot = new ServerBootstrap();
		serviceboot.group(connectGroup, workGroup).channel(NioServerSocketChannel.class)
		.childHandler(new ChannelInitializer<SocketChannel>(){

			@Override
			protected void initChannel(SocketChannel channel) throws Exception {
				// TODO Auto-generated method stub
				channel.pipeline().addLast(new InputHandle());
			}
			
		});
		
		try {
			
			ChannelFuture channel = serviceboot.bind(1029).sync();
			
			channel.channel().closeFuture().sync();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static class InputHandle extends ChannelInboundHandlerAdapter
	{

		@Override
		public void channelRead(ChannelHandlerContext ctx, Object msg) {
			ByteBuf in = (ByteBuf) msg;
			System.out.println("Server received: " + in.toString(CharsetUtil.UTF_8));
			ctx.writeAndFlush(in);
		}

		@Override
		public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
			//ctx.writeAndFlush(Unpooled.EMPTY_BUFFER);
		}

	}
	

}
