package com.cp.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.CstLinkmanDao;
import com.cp.entity.CstCustomer;
import com.cp.entity.CstLinkman;

public class CstLinkmanDaoImpl extends HibernateDaoSupport  implements CstLinkmanDao {

	public List select(Class class1,String custNo) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		System.out.println("进入了DaoImol准备查询");
		
		CstCustomer cstCustomer =(CstCustomer) session.get(CstCustomer.class,custNo);
		
		System.out.println("哈哈哈哈哈哈哈哈哈哈哈或或或或或或或"+cstCustomer);
		
		Set<CstLinkman> cstLinkman = cstCustomer.getCstLinkman();
		System.out.println("这里是set"+cstLinkman);
		List list=new ArrayList();
		list.addAll(cstLinkman);
		System.out.println("这里是list"+list);
		return list;
	}
	
	
	
	public void delete(Integer lkmId) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		CstLinkman cstLinkman=new CstLinkman();
		cstLinkman.setLkmId(lkmId);
		session.delete(cstLinkman);
		System.out.println("删除成功");
		
	}

	public CstLinkman toupdate(Integer lkmId) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		CstLinkman cstLinkman = (CstLinkman) session.get(CstLinkman.class, lkmId);
		return cstLinkman;
	}

	public void update(CstLinkman cstLinkman2) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		CstLinkman cstLinkman = (CstLinkman) session.get(CstLinkman.class, cstLinkman2.getLkmId());
		System.out.println(cstLinkman);
		System.out.println(cstLinkman2);
		cstLinkman.setLkmName(cstLinkman2.getLkmName());
		cstLinkman.setLkmSex(cstLinkman2.getLkmSex());
		cstLinkman.setLkmPostion(cstLinkman2.getLkmPostion());
		cstLinkman.setLkmTel(cstLinkman2.getLkmTel());
		cstLinkman.setLkmMobile(cstLinkman2.getLkmMobile());
		cstLinkman.setLkmMemo(cstLinkman2.getLkmMemo());
		System.out.println("修改成功");
		
	}
	
	public CstCustomer select2(String custNo) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		CstCustomer cstCustomer =(CstCustomer) session.get(CstCustomer.class,custNo);
		return cstCustomer;
	}

	
	

	public void add(CstCustomer cstCustomer,CstLinkman cstLinkman2) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		System.out.println("进入Dao增加"+cstLinkman2);
		
		CstCustomer  cst =(CstCustomer) session.get(CstCustomer.class,cstCustomer.getCustNo());
		
		Set<CstLinkman> cstLinkman = cst.getCstLinkman();
		cstLinkman.add(cstLinkman2);
		cstLinkman2.setCstCustomer(cst);
		
		
		System.out.println("新增成功");
		
	}
	
	
	


}
