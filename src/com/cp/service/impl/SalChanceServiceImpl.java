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

	public void dispatch(int chcId,int chcCreateId, Date chcDueDate) {
		// TODO Auto-generated method stub
		System.out.println("进入了BizImpl");
		salChanceDao.dispatch(chcId,chcCreateId, chcDueDate);
		
	}
	//删除
	public void delete(int chcId) {
		// TODO Auto-generated method stub
		System.out.println("这里是Biz"+chcId);
		salChanceDao.delete(chcId);
	}
//添加
	public void save(SalChance salChance2) {
		// TODO Auto-generated method stub
		System.out.println(salChance2);
		salChanceDao.save(salChance2);
		
	}
/*	//查
	public List select(Class clazz) {
		List list=salChanceDao.select(clazz);
		return list;
	}*/
	//指派
	public SalChance todispatch(int chcId) {
		//System.out.println("进入了BizImpl");
		//System.out.println(chcId);
		SalChance salChance =(SalChance) salChanceDao.todispatch(chcId);
		return salChance;
	}
	//去修改
	public SalChance queryById(int chcId) {
		return (SalChance) salChanceDao.queryById(chcId);
	}
	//实际修改
	public void update(int chcId,String chcDesc,String chcDueTo) {
		salChanceDao.update(chcId,chcDesc,chcDueTo);
	}
	
	//分页
	public List<SalChance> byPage(int pageIndex, int pageSize) {
		List list = salChanceDao.byPage(pageIndex, pageSize);
		return list;
	}
	
	public SalChanceDao getSalChanceDao() {
		return salChanceDao;

	}


	public long count() {
		// TODO Auto-generated method stub
		long count = salChanceDao.count();
		return count;
	
	}



	public List<SalChance> superselect(SalChance salChance, int pageIndex,
			int pageSize) {
		// TODO Auto-generated method stub
		List list=salChanceDao.superselect(salChance,  pageIndex, pageSize);
		return list;
	}

}
