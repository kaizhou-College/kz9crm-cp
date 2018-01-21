package com.cp.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.SalChance;
import com.cp.entity.SalPlan;
import com.cp.entity.SalPlanTemp;
import com.cp.service.SalPlanService;


@Controller
@Scope("prototype")
public class SalPlanAction {
	@Autowired
	private SalPlanService  salPlanService;
	
	private SalPlanTemp  salPlanTemp;
	private SalChance salChance;
	private SalPlan salplan;
	private List<SalChance> listSalChance;
	private Long count;//一共多少条数据
	private int pageIndex;
	private int pageSize;//传进来的最大页数
	private String pageUrl;
	private int pageMax;//最大
	private int page;//初始
	private SalChance chancePlanList;//对象
	
	//分页
	public String byPage(){
		if(salPlanTemp==null){
			salPlanTemp=new SalPlanTemp(" "," "," ");
		}
		pageUrl="salPlan_byPage";
		page=1;
		pageSize=1;
		if(pageIndex>1){
			page=pageIndex;
		}
		//System.out.println("Action第几页============="+pageIndex);
		count = salPlanService.count();//查找所有数据的条数
		//System.out.println("Action一共============="+salPlanService.count());
		int max=new Long(count).intValue();
		//System.out.println("Action最大============"+max);
		pageMax=((max-1)/pageSize)+1;
		//System.out.println("ActionPageMax============"+pageMax);
		listSalChance = salPlanService.byPage(page, pageSize);
		return "byPage_success";
	}
	

	
	//执行计划时的结果
	public String salPlanResult(){
		salPlanService.planResult(salplan);
		return "planResult_success";
	}
	//如果机会开发成功就添加到客户管理里面
	public String planSuccess(){
		salPlanService.planSuccess(salChance);
		return "planSuccess_success";
	}
	
	//执行计划时de显示
	public String planList(){
		chancePlanList = salPlanService.planList(salChance.getChcId());
		return "planList_success";
	}
	//删除
	public String salPlanDel(){
		salPlanService.salPlanDel(salplan);
		return "salPlanDel_success";
	}
	
	//添加计划
	public String salPlanAdd(){
		salPlanService.salPlanAdd(salChance, salplan);
		return "salPlanAdd_success";
	}
	//保存
	public void  ajaxPlan(){
		salPlanService.ajaxPlan(salplan);
	}
	
	//正在开发中的机会显示
	public String planListShow(){
		chancePlanList = salPlanService.planList(salChance.getChcId());
		return "planListShow_success";
	}
	
	// 已经开放成功了的机会  显示
	public String planListSuccess(){
		chancePlanList = salPlanService.planList(salChance.getChcId());
		return "planListSuccess_success";
	}
	
	//高级查询
	public String superSel(){
		if(salPlanTemp==null){
			salPlanTemp=new SalPlanTemp();
		}
		pageUrl="salPlan_superSel";
		page=1;
		pageSize=2;
		if(pageIndex>1){
			page=pageIndex;
		}
		count= salPlanService.superCount(salPlanTemp);
		int max=new Long(count).intValue();
		pageMax=((max-1)/pageSize)+1;
		listSalChance = salPlanService.superByPage(salPlanTemp,page, pageSize);
		return"superSel_success";
	}
	
	
	
	
	
	
	
	public SalPlanTemp getSalPlanTemp() {
		return salPlanTemp;
	}
	public void setSalPlanTemp(SalPlanTemp salPlanTemp) {
		this.salPlanTemp = salPlanTemp;
	}
	public SalChance getSalChance() {
		return salChance;
	}
	public void setSalChance(SalChance salChance) {
		this.salChance = salChance;
	}
	public SalPlan getSalplan() {
		return salplan;
	}
	public void setSalplan(SalPlan salplan) {
		this.salplan = salplan;
	}
	public List<SalChance> getListSalChance() {
		return listSalChance;
	}
	public void setListSalChance(List<SalChance> listSalChance) {
		this.listSalChance = listSalChance;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageUrl() {
		return pageUrl;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public int getPageMax() {
		return pageMax;
	}
	public void setPageMax(int pageMax) {
		this.pageMax = pageMax;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public SalChance getChancePlanList() {
		return chancePlanList;
	}
	public void setChancePlanList(SalChance chancePlanList) {
		this.chancePlanList = chancePlanList;
	}
}
