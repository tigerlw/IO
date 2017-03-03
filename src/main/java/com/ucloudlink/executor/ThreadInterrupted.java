package com.ucloudlink.executor;

import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadInterrupted 
{
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		final Lock lock = new ReentrantLock();
		
		lock.lock();
		
		Thread thread = new Thread(new Runnable(){

			public void run() {
				// TODO Auto-generated method stub
				while (true) 
				{
					System.out.println("running============");
					
					try {
						lock.lockInterruptibly();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					/*try {
						Thread.sleep(10000);
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
				}
			}
			
		});
		
		
		thread.start();
		
		
		Thread.sleep(1000);
		
		//thread.interrupt();
		
		System.in.read();
	}

}
