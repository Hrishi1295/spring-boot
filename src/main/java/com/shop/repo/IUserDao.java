package com.shop.repo;

import org.springframework.data.repository.CrudRepository;

import com.shop.pojo.User;


public interface IUserDao extends CrudRepository<User, Integer>{

}
