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
		List byPage = salPlanDao.byPage(page, pageSize);
		return byPage;
	}
	public long count() {
		Long count = salPlanDao.count();
		return count;
	}
	public SalChance planList(Integer chcId) {
		SalChance planList = salPlanDao.planList(chcId);
		return planList;
	}
	//保存
	public void ajaxPlan(SalPlan salplan) {
		salPlanDao.ajaxPlan(salplan);
	}
	//高级查询
	public Long countsuper(SalPlanTemp salPlanTemp) {
		Long countsuper = salPlanDao.countsuper(salPlanTemp);
		return countsuper;
	}
	public List<SalChance> superbyPage(SalPlanTemp salPlanTemp, int page,
			int pageSize) {
		List list = salPlanDao.superbyPage(salPlanTemp,page,pageSize );
		return list;
	}
	

}
