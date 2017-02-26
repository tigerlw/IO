package com.ucloudlink.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public class CallableMain
{
	public static void main(String args[])
	{
		Callable callable = new callableRun();
		
		RunnableFuture<String> task = new FutureTask<String>(callable);
		
		Thread thread = new Thread(task);
		
		thread.start();
		
		while(true)
		{
			if(task.isDone())
			{
				try {
					System.out.println(task.get());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	static class callableRun implements Callable<String>
	{

		public String call() throws Exception {
			// TODO Auto-generated method stub
			return "liuwei";
		}
		
	}

}
