package com.ucloudlink.io;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadExcuterTest 
{
	
	public static void main(String args[]) throws InterruptedException
	{
		ExecutorService excutor = new ThreadPoolExecutor(3, 3, 120, TimeUnit.SECONDS,
				new ArrayBlockingQueue<Runnable>(100));
		
		ReentrantLock lock = new ReentrantLock();
		ThreadExcuterTest threadEx = new ThreadExcuterTest();
		lock.lock();
		
		
		
		for(int i=0;i<2;i++)
		{
			excutor.execute(threadEx.new RunnableTest("ThreadBlock",String.valueOf(i),lock));
		}
		
		
		Thread.sleep(2000);
		
		excutor.execute(threadEx.new RunnableTest("Thread","Top",lock));
		
		
	}
	
	public class RunnableTest implements Runnable
	{
		private String name;
		
		private ReentrantLock lock;
		
		private String seq;
		
		public RunnableTest(String name,String seq,ReentrantLock lock)
		{
			this.name=name;
			this.lock = lock;
			this.seq = seq;
		}

		public void run() {
			// TODO Auto-generated method stub

			while (true) {
				if ("ThreadBlock".equals(name)) {
					System.out.println("Block:" + name + seq);

					lock.lock();

					System.out.println("getLock:" + name + seq);

					lock.unlock();
					// Thread.
				}
				
				System.out.println("noBlock:" + name + seq);
			}

		}
		
	}

}
