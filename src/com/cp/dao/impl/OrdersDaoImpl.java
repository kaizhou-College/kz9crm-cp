package com.cp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.OrdersDao;
import com.cp.entity.BasDict;
import com.cp.entity.CstCustomer;
import com.cp.entity.Orders;


public class OrdersDaoImpl extends HibernateDaoSupport implements  OrdersDao{

	public List select(Class class1) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		System.out.println("进入了DaoImol");
		System.out.println(session.createCriteria(Orders.class).list());
		return session.createCriteria(Orders.class).list();
	}

	public long count() {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		List<Object> list = session.createCriteria(Orders.class).list();
		return  list.size();
	}

	public List bypage(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Orders.class);
		int max=(pageIndex-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		return list;
	}


}
