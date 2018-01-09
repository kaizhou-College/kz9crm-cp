package com.cp.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.SalChanceDao;
import com.cp.entity.SalChance;
import com.cp.service.SalChanceService;

@Service
public class SalChanceServiceImpl  implements SalChanceService{
	@Autowired
	private SalChanceDao salChanceDao;
	
	public SalChance todispatch(int chcId) {
		
		System.out.println("进入了BizImpl");
		System.out.println(chcId);
		
		SalChance salChance =(SalChance) salChanceDao.todispatch(chcId);
		
		return salChance;
	}
	
	

	public void dispatch(int chcId,int chcCreateId, Date chcDueDate) {
		// TODO Auto-generated method stub
		System.out.println("进入了BizImpl");
		salChanceDao.dispatch(chcId,chcCreateId, chcDueDate);
		
	}



	public void delete(int chcId) {
		// TODO Auto-generated method stub
		System.out.println("这里是Biz"+chcId);
		salChanceDao.delete(chcId);
	}



	public void save(SalChance salChance2) {
		// TODO Auto-generated method stub
		System.out.println(salChance2);
		salChanceDao.save(salChance2);
		
	}



	public List select(Class clazz) {
		List list=salChanceDao.select(clazz);
		return list;
	}

}
