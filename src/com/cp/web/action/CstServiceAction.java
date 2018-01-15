package com.cp.web.action;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.CstActivity;
import com.cp.entity.CstCustomer;
import com.cp.entity.CstService;
import com.cp.entity.ListPage;
import com.cp.service.CstServiceService;

@Controller
@Scope("prototype")
public class CstServiceAction {
	
	private Integer svrId;
	private String svrType;
	private String svrTitle;
	private String svrCustName;
	private String svrStatus;
	private String svrRequest;
	private Integer svrCreateId;
	private String svrCreateBy;
	private Date svrCreateDate;
	private Integer svrDueId;
	private String svrDueTo;
	private Date svrDueDate;
	private String svrDeal;
	private Integer svrDealId;
	private String svrDealBy;
	private Date svrDealDate;
	private String svrResult;
	private String svrSatisfy;
	
	private String aa;

	private Date date1;
	private Date date2;
	
	
	
	public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

	@Autowired
	private CstServiceService cstServiceService;
	
	
	private CstCustomer cstCustomer;
	private CstService cstService;
	private List<CstService> cstServicelist;
	
	
	//分页用到的
	private ListPage listpage;
	private int pageIndex;
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=5;
	
	
	//添加
	public String add(){
		System.out.println("添加");
		CstService cstService=new CstService();
		cstService.setSvrStatus(svrStatus);
		cstService.setSvrType(svrType);
		cstService.setSvrTitle(svrTitle);
		cstService.setSvrCustName(svrCustName);
		cstService.setSvrRequest(svrRequest);
		cstService.setSvrCreateId(1);
		cstService.setSvrCreateDate(svrCreateDate);
		cstService.setSvrCreateBy(svrCreateBy);
		cstService.setSvrDueDate(svrDueDate);
		cstService.setSvrDeal(svrDeal);
		cstService.setSvrDealBy(svrDealBy);
		cstService.setSvrDealDate(svrDealDate);
		cstService.setSvrResult(svrResult);
		cstService.setSvrSatisfy(svrSatisfy);
		System.out.println(cstService);
		
		cstServiceService.add(cstService);
		
		return "add_ok";
	}
	
