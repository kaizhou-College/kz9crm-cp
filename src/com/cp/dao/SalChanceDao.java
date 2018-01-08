package com.cp.dao;


import java.util.List;

public interface SalChanceDao {
	List select(Class clazz);

	Object todispatch(int chcId);
}
	

