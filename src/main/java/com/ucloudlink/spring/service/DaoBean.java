package com.ucloudlink.spring.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoBean implements InitializingBean,DisposableBean 
{
	@Autowired
	private BaseBean baseBean;
	
	public String query()
	{
		return baseBean.getBase();
	}

	//@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DaoBean destroy");
	}

	//@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
