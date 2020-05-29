package com.login.configclasses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//we can have pure java based configuration (no xml) if we user servlet version that is above 3.0
//This class will work as DS Configuration xml file where we define our component-scan, view resolver config...etc

@Configuration
@ComponentScan(basePackages = {"com.login"})
public class DispatcherServletConfigClaess_File {
	
	//configuring the view resolver 
	//create and object of
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
	

}
