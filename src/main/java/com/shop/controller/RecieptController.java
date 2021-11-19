package com.shop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.pojo.Reciept;
import com.shop.repo.IRecieptRepo;


@RestController
public class RecieptController {
	
	@Autowired
	IRecieptRepo recpt;
	
	
	@PostMapping("addreciept")
	public Reciept Recieptadd(Reciept r) {
	 
	 System.out.println("In Add Reciept"+ r);
		return recpt.save(r);
	}
	
	@GetMapping("RecieptList")
	public Iterable<Reciept> GetallReciept(){
		System.out.println("In Get all reciept");
		
		return recpt.findAll();
	}
	
	

}
