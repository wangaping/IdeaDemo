package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/h")
	public ModelAndView sayHello() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("demo");

		modelAndView.addObject("hello", "spring cloud");

		return modelAndView;
	}
	@RequestMapping("/h1")
	public ModelAndView sayHello1() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("demo2");

		modelAndView.addObject("hello", "spring cloud");

		return modelAndView;
	}
}
