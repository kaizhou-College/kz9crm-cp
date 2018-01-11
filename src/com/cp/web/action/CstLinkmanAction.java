package com.cp.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.CstCustomer;
import com.cp.entity.CstLinkman;
import com.cp.service.CstLinkmanService;


@Controller
@Scope("prototype")
public class CstLinkmanAction {
	
	
	private Integer lkmId;
	private String lkmCustNo;
	private String lkmCustName;
	private String lkmName;
	private String lkmSex;
	private String lkmPostion;
	private String lkmTel;
	private String lkmMobile;
	private String lkmMemo;
	
	
	
	private String custNo;
	
	@Autowired
	private CstLinkmanService cstLinkmanService;
	
	private CstLinkman cstLinkman;
	
	
	private List<CstLinkman> cstLinkmanlist;
	
	private CstCustomer cstCustomer;
	
	
	
	
	public String select(){
		System.out.println("进入了");
		System.out.println(custNo);
		cstLinkmanlist=cstLinkmanService.select(CstLinkman.class,custNo);
		System.out.println("跳转到这里之后"+cstLinkmanlist);
		cstCustomer=cstLinkmanService.select2(custNo);
		System.out.println(cstCustomer);
		
		
		return "select_ok";
	}
	
	public String delete(){
		System.out.println("进入删除");
		System.out.println("这里删除"+lkmId);
		cstLinkmanService.delete(lkmId);
		return "delete_ok";
	}
	
	public String toupdate(){
//		System.out.println("这里进入修改"+lkmId);
		cstLinkman=cstLinkmanService.toupdate(lkmId);
//		System.out.println(cstLinkman);
		return "toupdate_ok";
	}
	
	public String update(){
		System.out.println("修改修改修改");
		CstLinkman cstLinkman2=new CstLinkman();
		cstLinkman2.setLkmId(lkmId);
		cstLinkman2.setLkmName(lkmName);
		cstLinkman2.setLkmSex(lkmSex);
		cstLinkman2.setLkmPostion(lkmPostion);
		cstLinkman2.setLkmTel(lkmTel);
		cstLinkman2.setLkmMobile(lkmMobile);
		cstLinkman2.setLkmMemo(lkmMemo);
		System.out.println(cstLinkman2);
		cstLinkmanService.update(cstLinkman2);
		return "update_ok";
	}
	
	public String toadd(){
		System.out.println("准备进入新增");
		System.out.println(custNo);
		return "toadd_ok";
	}
	
	
	public String add(){
		System.out.println("准备新增");
		System.out.println(custNo);
		cstCustomer=cstLinkmanService.select2(custNo);
		System.out.println("圣诞大杀手的"+cstCustomer);
		CstLinkman cstLinkman2=new CstLinkman();
		cstLinkman2.setLkmId(lkmId);
		cstLinkman2.setLkmName(lkmName);
		cstLinkman2.setLkmSex(lkmSex);
		cstLinkman2.setLkmPostion(lkmPostion);
		cstLinkman2.setLkmTel(lkmTel);
		cstLinkman2.setLkmMobile(lkmMobile);
		cstLinkman2.setLkmMemo(lkmMemo);
		System.out.println(cstLinkman2);
		cstLinkmanService.add(cstCustomer,cstLinkman2);
		return "add_ok";
	}

	
	
	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}

	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public Integer getLkmId() {
		return lkmId;
	}

	public void setLkmId(Integer lkmId) {
		this.lkmId = lkmId;
	}

	public String getLkmCustNo() {
		return lkmCustNo;
	}

	public void setLkmCustNo(String lkmCustNo) {
		this.lkmCustNo = lkmCustNo;
	}

	public String getLkmCustName() {
		return lkmCustName;
	}

	public void setLkmCustName(String lkmCustName) {
		this.lkmCustName = lkmCustName;
	}

	public String getLkmName() {
		return lkmName;
	}

	public void setLkmName(String lkmName) {
		this.lkmName = lkmName;
	}

	public String getLkmSex() {
		return lkmSex;
	}

	public void setLkmSex(String lkmSex) {
		this.lkmSex = lkmSex;
	}

	public String getLkmPostion() {
		return lkmPostion;
	}

	public void setLkmPostion(String lkmPostion) {
		this.lkmPostion = lkmPostion;
	}

	public String getLkmTel() {
		return lkmTel;
	}

	public void setLkmTel(String lkmTel) {
		this.lkmTel = lkmTel;
	}

	public String getLkmMobile() {
		return lkmMobile;
	}

	public void setLkmMobile(String lkmMobile) {
		this.lkmMobile = lkmMobile;
	}

	public String getLkmMemo() {
		return lkmMemo;
	}

	public void setLkmMemo(String lkmMemo) {
		this.lkmMemo = lkmMemo;
	}

	public CstLinkman getCstLinkman() {
		return cstLinkman;
	}

	public void setCstLinkman(CstLinkman cstLinkman) {
		this.cstLinkman = cstLinkman;
	}

	public List<CstLinkman> getCstLinkmanlist() {
		return cstLinkmanlist;
	}

	public void setCstLinkmanlist(List<CstLinkman> cstLinkmanlist) {
		this.cstLinkmanlist = cstLinkmanlist;
	}

	
	
	
	

}
