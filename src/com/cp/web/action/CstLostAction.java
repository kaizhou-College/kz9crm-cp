package com.cp.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.CstLost;
import com.cp.entity.CstLostTemp;
import com.cp.entity.ListPage;
import com.cp.service.CstLostService;

@Controller
@Scope("prototype")
public class CstLostAction {
	@Autowired
	private CstLostService cstLostService;
	
	private CstLost cstLost;
	private List<CstLost> listcstLost;
	
	//分页用到的
	private ListPage listpage;
	private int pageIndex;
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=1;
	
	//高级查询用到的
	private CstLostTemp cstLostTemp;
	private Long count;//一共多少条数据
	private int pageSize;//传进来的最大页数
	private String pageUrl;//传进来的路径
	private int pageMax;//最大页数
	private int page;//初始页数
	//分页查询
	public String byPage(){
		//System.out.println("进来");
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}

	/*	if(listpage==null){
			listpage=new ListPage();
			//System.out.println("！！！！！！！！！！！！！！！！！！");
			listpage.setPageIndex(pageIndex);
		}*/
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("cstLost_byPage");//跳转路径
		listpage.setCount(cstLostService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		listcstLost = cstLostService.byPage(listpage.getPageIndex(), listpage.getPageSize());
		//System.out.println("出去");
		return "byPage_success";
	}
	
	
	//高级查询
	public String supersel(){
		/*if(cstLostTemp==null){
			cstLostTemp=new CstLostTemp(" "," "," ");
		}*/
		pageUrl="cstLost_supersel";//給页面赋值
		page=1;//初始页面
		pageSize=1;//每页显示的页数
		if(pageIndex>1){
			page=pageIndex;
		}
		count = cstLostService.supercountList(cstLostTemp);//查找所有数据的条数
		int max=new Long(count).intValue();
		pageMax=((max-1)/pageSize)+1;
		listcstLost = cstLostService.superbyPage(cstLostTemp,page, pageSize);//带分页
		return"supersel_success";
	}

//get/set
	public CstLost getCstLost() {
		return cstLost;
	}

	public void setCstLost(CstLost cstLost) {
		this.cstLost = cstLost;
	}

	public List<CstLost> getListcstLost() {
		return listcstLost;
	}

	public void setListcstLost(List<CstLost> listcstLost) {
		this.listcstLost = listcstLost;
	}

	public ListPage getListpage() {
		return listpage;
	}

	public void setListpage(ListPage listpage) {
		this.listpage = listpage;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public CstLostTemp getCstLostTemp() {
		return cstLostTemp;
	}

	public void setCstLostTemp(CstLostTemp cstLostTemp) {
		this.cstLostTemp = cstLostTemp;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
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
}