	//分页查询
	public String todispatch(){
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("cstService_todispatch");//跳转路径
		listpage.setCount(cstServiceService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		
		cstServicelist = cstServiceService.byPage(listpage.getPageIndex(), listpage.getPageSize());
		return "todispatch_ok";
	}
	
	//修改指派人
	public String updatesvrDueId(){
		System.out.println("看这里死鬼");
		System.out.println("不能为空啊吖吖啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊"+aa);
		svrDueId= new Integer(aa.substring(0,1));
		System.out.println(svrDueId);
		System.out.println("这和个id"+svrId);
		cstServiceService.updatesvrDueId(svrDueId,svrId);
		
		return "updatesvrDueId_ok";
	}
	
	//删除
	public String delete(){
		cstServiceService.delete(svrId);
		return "delete_ok";
	}
	
	
	//分页查询
	public String todeal(){
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("cstService_todeal");//跳转路径
		listpage.setCount(cstServiceService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		
		cstServicelist = cstServiceService.byPage(listpage.getPageIndex(), listpage.getPageSize());
		return "todeal_ok";
	}
	
	//去detail页面
	public String todetail(){
//		System.out.println("Action啊啊啊啊");
		System.out.println(svrId);
		cstService=cstServiceService.selectid(svrId);
//		System.out.println("哈哈哈哈哈哈哈哈哈哈哈或或或或或或"+cstService);
		return "todetail_ok";
	}
	
	//detail页面修改
	public String detailupdate(){
//		System.out.println("这是id事发地点时方式放到事发地点时分胜负但是的说法"+svrId);
		CstService cstService=new CstService();
		 
		cstService.setSvrDeal(svrDeal);
		cstService.setSvrDueTo(svrDueTo);
		cstService.setSvrDealDate(svrDealDate);
		cstService.setSvrResult(svrResult);
		cstService.setSvrSatisfy(svrSatisfy);
		System.out.println(cstService);
		
		cstServiceService.detailupdate(svrId,cstService);
		
		return "detailupdate_ok";
	}
	
	
	public String tofeedback(){
		
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("cstService_tofeedback");//跳转路径
		listpage.setCount(cstServiceService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		
		cstServicelist = cstServiceService.byPage(listpage.getPageIndex(), listpage.getPageSize());
		
	
		return "feedback_ok";
	}
	
	//去detail页面
	public String todetail2(){
//		System.out.println("Action啊啊啊啊");
		System.out.println(svrId);
		cstService=cstServiceService.selectid(svrId);
//		System.out.println("哈哈哈哈哈哈哈哈哈哈哈或或或或或或"+cstService);
		return "todetail2_ok";
	}
	
	
	public String detailupdate2(){
//		System.out.println("这是id事发地点时方式放到事发地点时分胜负但是的说法"+svrId);
		CstService cstService=new CstService();
		 
		cstService.setSvrResult(svrResult);
		cstService.setSvrSatisfy(svrSatisfy);
		System.out.println(cstService);
		
		cstServiceService.detailupdate2(svrId,cstService);
		
		return "detailupdate2_ok";
	}
	
	
	
	public String toarch(){
		
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("cstService_toarch");//跳转路径
		listpage.setCount(cstServiceService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		
		cstServicelist = cstServiceService.byPage(listpage.getPageIndex(), listpage.getPageSize());
		
	
		return "toarch_ok";
	}
	
	
	//真*去detail页面
	public String todetail3(){
	//	System.out.println("Action啊啊啊啊");
		System.out.println(svrId);
		cstService=cstServiceService.selectid(svrId);
	//	System.out.println("哈哈哈哈哈哈哈哈哈哈哈或或或或或或"+cstService);
		return "todetail3_ok";
	}
		
	
	//高级查询
	public String superselect1(){
		
		System.out.println("进入了高级查询");
		System.out.println(cstService);
		
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("cstService_superselect");//跳转路径
		listpage.setCount(cstServiceService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		
		System.out.println("第"+listpage.getPageIndex()+"页");
		System.out.println("有"+listpage.getPageMax()+"页");	
		System.out.println("有"+listpage.getCount()+"条记录");	
		
		cstServicelist=cstServiceService.superselect(cstService,date1,date2,listpage.getPageIndex(), listpage.getPageSize());
		
		return "superselect1_ok";
	}
	
public String superselect2(){
		
		System.out.println("进入了高级查询");
		System.out.println(cstService);
		
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("cstService_superselect");//跳转路径
		listpage.setCount(cstServiceService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		
		System.out.println("第"+listpage.getPageIndex()+"页");
		System.out.println("有"+listpage.getPageMax()+"页");	
		System.out.println("有"+listpage.getCount()+"条记录");	
		
		cstServicelist=cstServiceService.superselect(cstService,date1,date2,listpage.getPageIndex(), listpage.getPageSize());
		
		return "superselect2_ok";
	}


public String superselect3(){
	
	System.out.println("进入了高级查询");
	System.out.println(cstService);
	
	if(pageIndex==0){
		listpage=new ListPage();
		listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
		
	}else{
		listpage=new ListPage();
		listpage.setPageIndex(pageIndex);
	}
	listpage.setPageSize(PAGE_CUSTOMER_SIZE);
	listpage.setPageUrl("cstService_superselect");//跳转路径
	listpage.setCount(cstServiceService.count());//一共多少条数据
	int max=new Long(listpage.getCount()).intValue();
	listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
	
	System.out.println("第"+listpage.getPageIndex()+"页");
	System.out.println("有"+listpage.getPageMax()+"页");	
	System.out.println("有"+listpage.getCount()+"条记录");	
	
	cstServicelist=cstServiceService.superselect(cstService,date1,date2,listpage.getPageIndex(), listpage.getPageSize());
	
	return "superselect3_ok";
}


public String superselect4(){
	
	System.out.println("进入了高级查询");
	System.out.println(cstService);
	
	if(pageIndex==0){
		listpage=new ListPage();
		listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
		
	}else{
		listpage=new ListPage();
		listpage.setPageIndex(pageIndex);
	}
	listpage.setPageSize(PAGE_CUSTOMER_SIZE);
	listpage.setPageUrl("cstService_superselect");//跳转路径
	listpage.setCount(cstServiceService.count());//一共多少条数据
	int max=new Long(listpage.getCount()).intValue();
	listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
	
	System.out.println("第"+listpage.getPageIndex()+"页");
	System.out.println("有"+listpage.getPageMax()+"页");	
	System.out.println("有"+listpage.getCount()+"条记录");	
	
	cstServicelist=cstServiceService.superselect(cstService,date1,date2,listpage.getPageIndex(), listpage.getPageSize());
	
	return "superselect4_ok";
}
	
	
	
	

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public Date getDate2() {
		return date2;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
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


	public Integer getSvrId() {
		return svrId;
	}

	public void setSvrId(Integer svrId) {
		this.svrId = svrId;
	}

	public String getSvrType() {
		return svrType;
	}

	public void setSvrType(String svrType) {
		this.svrType = svrType;
	}

	public String getSvrTitle() {
		return svrTitle;
	}

	public void setSvrTitle(String svrTitle) {
		this.svrTitle = svrTitle;
	}

	public String getSvrCustName() {
		return svrCustName;
	}

	public void setSvrCustName(String svrCustName) {
		this.svrCustName = svrCustName;
	}

	public String getSvrStatus() {
		return svrStatus;
	}

	public void setSvrStatus(String svrStatus) {
		this.svrStatus = svrStatus;
	}

	public String getSvrRequest() {
		return svrRequest;
	}

	public void setSvrRequest(String svrRequest) {
		this.svrRequest = svrRequest;
	}

	public Integer getSvrCreateId() {
		return svrCreateId;
	}

	public void setSvrCreateId(Integer svrCreateId) {
		this.svrCreateId = svrCreateId;
	}

	public String getSvrCreateBy() {
		return svrCreateBy;
	}

	public void setSvrCreateBy(String svrCreateBy) {
		this.svrCreateBy = svrCreateBy;
	}

	public Date getSvrCreateDate() {
		return svrCreateDate;
	}

	public void setSvrCreateDate(Date svrCreateDate) {
		this.svrCreateDate = svrCreateDate;
	}

	public Integer getSvrDueId() {
		return svrDueId;
	}

	public void setSvrDueId(Integer svrDueId) {
		this.svrDueId = svrDueId;
	}

	public String getSvrDueTo() {
		return svrDueTo;
	}

	public void setSvrDueTo(String svrDueTo) {
		this.svrDueTo = svrDueTo;
	}

	public Date getSvrDueDate() {
		return svrDueDate;
	}

	public void setSvrDueDate(Date svrDueDate) {
		this.svrDueDate = svrDueDate;
	}

	public String getSvrDeal() {
		return svrDeal;
	}

	public void setSvrDeal(String svrDeal) {
		this.svrDeal = svrDeal;
	}

	public Integer getSvrDealId() {
		return svrDealId;
	}

	public void setSvrDealId(Integer svrDealId) {
		this.svrDealId = svrDealId;
	}

	public String getSvrDealBy() {
		return svrDealBy;
	}

	public void setSvrDealBy(String svrDealBy) {
		this.svrDealBy = svrDealBy;
	}

	public Date getSvrDealDate() {
		return svrDealDate;
	}

	public void setSvrDealDate(Date svrDealDate) {
		this.svrDealDate = svrDealDate;
	}

	public String getSvrResult() {
		return svrResult;
	}

	public void setSvrResult(String svrResult) {
		this.svrResult = svrResult;
	}

	public String getSvrSatisfy() {
		return svrSatisfy;
	}

	public void setSvrSatisfy(String svrSatisfy) {
		this.svrSatisfy = svrSatisfy;
	}

	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}

	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}

	public CstService getCstService() {
		return cstService;
	}

	public void setCstService(CstService cstService) {
		this.cstService = cstService;
	}

	public List<CstService> getCstServicelist() {
		return cstServicelist;
	}

	public void setCstServicelist(List<CstService> cstServicelist) {
		this.cstServicelist = cstServicelist;
	}
	
	
	
}
