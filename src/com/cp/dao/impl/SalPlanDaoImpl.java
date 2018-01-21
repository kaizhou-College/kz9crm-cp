package com.cp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.SalPlanDao;
import com.cp.entity.CstCustomer;
import com.cp.entity.SalChance;
import com.cp.entity.SalPlan;
import com.cp.entity.SalPlanTemp;

public class SalPlanDaoImpl extends HibernateDaoSupport implements SalPlanDao{
	
	public boolean isNotNuhll(String str){
		boolean num=false;
		if(str.trim().length()>0){
			num=true;
		}
		return num;
	}
//分页
	public List byPage(int page, int pageSize) {
		int max=(page-1)*pageSize;//从第几条数据开始 
//		System.out.println("Dao的从第几条"+max);
//		System.out.println("Dao的page+====================="+page);
//		System.out.println("Dao的pageSize============"+pageSize);
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(SalChance.class); //查询 SalChance 表
		createCriteria.createAlias("salPlan","s");
		createCriteria.setFirstResult(max);//从第几条数据开始
		createCriteria.setMaxResults(pageSize);///每页显示
		List list = createCriteria.list();
		return list;
	}
	public Long count() {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(SalChance.class);
		createCriteria.createAlias("salPlan","s");
		//添加投影
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.count("chcId"));
		//把投影放进去
		createCriteria.setProjection(projectionList);
		List<Long> list = createCriteria.list();
		return list.get(0);
	}
	

	//执行计划时的结果
	public void planResult(SalPlan salplan) {
		Session session = this.getSession();
		SalPlan plan =(SalPlan) session.get(SalPlan.class,salplan.getPlaId());
		if(salplan.getPlaResult()!=null){
			plan.setPlaResult(salplan.getPlaResult());
		}
	}

	//如果机会开发成功
	public void planSuccess(SalChance salChance) {
		Session session = this.getSession();
		SalChance plan =(SalChance) session.get(SalChance.class,salChance.getChcId());
		plan.setChcStatus(4);
		CstCustomer customer=new CstCustomer();
		customer.setCustNo(plan.getChcId().toString());
		if(plan.getChcCustName()!=null){
			customer.setCustName(plan.getChcCustName());
		}
		session.save(customer);
	}

	//执行计划时de显示
	public SalChance planList(Integer chcId) {
		Session session = this.getSession();
		SalChance list =(SalChance) session.get(SalChance.class,chcId);
		return list;
	}

//删除
	public void salPlanDel(SalPlan salplan) {
		Session session = this.getSession();
		SalPlan salPlan =(SalPlan) session.get(SalPlan.class,salplan.getPlaId());
		session.delete(salPlan);
	}

//增加
	public void salPlanAdd(SalChance salChance, SalPlan salplan) {
		Session session = this.getSession();
		SalChance salChances =(SalChance) session.get(SalChance.class,salChance.getChcId());
		salChances.getSalPlan().add(salplan);
		salplan.setSalChance(salChances);
	}
//保存
	public void ajaxPlan(SalPlan salplan) {
		Session session = this.getSession();
		SalPlan salPlan =(SalPlan) session.get(SalPlan.class,salplan.getPlaId());
		salPlan.setPlaTodo(salplan.getPlaTodo());
	}
	//高级
		public Long superCount(SalPlanTemp salPlanTemp) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(SalChance.class);
		//添加投影
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.count("chcId"));
		createCriteria.setProjection(projectionList);
		//添加条件
		if(isNotNuhll(salPlanTemp.getCname())){
			createCriteria.add(Restrictions.like("chcCustName","%"+salPlanTemp.getCname()+"%"));
		}
		if(isNotNuhll(salPlanTemp.getCdesc())){
			createCriteria.add(Restrictions.like("chcTitle","%"+salPlanTemp.getCdesc()+"%"));
		}
		if(isNotNuhll(salPlanTemp.getLxr())){
			createCriteria.add(Restrictions.like("chcLinkman","%"+salPlanTemp.getLxr()+"%"));
		}
		List<Long> list = createCriteria.list();
		return list.get(0);
	}
	public List superByPage(SalPlanTemp salPlanTemp, int page, int pageSize) {
		int max=(page-1)*pageSize;
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(SalPlan.class);
		createCriteria.setProjection(Projections.projectionList().add(Projections.property("salChance.chcId")));
		List lists = createCriteria.list();
		Criteria createCriteria1 = session.createCriteria(SalChance.class);
		createCriteria1.add(Restrictions.in("chcId",lists));
		if(isNotNuhll(salPlanTemp.getCname())){
			createCriteria.add(Restrictions.like("chcCustName","%"+salPlanTemp.getCname()+"%"));
		}
		if(isNotNuhll(salPlanTemp.getCdesc())){
			createCriteria.add(Restrictions.like("chcTitle","%"+salPlanTemp.getCdesc()+"%"));
		}
		if(isNotNuhll(salPlanTemp.getLxr())){
			createCriteria.add(Restrictions.like("chcLinkman","%"+salPlanTemp.getLxr()+"%"));
		}
		createCriteria1.setFirstResult(max);
		createCriteria1.setMaxResults(pageSize);
		List list = createCriteria1.list();
		return list;
	}

}
