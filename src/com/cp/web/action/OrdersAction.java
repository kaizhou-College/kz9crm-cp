package com.cp.web.action;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.CstActivity;
import com.cp.entity.ListPage;
import com.cp.entity.Orders;
import com.cp.service.OrdersService;

@Controller
@Scope("prototype")
public class OrdersAction {
	private Integer odrId;
	private String odrCustomer;
	private Timestamp odrDate;
	private String odrAddr;
	private String odrStatus;
	
	@Autowired
	private OrdersService ordersService;
	
	private Orders orders;
	
	private List<Orders> orderslist;
	
	
	//分页用到的
	private ListPage listpage;
	private int pageIndex;
	private static final int PAGE_CUSTOMER_INDEX=1;//第几页
	private static final int PAGE_CUSTOMER_SIZE=3;//每页有多少
	
	public String select(){
		
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("orders_select");//跳转路径
		listpage.setCount(ordersService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		
		orderslist = ordersService.byPage(listpage.getPageIndex(), listpage.getPageSize());
		
		
		return "select_ok";
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


	public Integer getOdrId() {
		return odrId;
	}


	public void setOdrId(Integer odrId) {
		this.odrId = odrId;
	}


	public String getOdrCustomer() {
		return odrCustomer;
	}


	public void setOdrCustomer(String odrCustomer) {
		this.odrCustomer = odrCustomer;
	}


	public Timestamp getOdrDate() {
		return odrDate;
	}


	public void setOdrDate(Timestamp odrDate) {
		this.odrDate = odrDate;
	}


	public String getOdrAddr() {
		return odrAddr;
	}


	public void setOdrAddr(String odrAddr) {
		this.odrAddr = odrAddr;
	}


	public String getOdrStatus() {
		return odrStatus;
	}


	public void setOdrStatus(String odrStatus) {
		this.odrStatus = odrStatus;
	}


	public Orders getOrders() {
		return orders;
	}


	public void setOrders(Orders orders) {
		this.orders = orders;
	}


	public List<Orders> getOrderslist() {
		return orderslist;
	}


	public void setOrderslist(List<Orders> orderslist) {
		this.orderslist = orderslist;
	}

	
	
}
