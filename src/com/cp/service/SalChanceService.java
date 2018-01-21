package com.cp.service;

import java.util.Date;
import java.util.List;

import com.cp.entity.SalChance;

public interface SalChanceService {
	public SalChance todispatch(int chcId);

	public void dispatch(int chcId,int chcCreateId,Date chcDueDate);

	public void delete(int chcId);

	public void save(SalChance salChance2);

	//查
	// List select(Class clazz);
//去修改
	SalChance queryById(int chcId);
	//实际修改
	void update(int chcId,String chcDesc,String chcDueTo);
//分页
	public long count();

	public List<SalChance> byPage(int pageIndex, int pageSize);


	public List<SalChance> superselect(SalChance salChance, int pageIndex,
			int pageSize);


}
