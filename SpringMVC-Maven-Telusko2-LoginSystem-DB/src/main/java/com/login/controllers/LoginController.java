package com.login.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.login.services.LoginService;

@Controller
public class LoginController {
	@ResponseBody
	@RequestMapping("/login")
//*	public ModelAndView login(HttpServletRequest request, HttpServletResponse response)
	public ModelAndView login(@RequestParam("user_name") String userName,@RequestParam("user_password") String password)
	{
		ModelAndView mv = new ModelAndView();
		
		
//*		//Instead of using request and response object we can use the Spring @RequestParam Annotation to fetch data from from submited by user
//*		//the values are sent to address bar (get) which are called request parameters
//*		// we can directly access the values in our method parameters by @RequestParam and passing the fields name submited by user
//*		String userName = request.getParameter("user_name");
//*		String password = request.getParameter("user_password");
		
		//calling the service Class method to login it database
		if(new LoginService().loginToDatabase(userName, password))
		{
			mv.setViewName("sucess-login");
		}
		else
		{
			mv.setViewName("fialed-login");
		}
		
		return mv;
	}

}
