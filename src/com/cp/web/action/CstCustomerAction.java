package com.cp.web.action;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.CstCustomer;
import com.cp.entity.ListPage;
import com.cp.entity.SalChance;
import com.cp.service.CstCustomerService;


@Controller
@Scope("prototype")
public class CstCustomerAction {
	private String custNo;
	private String custName;
	private String custRegion;
	private Integer custManagerId;
	private String custManagerName;
	private Integer custLevel;
	private String custLevelLabel;
	private Integer custSatisfy;
	private Integer custCredit;
	private String custAddr;
	private String custZip;
	private String custTel;
	private String custFax;
	private String custWebsite;
	private String custLicenceNo;
	private String custChieftain;
	private Integer custBankroll;
	private String custTurnover;
	private String custBank;
	private String custBankAccount;
	private String custLocalTaxNo;
	private String custNationalTaxNo;
	private String custStatus;
	
	@Autowired
	private CstCustomerService cstCustomerService;
	
	private CstCustomer cstCustomer;
	
	private List<CstCustomer> cstCustomerlist;
	
	//分页用到的
	private ListPage listpage;
	private int pageIndex;
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=2;
	
	
	
	
	public String select(){
		
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("cstCustomer_select");//跳转路径
		listpage.setCount(cstCustomerService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		
		cstCustomerlist = cstCustomerService.byPage(listpage.getPageIndex(), listpage.getPageSize());
		//System.out.println("出去");
		
		return "select_ok";
	}
	
	
	
	public String toupdate(){
		System.out.println("我要去修改页面啦");
		System.out.println(custNo);
		
		cstCustomer=cstCustomerService.toupdate(custNo);
		System.out.println(cstCustomer);
		
		return "toupdate_ok";
	}
	
	public String update(){
		System.out.println("进入了update");
		
		CstCustomer cstCustomer2=new CstCustomer();
		
		cstCustomer2.setCustNo(custNo);
		cstCustomer2.setCustName(custName);
		cstCustomer2.setCustRegion(custRegion);
		cstCustomer2.setCustManagerId(custManagerId);
		cstCustomer2.setCustManagerName(custManagerName);
		cstCustomer2.setCustLevel(custLevel);
		cstCustomer2.setCustLevelLabel(custLevelLabel);
		cstCustomer2.setCustSatisfy(custSatisfy);
		cstCustomer2.setCustCredit(custCredit);
		cstCustomer2.setCustAddr(custAddr);
		cstCustomer2.setCustZip(custZip);
		cstCustomer2.setCustTel(custTel);
		cstCustomer2.setCustFax(custFax);
		cstCustomer2.setCustWebsite(custWebsite);
		cstCustomer2.setCustLicenceNo(custLicenceNo);
		cstCustomer2.setCustChieftain(custChieftain);
		cstCustomer2.setCustBankroll(custBankroll);
		cstCustomer2.setCustTurnover(custTurnover);
		cstCustomer2.setCustBank(custBank);
		cstCustomer2.setCustBankAccount(custBankAccount);
		cstCustomer2.setCustLocalTaxNo(custLocalTaxNo);
		cstCustomer2.setCustNationalTaxNo(custNationalTaxNo);
		System.out.println(cstCustomer2);
		
		
		cstCustomerService.update(custNo,cstCustomer2);
		
		return "update_ok";
	}
	
	
	public String delete(){
		System.out.println("进入了删除");
		System.out.println("是这个啊 啊啊啊 啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
		System.out.println(custNo);
		cstCustomerService.delete(custNo);
		return "delete_ok";
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


	public String getCustNo() {
		return custNo;
	}


	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getCustRegion() {
		return custRegion;
	}


	public void setCustRegion(String custRegion) {
		this.custRegion = custRegion;
	}


	public Integer getCustManagerId() {
		return custManagerId;
	}


	public void setCustManagerId(Integer custManagerId) {
		this.custManagerId = custManagerId;
	}


	public String getCustManagerName() {
		return custManagerName;
	}


	public void setCustManagerName(String custManagerName) {
		this.custManagerName = custManagerName;
	}


	public Integer getCustLevel() {
		return custLevel;
	}


	public void setCustLevel(Integer custLevel) {
		this.custLevel = custLevel;
	}


	public String getCustLevelLabel() {
		return custLevelLabel;
	}


	public void setCustLevelLabel(String custLevelLabel) {
		this.custLevelLabel = custLevelLabel;
	}


	public Integer getCustSatisfy() {
		return custSatisfy;
	}


	public void setCustSatisfy(Integer custSatisfy) {
		this.custSatisfy = custSatisfy;
	}


	public Integer getCustCredit() {
		return custCredit;
	}


	public void setCustCredit(Integer custCredit) {
		this.custCredit = custCredit;
	}


	public String getCustAddr() {
		return custAddr;
	}


	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}


	public String getCustZip() {
		return custZip;
	}


	public void setCustZip(String custZip) {
		this.custZip = custZip;
	}


	public String getCustTel() {
		return custTel;
	}


	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}


	public String getCustFax() {
		return custFax;
	}


	public void setCustFax(String custFax) {
		this.custFax = custFax;
	}


	public String getCustWebsite() {
		return custWebsite;
	}


	public void setCustWebsite(String custWebsite) {
		this.custWebsite = custWebsite;
	}


	public String getCustLicenceNo() {
		return custLicenceNo;
	}


	public void setCustLicenceNo(String custLicenceNo) {
		this.custLicenceNo = custLicenceNo;
	}


	public String getCustChieftain() {
		return custChieftain;
	}


	public void setCustChieftain(String custChieftain) {
		this.custChieftain = custChieftain;
	}


	public Integer getCustBankroll() {
		return custBankroll;
	}


	public void setCustBankroll(Integer custBankroll) {
		this.custBankroll = custBankroll;
	}


	public String getCustTurnover() {
		return custTurnover;
	}


	public void setCustTurnover(String custTurnover) {
		this.custTurnover = custTurnover;
	}


	public String getCustBank() {
		return custBank;
	}


	public void setCustBank(String custBank) {
		this.custBank = custBank;
	}


	public String getCustBankAccount() {
		return custBankAccount;
	}


	public void setCustBankAccount(String custBankAccount) {
		this.custBankAccount = custBankAccount;
	}


	public String getCustLocalTaxNo() {
		return custLocalTaxNo;
	}


	public void setCustLocalTaxNo(String custLocalTaxNo) {
		this.custLocalTaxNo = custLocalTaxNo;
	}


	public String getCustNationalTaxNo() {
		return custNationalTaxNo;
	}


	public void setCustNationalTaxNo(String custNationalTaxNo) {
		this.custNationalTaxNo = custNationalTaxNo;
	}


	public String getCustStatus() {
		return custStatus;
	}


	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}



	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}


	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}


	public List<CstCustomer> getCstCustomerlist() {
		return cstCustomerlist;
	}


	public void setCstCustomerlist(List<CstCustomer> cstCustomerlist) {
		this.cstCustomerlist = cstCustomerlist;
	}
	
	

}
