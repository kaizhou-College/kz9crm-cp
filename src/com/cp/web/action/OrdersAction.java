package com.cp.web.action;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.CstActivity;
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
	
	
	public String select(){
		orderslist=ordersService.select(Orders.class);
		System.out.println(orderslist);
		return "select_ok";
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
