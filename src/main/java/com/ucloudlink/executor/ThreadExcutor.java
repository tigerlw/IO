package com.ucloudlink.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadExcutor 
{
	public static void main(String args[])
	{
		Executor executor = Executors.newScheduledThreadPool(0);
		
		executor.execute(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName());
			}
			
		});
		
		
		System.out.println("exit");
	}

}
