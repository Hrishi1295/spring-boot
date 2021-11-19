package com.shop.service;

import org.springframework.stereotype.Service;

import com.shop.pojo.Reciept;

@Service
public class RecieptService {

	public double RecieptCalc() {
		
		Reciept r =new Reciept();
		Boolean addProduct=true;
		String add = null;
		double total=0;
		do {
			if(add=="Calculate") {
				
			total= r.getTotal();
			}
			else {
				total= r.getTotal()+total;
			}
		}while(addProduct);
			
		return total;
	}
	
	
}
