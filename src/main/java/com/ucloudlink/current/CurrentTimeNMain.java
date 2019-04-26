package com.ucloudlink.current;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

import com.ucloudlink.current.CurrentTimeMain.CurrentThread;

public class CurrentTimeNMain 
{
	public static void main(String args[])
	{
        int ThreadNumN = 10;
		
		Executor executor = Executors.newFixedThreadPool(ThreadNumN);
		
		CountDownLatch countLatchN = new CountDownLatch(ThreadNumN);
		
		List<HashSet<String>> setList = new ArrayList<HashSet<String>>();
		
		for(int i=0;i<ThreadNumN;i++)
		{
			executor.execute(new Runnable(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					int ThreadNum = 2000;
					
					Executor executor = Executors.newFixedThreadPool(ThreadNum);
					
					CountDownLatch countLatch = new CountDownLatch(ThreadNum);
					
					AtomicLong countL = new AtomicLong(0);
					
					//executor.execute(new CurrentThread());
					List<HashSet<String>> setListA = new ArrayList<HashSet<String>>();
					
					for(long i=0;i<ThreadNum;i++)
					{
						HashSet<String> runnableSet = new HashSet<String>();
						
						setListA.add(runnableSet);
						
						Long startTime = System.currentTimeMillis();
						
						executor.execute(new CurrentThread(runnableSet,countLatch,countL,startTime));
						
					
					}
					
					try {
						countLatch.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					setList.addAll(setListA);
					
					
					
					countLatchN.countDown();
				}
				
			});
		}
		
		try {
			countLatchN.await();
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
		
		
		String result = resultSet.iterator().next();
		
		System.out.println(result);
		
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
			for(int i=0;i<100;i++)
			{
				
				//runnableSet.add(String.valueOf(System.nanoTime())+String.valueOf(r.nextInt(10000)));
				Long seq = countL.incrementAndGet()%10000;
				String uuid = String.valueOf(System.currentTimeMillis())+String.valueOf(seq)+String.valueOf(r.nextInt(100));
				//String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
				
	
				runnableSet.add(uuid);
				
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("Finish "+Thread.currentThread().getName()+" id:"+startTime+" size:"+runnableSet.size());
			countLatch.countDown();
		}
		
	}

}
