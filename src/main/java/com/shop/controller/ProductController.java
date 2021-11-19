package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.shop.pojo.Product;
import com.shop.repo.ProductRepo;

@RestController
public class ProductController {

	@Autowired
	ProductRepo pro;
	
		
	@PostMapping("product")
	public Product addpro(Product p) {
		System.out.println("Product added"+ p);
		return pro.save(p);
	}
	
	@GetMapping("product")
	public Iterable<Product> getAllProducts() {
		System.out.println("In get all products");
			return  pro.findAll();	
	}
	
	@RequestMapping("/total")
	public long findpro() {
		System.out.println("Product total");
		return pro.count();
	}
	
	@GetMapping("Type")
	public Iterable<Product> GetByType(@RequestParam String Ptype){
		System.out.println("In Get by type");
		return pro.FindByPType(Ptype);
	}	
	
}
