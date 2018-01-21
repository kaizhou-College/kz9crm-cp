package com.cp.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.CstServiceDao;
import com.cp.entity.CstService;
import com.cp.service.CstServiceService;

@Service
public class CstServiceServiceImpl implements CstServiceService {
	
	@Autowired
	private CstServiceDao cstServiceDao;

	public void add(CstService cstService) {
		// TODO Auto-generated method stub
		cstServiceDao.add(cstService);
		
	}

	public List select() {
		// TODO Auto-generated method stub
		List list=cstServiceDao.select();
		return list;
	}

	public int count() {
		// TODO Auto-generated method stub
		return cstServiceDao.count();
	}

	public List<CstService> byPage(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		List list =cstServiceDao.bypage(pageIndex, pageSize);
		return list;
	}

	public void updatesvrDueId(Integer svrDueId, Integer svrId) {
		// TODO Auto-generated method stub
		cstServiceDao.updatesvrDueId(svrDueId,svrId);
		
	}

	public void delete(Integer svrId) {
		// TODO Auto-generated method stub
		cstServiceDao.delete(svrId);
	}

	public CstService selectid(Integer svrId) {
		// TODO Auto-generated method stub
		CstService cstService=cstServiceDao.selectid(svrId);
		return cstService;
	}

	public void detailupdate(Integer svrId, CstService cstService) {
		// TODO Auto-generated method stub
		cstServiceDao.detailupdate(svrId,cstService);
		
	}

	public void detailupdate2(Integer svrId, CstService cstService) {
		// TODO Auto-generated method stub
		cstServiceDao.detailupdate2(svrId,cstService);
		
	}

	public List<CstService> superselect(CstService cstService, Date date1,
			Date date2, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		List list=cstServiceDao.superselect(cstService, date1,date2, pageIndex, pageSize);
		return list;
	}

}
