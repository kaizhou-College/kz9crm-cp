package com.cp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.CstActivityDao;
import com.cp.entity.CstActivity;
import com.cp.entity.CstCustomer;
import com.cp.entity.CstLinkman;
import com.cp.service.CstActivityService;

@Service
public class CstActivityServiceImpl implements CstActivityService{
	@Autowired
	private CstActivityDao cstActivityDao;

	public List select(String custNo) {
		// TODO Auto-generated method stub
		List list=cstActivityDao.select(custNo);
		return list;
	}

	public CstCustomer select2(String custNo) {
		// TODO Auto-generated method stub
		CstCustomer cstCustomer=cstActivityDao.select2(custNo);
		return cstCustomer;
	}

	public void delete(Integer atvId) {
		// TODO Auto-generated method stub
		cstActivityDao.delete(atvId);
		
	}

	public CstActivity toupdate(Integer atvId) {
		// TODO Auto-generated method stub
		
		CstActivity cstActivity=cstActivityDao.toupdate(atvId);
		
		return cstActivity;
	}

	public void update(CstActivity cstActivity2) {
		// TODO Auto-generated method stub
		cstActivityDao.update(cstActivity2);
	}

	public void add(CstCustomer cstCustomer, CstActivity cstActivity2) {
		// TODO Auto-generated method stub
		cstActivityDao.add(cstCustomer,cstActivity2);
	}

}
