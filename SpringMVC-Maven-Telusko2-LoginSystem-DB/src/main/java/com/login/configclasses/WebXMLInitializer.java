package com.login.configclasses;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//we can have pure java based configuration (no xml) if we user servlet version that is above 3.0
//This class will work as our web.xml file


public class WebXMLInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	
	//1- Confiugring the DS / front controller
	@Override
	protected Class<?>[] getServletConfigClasses() { //returns an arry of Class
		return new Class[] {DispatcherServletConfigClaess_File.class};
	}


	//2- set the mapping as we did in web.xml the mapping to DS
	@Override
	protected String[] getServletMappings() { //return an array of String
		return new String[] {"/"}; // for all the requests call the DS 
	}

}
