package com.cp.service;

import java.util.List;

import com.cp.entity.CstCustomer;

public interface CstCustomerService {

	List select(Class class1);

	CstCustomer toupdate(String custNo);

	void update(String custNo, CstCustomer cstCustomer2);

	void delete(String custNo);

	int count();

	List<CstCustomer> byPage(int pageIndex, int pageSize);

}
