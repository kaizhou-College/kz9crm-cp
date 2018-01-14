package com.cp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.CstCustomerDao;
import com.cp.entity.CstCustomer;
import com.cp.service.CstCustomerService;


@Service
public class CstCustomerServiceImpl implements CstCustomerService  {
	@Autowired
	private CstCustomerDao cstCustomerDao;
	

	public List select(Class class1) {
		// TODO Auto-generated method stub
		List list=cstCustomerDao.select(class1);
		
		return list;
	}



	public CstCustomer toupdate(String custNo) {
		// TODO Auto-generated method stub
		CstCustomer cstCustomer=cstCustomerDao.toupdate(custNo);
		return cstCustomer;
	}





	public void update(String custNo, CstCustomer cstCustomer2) {
		// TODO Auto-generated method stub
		cstCustomerDao.update(custNo,cstCustomer2);
	}



	public void delete(String custNo) {
		// TODO Auto-generated method stub
		cstCustomerDao.update(custNo);
		
	}



	public List<CstCustomer> byPage(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		List list =cstCustomerDao.bypage(pageIndex, pageSize);
		return list;
	}



	public int count() {
		// TODO Auto-generated method stub
		int count = cstCustomerDao.count();
		return count;
	}



	public List<CstCustomer> superselect(CstCustomer cstCustomer,
			int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		List list=cstCustomerDao.superselect(cstCustomer,  pageIndex, pageSize);
		return list;
	}
	


}
