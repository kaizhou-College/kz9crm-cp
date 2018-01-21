package com.cp.service.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.CstLostDao;
import com.cp.entity.CstLost;
import com.cp.entity.CstLostTemp;
import com.cp.entity.SalChance;
import com.cp.service.CstLostService;
@Service
public class CstLostServiceImpl implements CstLostService{
	//分页
	@Autowired
	private CstLostDao cstLostDao;
	public List<CstLost> byPage(int pageIndex, int pageSize) {
			List list = cstLostDao.byPage(pageIndex, pageSize);
			return list;
	}

	public long count() {
		Long count = cstLostDao.count();
		return count;
	}

	//高级查询
	public List<CstLost> superbyPage(CstLostTemp cstLostTemp, int page,int pageSize) {
		List list = cstLostDao.superbyPage(cstLostTemp,page,pageSize );
		return list;
	}

	public Long supercountList(CstLostTemp cstLostTemp) {
		Long supercount = cstLostDao.supercountList(cstLostTemp);
		return supercount;
	}
//定时
	public void work() {
		System.out.println("定时---------------");
		List<CstLost> list = cstLostDao.CheckOutTime();
		for(int i =0;i<list.size();i++){
			CstLost cstLost = new CstLost();
			cstLost.setLstCustManagerId(list.get(i).getLstCustManagerId());
			cstLost.setLstCustManagerName(list.get(i).getLstCustManagerName());
			cstLost.setLstCustName(list.get(i).getLstCustName());
			cstLost.setLstStatus(list.get(i).getLstStatus());
			cstLost.setLstDelay("暂无");
			cstLost.setLstLastOrderDate(list.get(i).getLstLastOrderDate());
			cstLost.getCstCustomer().setCustNo(list.get(i).getCstCustomer().getCustNo());
		//	cstLost.setLstCustNo(list.get(i).getLstCustNo());
			add(cstLost);
		}
	}
	public void add(CstLost cstLost) {
		cstLostDao.add(cstLost);
	}

	public CstLost select(int lstId) {
		// TODO Auto-generated method stub
		CstLost cstLost =(CstLost) cstLostDao.todispatch(lstId);
		return cstLost;
	}

	public void update(int lstId, String lstReason) {
		// TODO Auto-generated method stub
		cstLostDao.update(lstId,lstReason);
		
	}

	public void update2(int lstId, String lstDelay) {
		// TODO Auto-generated method stub
		cstLostDao.update2(lstId,lstDelay);
		
	}
}
