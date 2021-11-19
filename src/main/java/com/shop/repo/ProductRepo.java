package com.shop.repo;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shop.pojo.Product;


@Repository
public interface ProductRepo extends CrudRepository<Product, Integer>{
	 
	@Query("from Product where ptype= :ptype")
	List<Product> FindByPType (@Param("ptype") String ptype);
			
}
