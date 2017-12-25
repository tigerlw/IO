package com.ucloudlink.executor;

public class ThreadWaitNotify 
{
	public static void main(String args[])
	{
		final Object flag = new Object();
		
	    new Thread(new Runnable(){

			//@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized(flag)
				{
					try {
						flag.wait();
						
						System.out.println("run================");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
	    	
	    }).start();
	    
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    synchronized(flag)
		{
	    	flag.notifyAll();
		}
	}

}
