package com.ucloudlink.spring.service;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceBean implements InitializingBean,DisposableBean 
{
	private ExecutorService executorService;
	
	@Autowired
	private DaoBean daoBean;
	
	public String getServiceName()
	{
		String result = daoBean.query(); 
		return result;
	}

	//@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		executorService.shutdownNow();
		executorService.awaitTermination(1000, TimeUnit.DAYS);
		
		System.out.println("ServiceBean destroy");
	}

	//@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		executorService = new ThreadPoolExecutor(0, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
		
		executorService.execute(new Runnable(){

			//@Override
			public void run() {
				// TODO Auto-generated method stub
				int count = 0;
				
				while(true && !Thread.currentThread().isInterrupted())
				{
					/*if(count>10)
					{
						break;
					}*/
					
				/*	try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
					System.out.println("123");
					
					count++;
				}
			}
			
		});
	}

}
