package com.cp.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.OrdersDao;
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


}
