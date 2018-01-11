package com.cp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.CstLostDao;
import com.cp.entity.CstCustomer;
import com.cp.entity.CstLost;
import com.cp.entity.CstLostTemp;
import com.cp.entity.Orders;

public class CstLostDaoImpl extends HibernateDaoSupport implements CstLostDao{
	public boolean isNotNuhll(String str){
		boolean num=false;
		if(str.trim().length()>0){
			num=true;
		}
		return num;
	}
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
//一共多少
	public Long count() {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(CstLost.class);
		//加投影
		createCriteria.setProjection(Projections.count("lstId"));
		List<Long> list = createCriteria.list();
		return  list.get(0);
	}
	//高级
	public List superbyPage(CstLostTemp cstLostTemp, int page, int pageSize) {
		int max=(page-1)*pageSize;
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(CstLost.class);
		if(isNotNuhll(cstLostTemp.getCstname())){
			createCriteria.add(Restrictions.like("lstCustName","%"+cstLostTemp.getCstname()+"%"));
		}
		if(isNotNuhll(cstLostTemp.getCstmangername())){
			createCriteria.add(Restrictions.like("lstCustManagerName","%"+cstLostTemp.getCstmangername()+"%"));
		}
		if(isNotNuhll(cstLostTemp.getZt())){
			createCriteria.add(Restrictions.like("lstStatus","%"+cstLostTemp.getZt()+"%"));
		}
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		return list;
	}

	public Long supercountList(CstLostTemp cstLostTemp) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(CstLost.class);
		//添加条件
		if(isNotNuhll(cstLostTemp.getCstname())){
			createCriteria.add(Restrictions.like("lstCustName","%"+cstLostTemp.getCstname()+"%"));
		}
		if(isNotNuhll(cstLostTemp.getCstmangername())){
			createCriteria.add(Restrictions.like("lstCustManagerName","%"+cstLostTemp.getCstmangername()+"%"));
		}
		if(isNotNuhll(cstLostTemp.getZt())){
			createCriteria.add(Restrictions.like("lstStatus","%"+cstLostTemp.getZt()+"%"));
		}
		List<Long> list = createCriteria.list();
		 
		return list.get(0);
	}
	
	
	//定时用的
	public List<CstLost> CheckOutTime() {
		Session session = this.getSession();
		String hql1 = "from Orders where months_between(sysdate,odrDate) > 6 ";
		String hql2 = "from CstCustomer where custName=?";
		List<Orders> list1 = session.createQuery(hql1).list();
		List<CstCustomer> list2 = new ArrayList<CstCustomer>();
		List<CstLost> list3 = new ArrayList<CstLost>();
		for(int i =0;i<list1.size();i++){
			CstLost cstLost = new CstLost();
			list2 = session.createQuery(hql2).setParameter(0, list1.get(i).getOdrCustomer()).list();
			cstLost.setLstCustManagerId(list2.get(i).getCustManagerId());
			cstLost.setLstCustManagerName(list2.get(i).getCustManagerName());
			cstLost.setLstCustName(list2.get(i).getCustName());
			cstLost.setLstStatus(list2.get(i).getCustStatus());
			cstLost.setLstDelay("暂无");
			cstLost.setLstLastOrderDate(list1.get(i).getOdrDate());
			cstLost.getCstCustomer().setCustNo(list2.get(i).getCustNo());
			//setLstCustNo(list2.get(i).getCustNo());
			list3.add(cstLost);
		}
		return list3;
	}
	public void add(CstLost cstLost) {
		Session session = this.getSession();
		session.save(cstLost);
	}
}
