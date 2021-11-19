package com.shop.dao;

import com.shop.pojo.Reciept;

public interface IRecieptDao {
	
	void CancelReciept(int Rid);
	void UpdateReciept(int Rid);
	Reciept MakeReciept(Reciept r);

}
