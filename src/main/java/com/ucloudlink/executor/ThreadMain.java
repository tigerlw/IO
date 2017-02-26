package com.ucloudlink.executor;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadMain 
{
	public  final AtomicInteger ctl = new AtomicInteger(ctlOf(RUNNING, 0));
	private static final int COUNT_BITS = Integer.SIZE - 3;
	private static final int CAPACITY = (1 << COUNT_BITS) - 1;

	// runState is stored in the high-order bits
	private static final int RUNNING = -1 << COUNT_BITS;
	private static final int SHUTDOWN = 0 << COUNT_BITS;
	private static final int STOP = 1 << COUNT_BITS;
	private static final int TIDYING = 2 << COUNT_BITS;
	private static final int TERMINATED = 3 << COUNT_BITS;
	public static int workerCountOf(int c)  { return c & CAPACITY; }

	private static int ctlOf(int rs, int wc) {
		return rs | wc;
	}

	public static void main(String args[]) 
	{
		ThreadMain threadMain = new ThreadMain();
		int result = threadMain.ctl.get();
		result = threadMain.workerCountOf(result);
		System.out.println(result);

	}

}
