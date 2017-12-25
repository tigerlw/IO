package com.ucloudlink.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadException 
{
	public static void main(String args[]) throws InterruptedException
	{
		ThreadF threadF = new ThreadF();
		
		Executor executor = Executors.newFixedThreadPool(1,threadF);
		
		executor.execute(new ThreadE());
		
		
		
		while(true)
		{
		  Thread.sleep(1000);
		  threadF.getException();
		}
		
		/*Thread t = new Thread(new ThreadE());
		t.start();
		
		Thread.sleep(1000);
		
		if(!t.isAlive())
		{
			System.out.println("123");
		}*/
		
	}
	
	static class ThreadF implements ThreadFactory
	{
		private List<Thread> nativeThread = new ArrayList<Thread>();

		//@Override
		public Thread newThread(Runnable r) {
			// TODO Auto-generated method stub
			
			Thread t = new Thread(r);
			
			t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
			
			nativeThread.add(t);
			
			return t;
		}
		
		public void getException()
		{
			for(Thread thread : nativeThread)
			if(!thread.isAlive())
			{
				System.out.println(thread.getUncaughtExceptionHandler());
			}
			else
			{
				System.out.println("alive");
			}
		}
		
	}
	
	
	static class ThreadE implements Runnable
	{

		//@Override
		public void run() {
			// TODO Auto-generated method stub
			
			while(true)
			{
			  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  //throw new RuntimeException();
			}
			
		}
		
	}
	
	static class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler
	{

		//@Override
		public void uncaughtException(Thread t, Throwable e) {
			// TODO Auto-generated method stub
			System.out.println("caught    "+e);
		}
		
	}

}
