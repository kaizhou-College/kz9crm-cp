package com.cp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.CstCustomerDao;
import com.cp.entity.BasDict;
import com.cp.entity.CstCustomer;
import com.cp.entity.SalChance;

public class CstCustomerDaoImpl  extends HibernateDaoSupport implements CstCustomerDao{

	
	public List select(Class class1) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		System.out.println("进入了DaoImol");
		return session.createCriteria(CstCustomer.class).list();
	}


	public CstCustomer toupdate(String custNo) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		CstCustomer cstCustomer = (CstCustomer) session.get(CstCustomer.class, custNo);
		
		return cstCustomer;
	}




	public void update(String custNo, CstCustomer cstCustomer2) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		session.update(cstCustomer2);
		System.out.println("修改成功");
	}


	public void update(String custNo) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		CstCustomer cstCustomer =new CstCustomer();
		cstCustomer.setCustNo(custNo);
		session.delete(cstCustomer);
		System.out.println("删除成功");
		
		
	}

	
	
	
//一共多少
	public int count() {
		Session session = this.getSession();
		List<Object> list = session.createCriteria(CstCustomer.class).list();
		return  list.size();
	}

	

	public List bypage(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(CstCustomer.class);
		int max=(pageIndex-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		return list;
	}


	public List superselect(CstCustomer cstCustomer, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		int max=(pageIndex-1)*pageSize;
		Criteria createCriteria = session.createCriteria(CstCustomer.class);
		
		System.out.println("在啊啊啊啊啊阿");
		System.out.println(cstCustomer);
		if(CstCustomerDaoImpl.isNOtNull(cstCustomer.getCustNo())){
			createCriteria.add(Restrictions.like("custNo","%"+cstCustomer.getCustNo()+"%"));
		}
		if(CstCustomerDaoImpl.isNOtNull(cstCustomer.getCustName())){
			createCriteria.add(Restrictions.like("custName","%"+cstCustomer.getCustName()+"%"));
		}
		if(CstCustomerDaoImpl.isNOtNull(cstCustomer.getCustRegion())){
			createCriteria.add(Restrictions.like("custRegion","%"+cstCustomer.getCustRegion()+"%"));
		}
		if(CstCustomerDaoImpl.isNOtNull(cstCustomer.getCustManagerName())){
			createCriteria.add(Restrictions.like("custManagerName","%"+cstCustomer.getCustManagerName()+"%"));
		}
		if((cstCustomer.getCustLevel()!=0)){
			createCriteria.add(Restrictions.eq("custLevel",+cstCustomer.getCustLevel()));
		}
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		System.out.println("高级查询的list"+list);
		return list;
	}
	
	private static boolean isNOtNull(String str){
		boolean isNotNull=false;
		if(str.trim().length()>0){
			isNotNull=true;
		}
		return isNotNull;
	}	


	
	
}
