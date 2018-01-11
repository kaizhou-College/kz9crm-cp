package com.cp.dao;

import java.util.List;

import com.cp.entity.CstCustomer;

public interface CstCustomerDao {

	List select(Class class1);

	CstCustomer toupdate(String custNo);

	void update(String custNo, CstCustomer cstCustomer2);

	void update(String custNo);

	List bypage(int pageIndex, int pageSize);

	int count();

}
