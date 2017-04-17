package com.ucloudlink.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ucloudlink.spring.service.ServiceBean;


public class ApplicationMain 
{
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.ucloudlink");
		
		//context.refresh();
		
		ServiceBean service = context.getBean(ServiceBean.class);
		
		String result = service.getServiceName();
		
		System.out.println(result);
		
		context.stop();
		context.close();
	}

}
