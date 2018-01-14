package com.cp.dao;

import java.util.List;

import com.cp.entity.SalChance;
import com.cp.entity.SalPlan;
import com.cp.entity.SalPlanTemp;

public interface SalPlanDao {
//分页
	List byPage(int pageIndex, int pageSize);

	Long count();

	SalChance planList(Integer chcId);
//保存
		void ajaxPlan(SalPlan salplan);
//高级
		Long countsuper(SalPlanTemp salPlanTemp);

	List superbyPage(SalPlanTemp salPlanTemp, int page, int pageSize);

}
