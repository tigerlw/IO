package com.ucloudlink.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadLocalTest {
	
	public static void  main(String args[])
	{
		Executor executor = Executors.newFixedThreadPool(20);

		while (true) {

			executor.execute(new Runnable() {

				private ThreadLocal<byte[]> th = new ThreadLocal<byte[]>();

				@Override
				public void run() {
					// TODO Auto-generated method stub

					th.set(new byte[1024 * 1024 * 10]);
					byte[] result = th.get();
					
					System.out.println("==========");

				}

			});
		}

	}

}
