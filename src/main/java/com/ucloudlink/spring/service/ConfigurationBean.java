package com.ucloudlink.spring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {
	
	@Bean
	public BaseBean getBaseBean()
	{
		return new BaseBean();
	}

}
