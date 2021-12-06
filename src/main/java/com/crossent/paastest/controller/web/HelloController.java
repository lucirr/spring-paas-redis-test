package com.crossent.paastest.controller.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

	 @RequestMapping("index")
	 public String index(HttpServletRequest req){
	 	req.getSession().setAttribute("userid", "testuser");

	 	return "index";
	 }

	@RequestMapping("session")
	public String session(HttpServletRequest req){
		String userid = String.valueOf(req.getSession().getAttribute("userid"));
		req.setAttribute("userid", userid);
		return "index";
	}

}
