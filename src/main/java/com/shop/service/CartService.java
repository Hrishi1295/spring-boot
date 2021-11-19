package com.shop.service;

import java.math.BigDecimal;
import java.util.Map;

import com.shop.exception.NotEnoughProductsInStockException;
import com.shop.pojo.Product;

public interface CartService {
	 void addProduct(Product product);

	    void removeProduct(Product product);

	    Map<Product, Integer> getProductsInCart();

	    void checkout() throws NotEnoughProductsInStockException;

	    BigDecimal getTotal();

}
