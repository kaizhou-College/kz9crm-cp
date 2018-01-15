package com.cp.dao;

import java.util.List;

public interface OrdersDao {

	List select(Class class1);

	long count();

	List bypage(int pageIndex, int pageSize);

}
