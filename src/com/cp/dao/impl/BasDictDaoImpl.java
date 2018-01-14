package com.cp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.BasDictDao;
import com.cp.entity.BasDict;
import com.cp.entity.CstActivity;
import com.cp.entity.CstCustomer;

public class BasDictDaoImpl extends HibernateDaoSupport implements BasDictDao{

	public long count() {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		List<Object> list = session.createCriteria(BasDict.class).list();
		return  list.size();
	}

	public List bypage(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(BasDict.class);
		int max=(pageIndex-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		return list;
	}

	public BasDict toupdate(Integer dictId) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		BasDict basDict = (BasDict) session.get(BasDict.class, dictId);
		return basDict;
	}

	public void update(BasDict basDict, Integer dictId) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		BasDict bas = (BasDict) session.get(BasDict.class, dictId);
		System.out.println("这是1"+bas);
		System.out.println("这是二"+basDict);
		bas.setDictIsEditable(basDict.getDictIsEditable());
		bas.setDictItem(basDict.getDictItem());
		bas.setDictType(basDict.getDictType());
		bas.setDictValue(basDict.getDictValue());
		
	}

	public void delete(Integer dictId) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		BasDict basDict=new BasDict();
		basDict.setDictId(dictId);
		session.delete(basDict);
		
	}

	public void add(BasDict basDict) {
		// TODO Auto-generated method stub
		Session session=this.getSession();
		session.save(basDict);
		
	}
	
	private static boolean isNOtNull(String str){
		boolean isNotNull=false;
		if(str.trim().length()>0){
			isNotNull=true;
		}
		return isNotNull;
	}	

	
//	public List byPageDim(PlanDimList pdl,int page,int pageSize ){
//		int max=(page-1)*pageSize;
//		Session session = this.getSession();
//		Criteria createCriteria = session.createCriteria(SalPlan.class);
//		
//		createCriteria.setProjection(Projections.projectionList().add(Projections.property("salChance.chcId")));
//		List list3 = createCriteria.list();
//		Criteria createCriteria1 = session.createCriteria(SalChance.class);
//		createCriteria1.add(Restrictions.in("chcId",list3));
//		
//		
//		if(isNotNuhll(pdl.getName())){
//			createCriteria1.add(Restrictions.like("chcCustName","%"+pdl.getName()+"%"));
//		}
//		if(isNotNuhll(pdl.getGy())){
//			createCriteria1.add(Restrictions.like("chcTitle","%"+pdl.getGy()+"%"));
//		}
//		if(isNotNuhll(pdl.getLxr())){
//			createCriteria1.add(Restrictions.like("chcLinkman","%"+pdl.getLxr()+"%"));
//		}
//		
//		
//		
//		createCriteria1.setFirstResult(max);
//		createCriteria1.setMaxResults(pageSize);
//		List list = createCriteria1.list();
//		return list;
//	}

	
	public List superselect(BasDict basDict,int page,int pageSize) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		int max=(page-1)*pageSize;
		Criteria createCriteria = session.createCriteria(BasDict.class);
		
		System.out.println("在啊啊啊啊啊阿");
		System.out.println(basDict);
		if(BasDictDaoImpl.isNOtNull(basDict.getDictType())){
			createCriteria.add(Restrictions.like("dictType","%"+basDict.getDictType()+"%"));
		}
		if(BasDictDaoImpl.isNOtNull(basDict.getDictItem())){
			createCriteria.add(Restrictions.like("dictItem","%"+basDict.getDictItem()+"%"));
		}
		if(BasDictDaoImpl.isNOtNull(basDict.getDictValue())){
			createCriteria.add(Restrictions.like("dictValue","%"+basDict.getDictValue()+"%"));
		}
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		System.out.println("高级查询的list"+list);
		return list;

	}

	public long supercount(BasDict basDict) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(BasDict.class);
		
		
		if(BasDictDaoImpl.isNOtNull(basDict.getDictType())){
			createCriteria.add(Restrictions.like("dictType","%"+basDict.getDictType()+"%"));
		}
		if(BasDictDaoImpl.isNOtNull(basDict.getDictItem())){
			createCriteria.add(Restrictions.like("dictItem","%"+basDict.getDictItem()+"%"));
		}
		if(BasDictDaoImpl.isNOtNull(basDict.getDictValue())){
			createCriteria.add(Restrictions.like("dictValue","%"+basDict.getDictValue()+"%"));
		}
		List list = createCriteria.list();
		System.out.println("高级查询的list"+list);
		int count=list.size();
		System.out.println("高级查询的个数"+count);
		return count;
	}


}
