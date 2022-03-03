package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("home")
	public String home(HttpServletRequest req) {
		// url : localhost:8080/home?name1=example
		System.out.println("MainController.home()" + req.getParameter("name1"));
		HttpSession session = req.getSession();
		session.setAttribute("name", req.getParameter("name1"));
		return "home"; 	
	}
	
	@RequestMapping("home1")
	public ModelAndView home(@RequestParam("name1") String myName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("name", myName);
		return mv;
	}
	
	@RequestMapping("home2")
	public ModelAndView home(Laptop laptop) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home2");
		mv.addObject("obj", laptop);
		return mv;
	}
}
