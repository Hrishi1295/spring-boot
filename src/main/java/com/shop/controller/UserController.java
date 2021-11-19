package com.shop.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.pojo.User;
import com.shop.repo.IUserDao;

@RestController
public class UserController {
	@Autowired
	IUserDao dao;
	
	@PostMapping("user")
	public User Register(User U) {
		
		
		System.out.println("registerd" + U );
		return dao.save(U);
	}
	
	@GetMapping("user")
	public Iterable<User> getall() {
		System.out.println("In getall method");
		
		return dao.findAll();
	}
	
	@RequestMapping("/findbyId")
	public Optional<User> Findbyid(int id) {
		System.out.println("In find by Id");
		return dao.findById(id);
	}
	
	@RequestMapping("/totaluser")
	public long totaluser() {
		System.out.println("in total user controller");
		return dao.count();
	}

}
