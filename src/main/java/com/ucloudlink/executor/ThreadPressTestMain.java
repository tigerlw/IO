package com.ucloudlink.executor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadPressTestMain 
{
	public static void main(String args[])
	{
		
		
		
		Executor executor = Executors.newFixedThreadPool(1000);
		
		CountDownLatch countLatch = new CountDownLatch(5000);
		
		int count = 0;
		
		long initalTime = System.currentTimeMillis();
		
		while(count<5)
		{
		   count++;
	       long startTime = System.currentTimeMillis();	
	       for(int i=0;i<1000;i++)
	       {
	    	 executor.execute(new ThreadRun(i,System.currentTimeMillis(),countLatch));
	       }
	       
	       long wasteTime = System.currentTimeMillis() - startTime;
	       
	       System.out.println("waster============="+wasteTime);
	       
			if (count < 5) 
			{

				try {
					Thread.sleep(wasteTime < 1000 ? 1000 - wasteTime : wasteTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    
	       //System.out.println("finish=============");
		}
		
		try {
			countLatch.await();
			System.out.println("finish============= time:"+(System.currentTimeMillis()-initalTime));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	   
		
	}
	
	
	
	static public class ThreadRun implements Runnable
	{
		private int id;
		
		private long startDate;
		
		private static AtomicLong invokeCount= new AtomicLong(0);
		
		private static long startTime;
		
		private long totalInvoke;
		
		private CountDownLatch countLatch;
		
		public ThreadRun(int id,long startDate,CountDownLatch countLatch)
		{
			this.id = id;
			this.startDate = startDate;
			this.countLatch = countLatch;
		}
		
		

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			try {
				
				
			/*	if(invokeCount.getAndIncrement() == 0)
				{
					startTime = startDate;
				}*/
				
				invokeCount.getAndIncrement();
				Thread.sleep(450);
				
				long wasterTime = System.currentTimeMillis() - startDate;
				
				/*if(invokeCount.getAndIncrement() == totalInvoke)
				{
					startTime = startDate;
				}*/
				
				System.out.println("wasterTime ========"+wasterTime+";=============id:"+id+";==========invokeCount:"+invokeCount.get());
				
				countLatch.countDown();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

}
