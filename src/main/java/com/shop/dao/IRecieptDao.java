package com.shop.dao;

import com.shop.pojo.Reciept;

public interface IRecieptDao {
	
	Reciept CancelReciept(Reciept Rid);
	void UpdateReciept(Reciept Rid);
	Reciept MakeReciept(Reciept r);

}
