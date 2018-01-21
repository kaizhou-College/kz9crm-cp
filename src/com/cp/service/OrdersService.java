package com.cp.service;

import java.util.List;

import com.cp.entity.Orders;

public interface OrdersService {

	List select(Class class1);

	long count();

	List<Orders> byPage(int pageIndex, int pageSize);


}
