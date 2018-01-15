package com.cp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.BasdDao;
import com.cp.entity.Product;
import com.cp.entity.Storage;

public class BasdDaoImpl extends HibernateDaoSupport implements BasdDao{
//产品信息分页
	public List byPage(int pageIndex, int pageSize) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Product.class);
		int max=(pageIndex-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		//System.out.println("dao里"+list+"daolist===============");
		return list;
	}

	public Long count() {
		//System.out.println("hbyhyhnuuh");
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Product.class);
		//加投影
		createCriteria.setProjection(Projections.count("prodId"));
		List<Long> list = createCriteria.list();
		return  list.get(0);
	}

	//库存分页
	public Long Storagecount() {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Storage.class);
		//加投影
		createCriteria.setProjection(Projections.count("stkId"));
		List<Long> list = createCriteria.list();
		return  list.get(0);
	}

	public List byStoragePage(int pageIndex, int pageSize) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Storage.class);
		int max=(pageIndex-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		return list;
	}

}
