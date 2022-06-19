package com.shop.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.pojo.Reciept;
import com.shop.repo.IRecieptRepo;


@RestController
public class RecieptController {
	
	private static Logger log = LogManager.getLogger("controller");
	
	@Autowired
	IRecieptRepo recpt;
	
	
	@PostMapping("addreciept")
	public Reciept Recieptadd(Reciept r) {
		log.info("In Add Reciept"+ r);
	 //System.out.println("In Add Reciept"+ r);
		return recpt.save(r);
	}
	
	@GetMapping("RecieptList")
	public Iterable<Reciept> GetallReciept(){
		log.info("In Get all reciept");
		//System.out.println("In Get all reciept");
		
		return recpt.findAll();
	}
	
	

}
