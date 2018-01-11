package com.cp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.ReptDao;
import com.cp.entity.CstCustomer;
import com.cp.entity.CstLost;
import com.cp.entity.CstService;
import com.cp.entity.Orders;
import com.cp.entity.OrdersLine;

public  class ReptDaoImpl extends HibernateDaoSupport implements ReptDao{

	public List select(Class<CstCustomer> clazz) {
		Session session = this.getSession();
		return session.createCriteria(CstCustomer.class).list();
	}

	public List serSelect(Class<CstService> clazz1) {
		Session session = this.getSession();
		return session.createCriteria(CstService.class).list();
	}

/*	public List lostSelect(Class<CstLost> class3) {
		Session session = this.getSession();
		return session.createCriteria(CstLost.class).list();
	}*/
//分页
	public List byPage(int pageIndex, int pageSize) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(CstLost.class);
		int max=(pageIndex-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		return list;
	}

	public Long count() {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(CstLost.class);
		//加投影
		createCriteria.setProjection(Projections.count("lstId"));
		List<Long> list = createCriteria.list();
		return  list.get(0);
	}

	public List conteSelect() {
		Session session = this.getSession();
		List<OrdersLine> list = session.createCriteria(OrdersLine.class).list();
	//	System.out.println(list+"dahhfdeqhfouqea===============");
		return list;
	}

	public String queryByIds(Integer oddOrderId) {
		Session session = this.getSession();
		Orders orders = (Orders) session.get(Orders.class, oddOrderId);
		//System.out.println("daoimpl里的==="+oddOrderId+"================");
		//System.out.println("daoimpl里的==="+orders.getOdrCustomer());
		return orders.getOdrCustomer();

	}
	

}
