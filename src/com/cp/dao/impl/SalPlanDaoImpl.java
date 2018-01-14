package com.cp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.SalPlanDao;
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
		int max=(page)*pageSize;
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(SalChance.class);
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);///每页显示的数据
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
	
	
	public SalChance planList(Integer chcId) {
		Session session = this.getSession();
		SalChance list =(SalChance) session.get(SalChance.class,chcId);
		return list;
	}
	//保存
		public void ajaxPlan(SalPlan salplan) {
		Session session = this.getSession();
		SalPlan plan =(SalPlan) session.get(SalPlan.class,salplan.getPlaId());
		plan.setPlaTodo(salplan.getPlaTodo());
	}
	//高级
		public Long countsuper(SalPlanTemp salPlanTemp) {
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
	public List superbyPage(SalPlanTemp salPlanTemp, int page, int pageSize) {
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
