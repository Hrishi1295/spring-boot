package com.shop.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	private static Logger log = LogManager.getLogger("controller");
	
	@RequestMapping("/")
	public String HomePage() {
		log.info("Inside Home COntroller");
		System.out.println("In Home controller");
		return "/index";
	}
	
}
