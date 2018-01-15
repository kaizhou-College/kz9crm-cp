package com.cp.service;

import java.util.List;

import com.cp.entity.SalChance;
import com.cp.entity.SalPlan;
import com.cp.entity.SalPlanTemp;

public interface SalPlanService {
//分页
	long count();

	List byPage(int page ,int pageSize);;

	//执行计划时
	void planResult(SalPlan salplan);
	//如果机会开发成功
	void planSuccess(SalChance salChance);
	//执行计划时de显示
	SalChance planList(Integer chcId);
//删除
	void salPlanDel(SalPlan salplan);
//添加
	void salPlanAdd(SalChance salChance, SalPlan salplan);
//保存
	void ajaxPlan(SalPlan salplan);
//高级查询
	Long superCount(SalPlanTemp salPlanTemp);

	List<SalChance> superByPage(SalPlanTemp salPlanTemp, int page, int pageSize);

}
