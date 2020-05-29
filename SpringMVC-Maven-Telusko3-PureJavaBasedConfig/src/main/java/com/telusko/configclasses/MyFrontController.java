package com.telusko.configclasses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//replacement for DS config file (DS-servlet.xml)

@SuppressWarnings("deprecation")
@EnableWebMvc
@Configuration
@ComponentScan("com.telusko")
public class MyFrontController extends WebMvcConfigurerAdapter {

	
	//Defining the view resolver
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
}
