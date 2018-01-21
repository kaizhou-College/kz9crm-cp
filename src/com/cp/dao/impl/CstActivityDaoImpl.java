package com.cp.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.CstActivityDao;
import com.cp.entity.CstActivity;
import com.cp.entity.CstCustomer;
import com.cp.entity.CstLinkman;

public class CstActivityDaoImpl extends HibernateDaoSupport implements CstActivityDao{

	public List select(String custNo) {
		// TODO Auto-generated method stub
		
		
		Session session = this.getSession();
		System.out.println("进入了DaoImol准备查询");
		
		CstCustomer cstCustomer =(CstCustomer) session.get(CstCustomer.class,custNo);
		Set<CstActivity> cstActivity = cstCustomer.getCstActivity();
		System.out.println("这里是set"+cstActivity);
		List list=new ArrayList();
		list.addAll(cstActivity);
		System.out.println("这里是list"+list);
		return list;
	}

	public CstCustomer select2(String custNo) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		CstCustomer cstCustomer =(CstCustomer) session.get(CstCustomer.class,custNo);
		return cstCustomer;
	}

	public void delete(Integer atvId) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		CstActivity cstActivity=new CstActivity();
		cstActivity.setAtvId(atvId);
		session.delete(cstActivity);
		System.out.println("删除成功");
		
	}

	public CstActivity toupdate(Integer atvId) {
		// TODO Auto-generated method stub
		
		Session session=this.getSession();
		CstActivity cstActivity = (CstActivity) session.get(CstActivity.class, atvId);
		return cstActivity;
	}

	public void update(CstActivity cstActivity2) {
		// TODO Auto-generated method stub
		
		Session session=this.getSession();
		
		CstActivity cstActivity = (CstActivity) session.get(CstActivity.class, cstActivity2.getAtvId());
		cstActivity.setAtvCustName(cstActivity2.getAtvCustName());
		cstActivity.setAtvDate(cstActivity2.getAtvDate());
		cstActivity.setAtvDesc(cstActivity2.getAtvDesc());
		cstActivity.setAtvId(cstActivity2.getAtvId());
		cstActivity.setAtvPlace(cstActivity2.getAtvPlace());
		cstActivity.setAtvTitle(cstActivity2.getAtvTitle());
		System.out.println("修改成功");
		
	}

	public void add(CstCustomer cstCustomer, CstActivity cstActivity2) {
		// TODO Auto-generated method stub
		
		Session session=this.getSession();
		System.out.println("进入了Dao腌啊啊啊啊啊啊啊");
		
		CstCustomer  cst =(CstCustomer) session.get(CstCustomer.class,cstCustomer.getCustNo());
		System.out.println(cstCustomer);
		System.out.println(cst);
		Set<CstActivity> cstActivity = cst.getCstActivity();
		cstActivity.add(cstActivity2);
		cstActivity2.setCstCustomer(cst);
		
		System.out.println("新增成功");
		
	}

}
