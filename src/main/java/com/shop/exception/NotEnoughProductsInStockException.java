package com.shop.exception;

import com.shop.pojo.Product;

public class NotEnoughProductsInStockException extends Exception{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String DEFAULT_MESSAGE = "Not enough products in stock";

	    public NotEnoughProductsInStockException() {
	        super(DEFAULT_MESSAGE);
	    }

	    public NotEnoughProductsInStockException(Product product) {
	        super(String.format("Not enough %s products in stock. Only %d left", product.getPname(), product.getGrossWeight()));
	    }

}
