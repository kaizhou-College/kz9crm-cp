package com.cp.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.CstCustomer;
import com.cp.entity.CstLost;
import com.cp.entity.CstService;
import com.cp.entity.ListPage;
import com.cp.entity.OrdersLine;
import com.cp.service.ReptService;

@Controller
@Scope("prototype")
public class ReptAction {
	@Autowired
	private ReptService reptService;
	//查询
	//贡献的查询用到的
	private OrdersLine ordersLine;
	private List<OrdersLine> listordersLine;
	private String cname;
	
	private List<CstCustomer> listcstCustomer;
	private List<CstService> listcstService;
	private List<CstLost> listcstLost;
	//分页
	private ListPage listpage;
	private int pageIndex;
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=1;
	//贡献分析查询
	public String contrSel(){
		listordersLine = reptService.conteSelect();
		//System.out.println("进入查询"+listordersLine);
		for (int i = 0; i < listordersLine.size(); i++) {
			cname = reptService.queryByIds(listordersLine.get(i).getOddOrderId());
		}
		System.out.println("客户名称==="+cname);
		//listcstCustomer=reptService.select(CstCustomer.class);
		return "rept_conteSel";
	}
	//客户构成分析查询
	public String consSel(){
		listcstCustomer=reptService.select(CstCustomer.class);
		return"rept_consSel";
	}
	//客户服务分析
	public String serSel(){
		listcstService=reptService.serSelect(CstService.class);
		//System.out.println(listcstService+"--------------------------");
		return"rept_serSel";
	}
	//客户流失分析
	public String lostSel(){
		//System.out.println("寄哪里---------------");
		//普通查
		//listcstLost=reptService.lostSelect(CstLost.class);
		//System.out.println(listcstLost+"=============================================");
		//分页
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("rept_lostSel");//跳转路径
		listpage.setCount(reptService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		listcstLost = reptService.byPage(listpage.getPageIndex(), listpage.getPageSize());
		//System.out.println("出去");
		return"rept_lostSel";
	}
	//get/set
	
	public List<CstCustomer> getListcstCustomer() {
		return listcstCustomer;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public void setListcstCustomer(List<CstCustomer> listcstCustomer) {
		this.listcstCustomer = listcstCustomer;
	}
	public ListPage getListpage() {
		return listpage;
	}
	public void setListpage(ListPage listpage) {
		this.listpage = listpage;
	}
	public List<CstService> getListcstService() {
		return listcstService;
	}
	public void setListcstService(List<CstService> listcstService) {
		this.listcstService = listcstService;
	}
	public List<CstLost> getListcstLost() {
		return listcstLost;
	}
	public void setListcstLost(List<CstLost> listcstLost) {
		this.listcstLost = listcstLost;
	}
	public OrdersLine getOrdersLine() {
		return ordersLine;
	}
	public void setOrdersLine(OrdersLine ordersLine) {
		this.ordersLine = ordersLine;
	}
	public List<OrdersLine> getListordersLine() {
		return listordersLine;
	}
	public void setListordersLine(List<OrdersLine> listordersLine) {
		this.listordersLine = listordersLine;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}
