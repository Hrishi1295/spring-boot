package com.shop.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.pojo.Reciept;
import com.shop.repo.IRecieptRepo;
import com.shop.repo.ProductRepo;

public class RecieptDaoImpl implements IRecieptDao {

	@Autowired
	IRecieptRepo rec;
	@Autowired
	ProductRepo pro;
	
	public Reciept MakeReciept(Reciept r) {
		
		return rec.save(r);		
	}

	public void CancelReciept(int Rid) {
		// TODO Auto-generated method stub
		
	}

	public void UpdateReciept(int Rid) {
		// TODO Auto-generated method stub
		
	}

}
