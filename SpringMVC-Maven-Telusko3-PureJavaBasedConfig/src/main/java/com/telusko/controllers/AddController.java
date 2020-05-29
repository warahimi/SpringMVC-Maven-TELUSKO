package com.telusko.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

		@RequestMapping("/add")
		public ModelAndView add(@RequestParam("n1") int num1, @RequestParam("n2") int num2)
		{
			ModelAndView mv = new ModelAndView(); // using the ModelAndView we can send both the data and the page name , instead of using Request or Model object
			int result = num1+num2;
			mv.addObject("result", result);
			mv.setViewName("restult"); // now the mv object has both the data and the page name to return
			return mv;
		}
}
