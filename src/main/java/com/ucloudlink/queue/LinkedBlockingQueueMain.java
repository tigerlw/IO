package com.ucloudlink.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingQueueMain 
{
	public static void main(String args[]) throws InterruptedException
	{
		BlockingQueue<String> queue = new LinkedBlockingQueue<String>(2);
		
		while(true)
		{
		  queue.offer("123", 10, TimeUnit.SECONDS);
		  
		  System.out.println("offer msg");
		}
	}

}
