package com.cp.service;

import java.util.List;

import com.cp.entity.CstActivity;
import com.cp.entity.CstCustomer;

public interface CstActivityService {

	List select(String custNo);

	CstCustomer select2(String custNo);

	void delete(Integer atvId);

	CstActivity toupdate(Integer atvId);

	void update(CstActivity cstActivity2);

	void add(CstCustomer cstCustomer, CstActivity cstActivity2);



}
