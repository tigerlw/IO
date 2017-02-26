package com.ucloudlink.netty.codec;

import java.util.Scanner;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

public class NettyClientProto 
{
	public static void main(String args[])
	{
		NioEventLoopGroup work = new NioEventLoopGroup();
		Bootstrap bootstrap = new Bootstrap();
		bootstrap.group(work).channel(NioSocketChannel.class)
		.handler(new ChannelInitializer<SocketChannel>(){

			@Override
			protected void initChannel(SocketChannel ch) throws Exception {
				// TODO Auto-generated method stub
				ch.pipeline().addLast(new ProtobufVarint32FrameDecoder());
				ch.pipeline().addLast(new ProtobufDecoder(PersonMsg.Person.getDefaultInstance()));
			    ch.pipeline().addLast(new ProtobufVarint32LengthFieldPrepender());
			    ch.pipeline().addLast(new ProtobufEncoder());
			}
			
		});
		
		try {
			
			ChannelFuture  future = bootstrap.connect("127.0.0.1", 8089).sync();
			
			while(true)
			{
				Scanner sc = new Scanner(System.in);
				String read = sc.nextLine();
				
				PersonMsg.Person.Builder builder = PersonMsg.Person.newBuilder();
				builder.setId(1);
				builder.setName(read);
				PersonMsg.Person msg = builder.build();
				
				future.channel().writeAndFlush(msg);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static class InputHandle extends ChannelInboundHandlerAdapter
	{
		@Override
		public void channelRead(ChannelHandlerContext ctx, Object msg) {
			PersonMsg.Person in = (PersonMsg.Person) msg;
			System.out.println("Server received: " + in.getName());
			//ctx.writeAndFlush(in);
		}
	}
	

}
