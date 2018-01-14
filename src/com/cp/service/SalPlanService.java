package com.cp.service;

import java.util.List;

import com.cp.entity.SalChance;
import com.cp.entity.SalPlan;
import com.cp.entity.SalPlanTemp;

public interface SalPlanService {
//分页
	long count();

	List byPage(int page ,int pageSize);;

	SalChance planList(Integer chcId);

		void ajaxPlan(SalPlan salplan);
//高级查询
			Long countsuper(SalPlanTemp salPlanTemp);

	List<SalChance> superbyPage(SalPlanTemp salPlanTemp, int page, int pageSize);

}
