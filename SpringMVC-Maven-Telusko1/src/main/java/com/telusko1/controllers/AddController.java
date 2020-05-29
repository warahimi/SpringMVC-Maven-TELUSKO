package com.telusko1.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.telusko1.services.AddService;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView  add(HttpServletRequest request, HttpServletResponse response)
	{
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		
		//creating object of Service class calling its method to do the processing for us.
		AddService addService = new AddService();
		int result = addService.add(num1, num2);
		
		
		//to pass the data to view we make use of ModelAndView Object
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display"); // which view you want to call
		mv.addObject("result", result); // what date you want to send to the viw
		
		//return "display";
		return mv;
	}

}
