package com.shop.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.exception.NotEnoughProductsInStockException;
import com.shop.pojo.Product;
import com.shop.repo.ProductRepo;

public class CartServiceImpl implements CartService {
	
	private Map<Product, Integer> products = new HashMap<Product, Integer>();
	
	@Autowired
	public CartServiceImpl(ProductRepo pro) {
		this.products=(Map<Product, Integer>) pro;
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public Map<Product, Integer> getProductsInCart() {
		// TODO Auto-generated method stub
		return null;
	}

	public void checkout() throws NotEnoughProductsInStockException {
		// TODO Auto-generated method stub
		
	}

	public BigDecimal getTotal() {
		// TODO Auto-generated method stub
		return null;
	}

}
