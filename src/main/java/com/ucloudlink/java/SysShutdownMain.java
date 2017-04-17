package com.ucloudlink.java;

public class SysShutdownMain 
{
	public static void main(String args[]) throws InterruptedException
	{
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
               
            	System.out.println("Shutdow =============== 1");
            }
        }));
		
		Thread.sleep(1000);
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
               
            	System.out.println("Shutdow =============== 2");
            }
        }));
		
		Thread.sleep(1000);
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
               
            	System.out.println("Shutdow =============== 3");
            }
        }));
		
		
		System.exit(0);
	}

}
