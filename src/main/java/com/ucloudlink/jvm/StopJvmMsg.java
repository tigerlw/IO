package com.ucloudlink.jvm;

public class StopJvmMsg 
{
	public static void main(String args[]){
		
		Thread thread1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread1");
			}
			
		});
		
		
		Thread thread2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread2");
			}
			
		});
		
		
		Thread thread3 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					Thread.sleep(5000L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("shutdown============");
			}
			
		});
		
		
		 Runtime.getRuntime().addShutdownHook(thread3);
		 
		 thread1.start();
		 thread2.start();
		 
		 
		
	}

}
