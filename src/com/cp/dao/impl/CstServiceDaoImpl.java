package com.cp.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.CstLinkmanDao;
import com.cp.dao.CstServiceDao;
import com.cp.entity.BasDict;
import com.cp.entity.CstCustomer;
import com.cp.entity.CstLinkman;
import com.cp.entity.CstService;
import com.cp.entity.Orders;
import com.cp.entity.SalChance;

public class CstServiceDaoImpl extends HibernateDaoSupport  implements CstServiceDao{

	public void add(CstService cstService) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		
		session.save(cstService);
		System.out.println("新增成功");
	}

	public List select() {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		System.out.println("进入了DaoImol");
		return session.createCriteria(CstService.class).list();
		
	}

	public int count() {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		List<Object> list = session.createCriteria(CstService.class).list();
		return  list.size();
		
	}

	public List bypage(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(CstService.class);
		int max=(pageIndex-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		return list;
		
	}

	public void updatesvrDueId(Integer svrDueId,Integer svrId) {
		// TODO Auto-generated method stuba
		Session session = this.getSession();
		CstService cstService= (CstService) session.get(CstService.class, svrId);
		cstService.setSvrDueId(svrDueId);
		session.update(cstService);
		System.out.println("修改成功");
		
	}

	
	
	public void delete(Integer svrId) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		System.out.println("得到的id是"+svrId);
		CstService cstService=new CstService();
		cstService.setSvrId(svrId);
		session.delete(cstService);
		System.out.println("删除成功");
		
	}

	public CstService selectid(Integer svrId) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		CstService cstService= (CstService) session.get(CstService.class, svrId);
		return cstService;
	}

	public void detailupdate(Integer svrId, CstService cstService) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		CstService cst= (CstService) session.get(CstService.class, svrId);
		cst.setSvrDeal(cstService.getSvrDeal());
		cst.setSvrDueTo(cstService.getSvrDueTo());
		cst.setSvrDealDate(cstService.getSvrDealDate());
		cst.setSvrResult(cstService.getSvrResult());
		cst.setSvrSatisfy(cstService.getSvrSatisfy());
		
		System.out.println("修改成功");
		
	}

	public void detailupdate2(Integer svrId, CstService cstService) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		CstService cst= (CstService) session.get(CstService.class, svrId);
		cst.setSvrResult(cstService.getSvrResult());
		cst.setSvrSatisfy(cstService.getSvrSatisfy());
		System.out.println("修改成功2");
		
	}
	
	private static boolean isNOtNull(String str){
		boolean isNotNull=false;
		if(str.trim().length()>0){
			isNotNull=true;
		}
		return isNotNull;
	}	

	

	public List superselect(CstService cstService, Date date1, Date date2,
			int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		int max=(pageIndex-1)*pageSize;
		Criteria createCriteria = session.createCriteria(CstService.class);
		
		System.out.println("在啊啊啊啊啊阿");
		System.out.println(cstService);
		if(CstServiceDaoImpl.isNOtNull(cstService.getSvrCustName())){
			createCriteria.add(Restrictions.like("svrCustName","%"+cstService.getSvrCustName()+"%"));
		}
		if(CstServiceDaoImpl.isNOtNull(cstService.getSvrTitle())){
			createCriteria.add(Restrictions.like("svrTitle","%"+cstService.getSvrTitle()+"%"));
		}
		if(CstServiceDaoImpl.isNOtNull(cstService.getSvrType())){
			createCriteria.add(Restrictions.like("svrType","%"+cstService.getSvrType()+"%"));
		}
		if(CstServiceDaoImpl.isNOtNull(cstService.getSvrStatus())){
			createCriteria.add(Restrictions.like("svrStatus","%"+cstService.getSvrStatus()+"%"));
		}
		
		System.out.println(date1);
		System.out.println(date2);
		if(date1!=null&&date2!=null){
			createCriteria.add(Restrictions.between("svrCreateDate",date1,date2));
		}
		
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		System.out.println("高级查询的list"+list);
		return list;
	}


}
