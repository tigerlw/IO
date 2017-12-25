package com.ucloudlink.spring.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//@Component
public class BaseBean implements InitializingBean,DisposableBean 
{
	
	public String getBase()
	{
		return "123";
	}

	//@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BaseBean destroy");
	}

	//@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
