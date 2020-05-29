package com.telusko1.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView  add(HttpServletRequest request, HttpServletResponse response)
	{
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		int result = num1+num2;
		
		
		//to pass the data to view we make use of ModelAndView Object
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display"); // which view you want to call
		mv.addObject("result", result); // what date you want to send to the viw
		
		//return "display";
		return mv;
	}

}
