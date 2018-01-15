package com.cp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.ReptDao;
import com.cp.entity.CstCustomer;
import com.cp.entity.CstLost;
import com.cp.entity.CstService;
import com.cp.entity.OrdersLine;
import com.cp.service.ReptService;
@Service
public class ReptServiceImpl implements ReptService{
	@Autowired
	private ReptDao reptDao;
	public List<CstCustomer> select(Class<CstCustomer> clazz) {
		List list=reptDao.select(clazz);
		return list;
	}
	public List<CstService> serSelect(Class<CstService> clazz1) {
		List list1=reptDao.serSelect(clazz1);
		return list1;
	}
/*	public List<CstLost> lostSelect(Class<CstLost> class3) {
		List list3=reptDao.lostSelect(class3);
		return list3;
	}*/
	//分页
	public List<CstLost> byPage(int pageIndex, int pageSize) {
		List list = reptDao.byPage(pageIndex, pageSize);
		return list;
	}
	public long count() {
		Long count = reptDao.count();
		return count;
	}
	public List<OrdersLine> conteSelect() {
		return reptDao.conteSelect();
	}
	public String queryByIds(Integer oddOrderId) {
		return reptDao.queryByIds(oddOrderId);
	}
	public List<CstLost> superselect(CstLost cstLost, int pageIndex,
			int pageSize) {
		// TODO Auto-generated method stub
		List list=reptDao.superselect(cstLost, pageIndex, pageSize);
		return list;
	}


}
