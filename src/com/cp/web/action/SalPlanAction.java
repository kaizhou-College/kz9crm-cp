package com.cp.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.ListPage;
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
	private List<SalChance> ListsalChance;
	//高级
	private int page;
	private Long count;//一共多少条数据
	private int pageIndex;
	private int pageSize;//传进来的最大页数
	private String pageUrl;
	private int pageMax;//这个是最大页
	
	private SalChance salChances;//Chance对象
	
	// 已经开发成功了的
	public String planListSuccess(){
		salChances = salPlanService.planList(salChance.getChcId());
		return "planListSuccess_success";
	}
	//正在开发中机会显示
	public String planList(){
		salChances = salPlanService.planList(salChance.getChcId());
		return "salPlanList_success";
	}
	
	//保存
	public void  ajaxPlan(){
		salPlanService.ajaxPlan(salplan);
	}
	
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
		count = salPlanService.count();//查找所有数据的条数
		int max=new Long(count).intValue();
		pageMax=((max-1)/pageSize)+1;
		ListsalChance=salPlanService.byPage(page, pageSize);
		return "byPage_success";
	}
	
	
	
	//plan高级查询
	public String  superSel(){
		if(salPlanTemp==null){
			salPlanTemp=new SalPlanTemp(" "," "," ");
		}
		pageUrl="salPlan_superSel";
		page=1;
		pageSize=3;
		if(pageIndex>1){
			page=pageIndex;
		}
		count = salPlanService.countsuper(salPlanTemp);
		int max=new Long(count).intValue();
		pageMax=((max-1)/pageSize)+1;
		
		ListsalChance = salPlanService.superbyPage(salPlanTemp,page, pageSize);
		return "superSel_success";
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

	public List<SalChance> getListsalChance() {
		return ListsalChance;
	}

	public void setListsalChance(List<SalChance> listsalChance) {
		ListsalChance = listsalChance;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
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

	public SalChance getSalChances() {
		return salChances;
	}

	public void setSalChances(SalChance salChances) {
		this.salChances = salChances;
	}
	
}
