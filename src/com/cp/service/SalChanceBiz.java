package com.cp.service;

import java.util.Date;
import java.util.List;

import com.cp.entity.SalChance;

public interface SalChanceBiz {
	public SalChance todispatch(int chcId);

	public void dispatch(int chcId,int chcCreateId,Date chcDueDate);

	public void delete(int chcId);

	public void save(SalChance salChance2);

	//查
	 List select(Class clazz);

}
