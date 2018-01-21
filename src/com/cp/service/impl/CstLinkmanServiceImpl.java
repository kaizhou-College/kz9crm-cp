package com.cp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.CstLinkmanDao;
import com.cp.entity.CstCustomer;
import com.cp.entity.CstLinkman;
import com.cp.service.CstLinkmanService;

@Service
public class CstLinkmanServiceImpl implements CstLinkmanService {
	@Autowired
	private CstLinkmanDao cstLinkmanDao;

	public List select(Class class1,String custNo) {
		// TODO Auto-generated method stub
		List list=cstLinkmanDao.select(class1,custNo);
		return list;
	}

	public void delete(Integer lkmId) {
		// TODO Auto-generated method stub
		cstLinkmanDao.delete(lkmId);
		
	}

	public CstLinkman toupdate(Integer lkmId) {
		// TODO Auto-generated method stub
		CstLinkman cstLinkman=cstLinkmanDao.toupdate(lkmId);
		return cstLinkman;
	}

	public void update(CstLinkman cstLinkman2) {
		// TODO Auto-generated method stub
		cstLinkmanDao.update(cstLinkman2);
		
	}

	public void add(CstCustomer cstCustomer,CstLinkman cstLinkman2) {
		// TODO Auto-generated method stub
		cstLinkmanDao.add(cstCustomer,cstLinkman2);
		
	}

	public CstCustomer select2(String custNo) {
		// TODO Auto-generated method stub
		CstCustomer cstCustomer=cstLinkmanDao.select2(custNo);
		return cstCustomer;
	}



}
