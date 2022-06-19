package com.shop.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.shop.pojo.Product;
import com.shop.repo.ProductRepo;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController {

	private static Logger log = LogManager.getLogger("controller");
	
	@Autowired
	ProductRepo pro;
	
		
	@PostMapping("product")
	public Product addpro(Product p) {
		log.info("Product added"+ p);
		//System.out.println("Product added"+ p);
		return pro.save(p);
	}
	
	@GetMapping("product")
	public Iterable<Product> getAllProducts() {
		log.info("In get all products");
		//System.out.println("In get all products");
			return  pro.findAll();	
	}
	
	@RequestMapping("/total")
	public long findpro() {
		log.info("Product total");
		//System.out.println("Product total");
		return pro.count();
	}
	
	@GetMapping("Type")
	public Iterable<Product> GetByType(@RequestParam String Ptype){
		log.info("In Get by type");
		//System.out.println("In Get by type");
		return pro.FindByPType(Ptype);
	}	
	
}
