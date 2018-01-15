package com.cp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.SalPlanDao;
import com.cp.entity.SalChance;
import com.cp.entity.SalPlan;
import com.cp.entity.SalPlanTemp;
import com.cp.service.SalPlanService;
@Service
public class SalPlanServiceImpl implements SalPlanService{
	@Autowired
	private SalPlanDao salPlanDao;
//分页
	public List byPage(int page, int pageSize) {
//		System.out.println("Biz的============"+page);
//		System.out.println("Biz的pageSize====================="+pageSize);
		List pages = salPlanDao.byPage(page, pageSize);
		return pages;
	}//一共多少页
	public long count() {
		Long countPlan = salPlanDao.count();
		//System.out.println("Biz的counPlant========"+countPlan);
		return countPlan;
	}
	//执行计划时的结果
	public void planResult(SalPlan salplan) {
		salPlanDao.planResult(salplan);
	}
	//如果机会开发成功
	public void planSuccess(SalChance salChance) {
		salPlanDao.planSuccess(salChance);
	}
	//执行计划时de显示
	public SalChance planList(Integer chcId) {
		SalChance planList = salPlanDao.planList(chcId);
		return planList;
	}
	//删除
	public void salPlanDel(SalPlan salplan) {
		salPlanDao.salPlanDel(salplan);
	}
	//添加
	public void salPlanAdd(SalChance salChance, SalPlan salplan) {
		salPlanDao.salPlanAdd(salChance, salplan);
	}
	//保存
	public void ajaxPlan(SalPlan salplan) {
		salPlanDao.ajaxPlan(salplan);
	}
	///高级
	public List<SalChance> superByPage(SalPlanTemp salPlanTemp, int page,
			int pageSize) {
		List list = salPlanDao.superByPage(salPlanTemp,page,pageSize );
		System.out.println("biz高级======"+salPlanTemp);
		System.out.println("biz高级的page"+page);
		System.out.println("biz高级pagesize"+pageSize);
		return list;
	}
	public Long superCount(SalPlanTemp salPlanTemp) {
		Long superCount = salPlanDao.superCount(salPlanTemp);
		System.out.println("biz高级一共"+superCount);
		return superCount;
	}
	

}
