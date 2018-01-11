package com.cp.dao;

import java.util.List;

import com.cp.entity.CstCustomer;
import com.cp.entity.CstLinkman;

public interface CstLinkmanDao {

	List select(Class class1, String custNo);

	void delete(Integer lkmId);

	CstLinkman toupdate(Integer lkmId);

	void update(CstLinkman cstLinkman2);

	void add(CstCustomer cstCustomer, CstLinkman cstLinkman2);

	CstCustomer select2(String custNo);

}
