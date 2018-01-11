package com.cp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.CstLinkmanDao;
import com.cp.dao.OrdersDao;
import com.cp.entity.Orders;
import com.cp.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	private OrdersDao ordersDao;
	

	public List select(Class class1) {
		// TODO Auto-generated method stub
		List list=ordersDao.select(class1);
		return list;
	}



}
