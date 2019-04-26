package com.ucloudlink.current;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;



public class CurrentTimeMain 
{
	public static void main(String args[])
	{
		int ThreadNum = 10;
		
		Executor executor = Executors.newFixedThreadPool(ThreadNum);
		
		CountDownLatch countLatch = new CountDownLatch(ThreadNum);
		
		AtomicLong countL = new AtomicLong(0);
		
		//executor.execute(new CurrentThread());
		List<HashSet<String>> setList = new ArrayList<HashSet<String>>();
		
		for(long i=0;i<ThreadNum;i++)
		{
			HashSet<String> runnableSet = new HashSet<String>();
			
			setList.add(runnableSet);
			
			Long startTime = System.currentTimeMillis();
			
			executor.execute(new CurrentThread(runnableSet,countLatch,countL,startTime));
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			countLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HashSet<String> resultSet = new HashSet<String>();
		
		for(HashSet<String> set:setList)
		{
			resultSet.addAll(set);
		}
		
		System.out.println(resultSet.size());
		

	}
	
	
	public static class CurrentThread implements Runnable
	{
		private HashSet<String> runnableSet;
		
		private CountDownLatch countLatch;
		
		private AtomicLong countL;
		
		private Long startTime;
		
		public  CurrentThread(HashSet<String> runnableSet,CountDownLatch countLatch,AtomicLong countL,Long startTime)
		{
			this.runnableSet = runnableSet;
			this.countLatch = countLatch;
			this.countL = countL;
			this.startTime = startTime;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Random r=new Random(); 
			AtomicLong countk = new AtomicLong(0);
			for(int i=0;i<10000;i++)
			{
				
				//runnableSet.add(String.valueOf(System.nanoTime())+String.valueOf(r.nextInt(10000)));
				Long seq = countL.incrementAndGet()%100000;
				String uuid = String.valueOf(System.currentTimeMillis())+String.valueOf(seq);
				//String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
				
				
				runnableSet.add(uuid);
			}
			
			System.out.println("Finish "+Thread.currentThread().getName()+" id:"+startTime+" size:"+runnableSet.size());
			countLatch.countDown();
		}
		
	}

}
