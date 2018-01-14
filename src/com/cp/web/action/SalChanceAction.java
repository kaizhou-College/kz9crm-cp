package com.cp.web.action;

import java.text.ParseException;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.ListPage;
import com.cp.entity.SalChance;
import com.cp.service.SalChanceService;

@Controller
@Scope("prototype")
public class SalChanceAction {
	private Integer chcId;
	private String chcSource;
	private String chcCustName;
	private String chcTitle;
	private Integer chcRate;
	private String chcLinkman;
	private String chcTel;
	private String chcDesc;
	private Integer chcCreateId;
	private String chcCreateBy;
	private Date chcCreateDate;
	private Integer chcDueId;
	private String chcDueTo;
	private Date chcDueDate;
	private Integer chcStatus;
	private String chcDueDate2;
	
	@Autowired
	private SalChanceService salChanceService;
	//分页
	private ListPage listpage;
	private int pageIndex;
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=1;
	
	private List<SalChance> listsalChance;
	private SalChance salChance;
	
	//查
	public String bypage(){
		//System.out.println("劲来了了~~~~~");
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("salchance_bypage");//跳转路径
		listpage.setCount(salChanceService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		listsalChance = salChanceService.byPage(listpage.getPageIndex(), listpage.getPageSize());
		return "salchancelist_success";
	}

	//去修改
	public String toupdate(){
//		System.out.println("成功经阿里郎。。。。");
//		System.out.println(chcId+"=================dbGDYULWGliufgwqyvflyiwgvrlyifgWLY");
		//System.out.println(salChance.getChcId()+"12345678");
		salChance=salChanceService.queryById(salChance.getChcId());
		return "salchancetoupdate_success";
	}
	//实际修改
	public String update(){
	/*	System.out.println("修改竟来了。。。。。。");
		System.out.println(chcDesc);
		System.out.println(chcDueTo);
		System.out.println(chcId);
		System.out.println("华丽丽的分割线-------------------");*/
			salChanceService.update(chcId,chcDesc,chcDueTo);
			return "salchanceupdate_success";
	}
	
	//去dispatch页面
	public String todispatch(){
		//System.out.println("进入了SalChanceAction");
		salChance=salChanceService.todispatch(1);
		//System.out.println("这里是Action"+salChance);
		return "todispatch_ok";
	}
	
	//dispatch页面修改
	public String dispatch() throws ParseException{
	/*	System.out.println("这是一条华丽的分割线--------------------------------------------------------------------------");
		System.out.println("进入了Action");
		System.out.println("id是"+chcId);
		System.out.println("指派人Id是"+chcCreateId);
		System.out.println("指派时间是"+chcDueDate);*/
		salChanceService.dispatch(chcId, chcCreateId, chcDueDate);
		return "dispatch_ok";
	}
	
	//删除
	public String delete(){
		System.out.println("进入了删除Action");
		System.out.println("得到的id是"+chcId);
		salChanceService.delete(chcId);
		return "delete_ok";
	}
	
	//添加
	public String save(){
		//System.out.println("进入了action添加");
		SalChance salChance2=new SalChance();
		salChance2.setChcSource(chcSource);
		salChance2.setChcCustName(chcCustName);
		salChance2.setChcRate(chcRate);
		salChance2.setChcTitle(chcTitle);
		salChance2.setChcLinkman(chcLinkman);
		salChance2.setChcTel(chcTel);
		salChance2.setChcDesc(chcDesc);
		salChance2.setChcCreateBy(chcCreateBy);
		salChance2.setChcCreateDate(chcCreateDate);
		salChance2.setChcDueTo(chcDueTo);
		salChance2.setChcDueDate(chcDueDate);
		System.out.println(salChance2);
		salChanceService.save(salChance2);
		return "save_ok";
		
	}
	
	//高级查询
	public String superselect(){
	//	System.out.println("进入了高级查询");
		return "superselect_ok";
	}
	
	
	
	
	//get/set
	public Integer getChcId() {
		return chcId;
	}

	public void setChcId(Integer chcId) {
		this.chcId = chcId;
	}

	public String getChcSource() {
		return chcSource;
	}

	public void setChcSource(String chcSource) {
		this.chcSource = chcSource;
	}

	public String getChcCustName() {
		return chcCustName;
	}

	public void setChcCustName(String chcCustName) {
		this.chcCustName = chcCustName;
	}

	public String getChcTitle() {
		return chcTitle;
	}

	public void setChcTitle(String chcTitle) {
		this.chcTitle = chcTitle;
	}

	public Integer getChcRate() {
		return chcRate;
	}

	public void setChcRate(Integer chcRate) {
		this.chcRate = chcRate;
	}

	public String getChcLinkman() {
		return chcLinkman;
	}

	public void setChcLinkman(String chcLinkman) {
		this.chcLinkman = chcLinkman;
	}

	public String getChcTel() {
		return chcTel;
	}

	public void setChcTel(String chcTel) {
		this.chcTel = chcTel;
	}

	public String getChcDesc() {
		return chcDesc;
	}

	public void setChcDesc(String chcDesc) {
		this.chcDesc = chcDesc;
	}

	public Integer getChcCreateId() {
		return chcCreateId;
	}

	public void setChcCreateId(Integer chcCreateId) {
		this.chcCreateId = chcCreateId;
	}

	public String getChcCreateBy() {
		return chcCreateBy;
	}

	public void setChcCreateBy(String chcCreateBy) {
		this.chcCreateBy = chcCreateBy;
	}

	public Date getChcCreateDate() {
		return chcCreateDate;
	}

	public void setChcCreateDate(Date chcCreateDate) {
		this.chcCreateDate = chcCreateDate;
	}

	public Integer getChcDueId() {
		return chcDueId;
	}

	public void setChcDueId(Integer chcDueId) {
		this.chcDueId = chcDueId;
	}

	public String getChcDueTo() {
		return chcDueTo;
	}

	public void setChcDueTo(String chcDueTo) {
		this.chcDueTo = chcDueTo;
	}

	public Date getChcDueDate() {
		return chcDueDate;
	}

	public void setChcDueDate(Date chcDueDate) {
		this.chcDueDate = chcDueDate;
	}

	public Integer getChcStatus() {
		return chcStatus;
	}

	public void setChcStatus(Integer chcStatus) {
		this.chcStatus = chcStatus;
	}

	public String getChcDueDate2() {
		return chcDueDate2;
	}

	public void setChcDueDate2(String chcDueDate2) {
		this.chcDueDate2 = chcDueDate2;
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

	public List<SalChance> getListsalChance() {
		return listsalChance;
	}

	public void setListsalChance(List<SalChance> listsalChance) {
		this.listsalChance = listsalChance;
	}

	public SalChance getSalChance() {
		return salChance;
	}

	public void setSalChance(SalChance salChance) {
		this.salChance = salChance;
	}
}
