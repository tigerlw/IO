package com.ucloudlink.executor;

public class ThreadCurentName 
{
	public static void main(String args[])
	{
		
		Thread.currentThread().getStackTrace();
		
		System.out.println("success");
	}

}
