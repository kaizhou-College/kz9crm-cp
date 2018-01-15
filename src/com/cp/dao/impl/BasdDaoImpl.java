package com.cp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.BasdDao;
import com.cp.entity.CstService;
import com.cp.entity.Product;
import com.cp.entity.Storage;

public class BasdDaoImpl extends HibernateDaoSupport implements BasdDao{
//产品信息分页
	public List byPage(int pageIndex, int pageSize) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Product.class);
		int max=(pageIndex-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		//System.out.println("dao里"+list+"daolist===============");
		return list;
	}

	public Long count() {
		//System.out.println("hbyhyhnuuh");
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Product.class);
		//加投影
		createCriteria.setProjection(Projections.count("prodId"));
		List<Long> list = createCriteria.list();
		return  list.get(0);
	}

	//库存分页
	public Long Storagecount() {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Storage.class);
		//加投影
		createCriteria.setProjection(Projections.count("stkId"));
		List<Long> list = createCriteria.list();
		return  list.get(0);
	}

	public List byStoragePage(int pageIndex, int pageSize) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(Storage.class);
		int max=(pageIndex-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		return list;
	}

	public List superselect(Storage storage, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		int max=(pageIndex-1)*pageSize;
		Criteria createCriteria = session.createCriteria(Storage.class);
		
		System.out.println(storage);
		if(storage.getStkProdId()!=null){
			createCriteria.add(Restrictions.eq("stkProdId",+storage.getStkProdId()));
		}
		
		
		if(BasdDaoImpl.isNOtNull(storage.getStkWarehouse())){
			createCriteria.add(Restrictions.like("stkWarehouse","%"+storage.getStkWarehouse()+"%"));
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

	public List superselect2(Product product, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		System.out.println("这里高级查询");
		Session session = this.getSession();
		int max=(pageIndex-1)*pageSize;
		Criteria createCriteria = session.createCriteria(Product.class);
		
		System.out.println(product);
		
		
		if(BasdDaoImpl.isNOtNull(product.getProdName())){
			createCriteria.add(Restrictions.like("prodName","%"+product.getProdName()+"%"));
		}
		if(BasdDaoImpl.isNOtNull(product.getProdType())){
			createCriteria.add(Restrictions.like("prodType","%"+product.getProdType()+"%"));
		}
		if(BasdDaoImpl.isNOtNull(product.getProdBatch())){
			createCriteria.add(Restrictions.like("prodBatch","%"+product.getProdBatch()+"%"));
		}
		
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		System.out.println("高级查询的list"+list);
		return list;
	}	

}
