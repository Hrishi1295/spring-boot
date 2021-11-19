package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	
	
	@RequestMapping("/")
	public String HomePage() {
		System.out.println("In Home controller");
		return "index";
	}
	
}
