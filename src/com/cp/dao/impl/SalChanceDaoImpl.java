package com.cp.dao.impl;


import java.util.List;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.SalChanceDao;
import com.cp.entity.SalChance;


public class SalChanceDaoImpl extends HibernateDaoSupport implements SalChanceDao{

	public List select(Class clazz) {
		Session session = this.getSession();
		return session.createCriteria(SalChance.class).list();
}
	public Object todispatch(int chcId) {
		// TODO Auto-generated method stub
		System.out.println("进入了DaoImpl");
		Session session  = this.getSession();
		
		SalChance salChance = (SalChance) session.get(SalChance.class, chcId);
		System.out.println(salChance);
		System.out.println("完成");
		
		return salChance;
	}

	public void dispatch(int chcId,int chcCreateId, Date chcDueDate) {
		// TODO Auto-generated method stub
		System.out.println("进入了DaoImpl");
		System.out.println("id是"+chcId);
		System.out.println("指派人Id是"+chcCreateId);
		System.out.println("指派时间是"+chcDueDate);
		
		Session session  = this.getSession();
		
		
//		SalChance salchance=new SalChance();
		
		SalChance salchance = (SalChance) session.get(SalChance.class, chcId);
		
		salchance.setChcCreateId(chcCreateId);
		salchance.setChcDueDate(chcDueDate);
		session.update(salchance);
		
		
		System.out.println("指派成功");
		
		
	}

	public void delete(int chcId) {
		// TODO Auto-generated method stub
		Session session  = this.getSession();
		System.out.println("这里是DaoImpl"+chcId);
		
		SalChance salchance=new SalChance();
		salchance.setChcId(chcId);
		System.out.println(salchance);
		session.delete(salchance);
		
		System.out.println("删除成功");
		
		
	}

	public void save(SalChance salChance2) {
		// TODO Auto-generated method stub
		Session session  = this.getSession();
		System.out.println("这里是DaoImpl"+salChance2);
		session.save(salChance2);
		System.out.println("新增成功");
		
	}
	
	
	
}
