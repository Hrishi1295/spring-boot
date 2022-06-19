package com.shop.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.pojo.Reciept;
import com.shop.repo.IRecieptRepo;
import com.shop.repo.ProductRepo;

public class RecieptDaoImpl implements IRecieptDao {

	private static Logger log = LogManager.getLogger("Reciept Operations DAO");
	
	@Autowired
	IRecieptRepo rec;
	@Autowired
	ProductRepo pro;
	
	public Reciept MakeReciept(Reciept r) {
		log.info("In Add Reciept"+ r);
		return rec.save(r);		
	}

	public Reciept CancelReciept(Reciept Rid) {
		log.info("In Cancel Reciept");
		return Rid;
	
	}


	public void UpdateReciept(Reciept Rid) {
		// TODO Auto-generated method stub
		
	}

}
