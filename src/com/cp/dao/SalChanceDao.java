package com.cp.dao;


import java.util.Date;
import java.util.List;

import com.cp.entity.SalChance;

public interface SalChanceDao {
	

	Object todispatch(int chcId);


	void dispatch(int chcId,int chcCreateId, Date chcDueDate);

	void delete(int chcId);

	void save(SalChance salChance2);
	
	//查
	List select(Class clazz);
	

}
	

