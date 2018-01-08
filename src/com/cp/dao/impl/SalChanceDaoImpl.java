package com.cp.dao.impl;

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
}
