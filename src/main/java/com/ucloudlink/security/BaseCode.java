package com.ucloudlink.security;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.base64.Base64;




public class BaseCode 
{
	public static void  main(String args[])
	{
		String inputStr="liuwei";
		
		try {
			ByteBuffer encode = ByteBuffer.wrap(inputStr.getBytes());
			//encode.
			//encode.g
			
			System.out.println(encode);
			
			//byte[] decode = Base64.
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
