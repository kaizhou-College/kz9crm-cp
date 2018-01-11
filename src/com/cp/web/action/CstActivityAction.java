package com.cp.web.action;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.CstActivity;
import com.cp.entity.CstCustomer;
import com.cp.entity.CstLinkman;
import com.cp.service.CstActivityService;

@Controller
@Scope("prototype")
public class CstActivityAction {
	private Integer atvId;
	private String atvCustName;
	private Date atvDate;
	private String atvPlace;
	private String atvTitle;
	private String atvDesc;
	
	
	private String custNo;
	
	@Autowired
	private CstActivityService cstActivityService;
	
	private CstActivity cstActivity;
	
	private List<CstActivity> cstActivitylist;
	
	private CstCustomer cstCustomer;
	
	
	public String select(){
		System.out.println("查询");
		
		System.out.println("进入了");
		System.out.println(custNo);
		cstActivitylist=cstActivityService.select(custNo);
		System.out.println(cstActivitylist);
		
		cstCustomer=cstActivityService.select2(custNo);
		System.out.println(cstCustomer);
		
		return "select_ok";
	}
	
	
	public String delete(){
		System.out.println("进入删除");
		System.out.println("这里删除"+atvId);
		cstActivityService.delete(atvId);
		return "delete_ok";
	}
	
	public String toupdate(){
//		System.out.println("这里进入修改"+atvId);
		cstActivity=cstActivityService.toupdate(atvId);
//		System.out.println(cstActivity);
		return "toupdate_ok";
	}
	
	
	public String update(){
		System.out.println("修改修改修改");
		CstActivity cstActivity2=new CstActivity();
		cstActivity2.setAtvCustName(atvCustName);
		cstActivity2.setAtvDate(atvDate);
		cstActivity2.setAtvDesc(atvDesc);
		cstActivity2.setAtvId(atvId);
		cstActivity2.setAtvPlace(atvPlace);
		cstActivity2.setAtvTitle(atvTitle);
		System.out.println(cstActivity2);
		cstActivityService.update(cstActivity2);
		
		return "update_ok";
	}
	
	public String toadd(){
		System.out.println(custNo);
		return "toadd_ok";
	}
	
	public String add(){
		System.out.println("准备新增");
		System.out.println(custNo);
		
		cstCustomer=cstActivityService.select2(custNo);
		
		
		CstActivity CstActivity2=new CstActivity();
		
		CstActivity2.setAtvCustName(atvCustName);
		CstActivity2.setAtvDate(atvDate);
		CstActivity2.setAtvDesc(atvDesc);
		CstActivity2.setAtvId(atvId);
		CstActivity2.setAtvPlace(atvPlace);
		CstActivity2.setAtvTitle(atvTitle);
		
		cstActivityService.add(cstCustomer,CstActivity2);
		
		return "add_ok";
	}


	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}


	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}


	public Integer getAtvId() {
		return atvId;
	}


	public void setAtvId(Integer atvId) {
		this.atvId = atvId;
	}


	public String getAtvCustName() {
		return atvCustName;
	}


	public void setAtvCustName(String atvCustName) {
		this.atvCustName = atvCustName;
	}


	public Date getAtvDate() {
		return atvDate;
	}


	public void setAtvDate(Date atvDate) {
		this.atvDate = atvDate;
	}


	public String getAtvPlace() {
		return atvPlace;
	}


	public void setAtvPlace(String atvPlace) {
		this.atvPlace = atvPlace;
	}


	public String getAtvTitle() {
		return atvTitle;
	}


	public void setAtvTitle(String atvTitle) {
		this.atvTitle = atvTitle;
	}


	public String getAtvDesc() {
		return atvDesc;
	}


	public void setAtvDesc(String atvDesc) {
		this.atvDesc = atvDesc;
	}


	public String getCustNo() {
		return custNo;
	}


	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}


	public CstActivity getCstActivity() {
		return cstActivity;
	}


	public void setCstActivity(CstActivity cstActivity) {
		this.cstActivity = cstActivity;
	}


	public List<CstActivity> getCstActivitylist() {
		return cstActivitylist;
	}


	public void setCstActivitylist(List<CstActivity> cstActivitylist) {
		this.cstActivitylist = cstActivitylist;
	}
	
	

}
