package com.avizuete.spring.core.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.avizuete.spring.core.lifecycle.beans.LifecycleBean;

@Configuration
public class AppConfig {
	
	@Bean(initMethod="myPostConstruct", destroyMethod="myPreDestroy")
	public LifecycleBean myBean() {
		LifecycleBean lb = new LifecycleBean();
		lb.setOrigen("JavaConfig");
		return lb;
	}
	
}
