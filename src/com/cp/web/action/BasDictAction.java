package com.cp.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.BasDict;
import com.cp.entity.ListPage;
import com.cp.service.BasDictService;

@Controller
@Scope("prototype")
public class BasDictAction {
	private Integer dictId;
	private String dictType;
	private String dictItem;
	private String dictValue;
	private Integer dictIsEditable;
	
	private BasDict basDict;
	
	private List<BasDict> basDictlist;
	
	@Autowired
	private BasDictService basDictService;
	
	private boolean bll;
	
	
	public boolean isBll() {
		return bll;
	}

	public void setBll(boolean bll) {
		this.bll = bll;
	}




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
		listpage.setPageUrl("basDict_select");//跳转路径
		listpage.setCount(basDictService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		
		basDictlist = basDictService.byPage(listpage.getPageIndex(), listpage.getPageSize());
		
		return "select_ok";
		
	}
	
	public String toupdate(){
		System.out.println("去修改");
		basDict=basDictService.toupdate(dictId);
		return "toupdate_ok";
	}
	
	public String update(){
		System.out.println("哈哈哈哈哈哈哈哈哈哈哈或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或"+bll);
		BasDict basDict=new BasDict();
		if(bll==true){
			basDict.setDictIsEditable(1);
		}
		if(bll==false){
			basDict.setDictIsEditable(0);
		}
		basDict.setDictItem(dictItem);
		basDict.setDictType(dictType);
		basDict.setDictValue(dictValue);
		basDictService.update(basDict,dictId);
		return "update_ok";
	}
	
	public String delete(){
		System.out.println("删除"+dictId);
		basDictService.delete(dictId);
		
		return "delete_ok";
		
		
	}
	
	public String add(){
		BasDict basDict=new BasDict();
		if(bll==true){
			basDict.setDictIsEditable(1);
		}
		if(bll==false){
			basDict.setDictIsEditable(0);
		}
		
		basDict.setDictItem(dictItem);
		basDict.setDictType(dictType);
		basDict.setDictValue(dictValue);
		basDictService.add(basDict);
		return "add_ok";
	}
	
	
	

	
	//高级查询
	public String superselect(){
		
		System.out.println("进入了高级查询");
		System.out.println(basDict);
		
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("basDict_superselect");//跳转路径
		listpage.setCount(basDictService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		
		System.out.println("第"+listpage.getPageIndex()+"页");
		System.out.println("有"+listpage.getPageMax()+"页");	
		System.out.println("有"+listpage.getCount()+"条记录");	
		
		basDictlist=basDictService.superselect(basDict,listpage.getPageIndex(), listpage.getPageSize());
		listpage.setCount(basDictService.supercount(basDict));
		
		int max2=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max2-1)/listpage.getPageSize())+1);
		
		System.out.println("第"+listpage.getPageIndex()+"页");
		System.out.println("有"+listpage.getPageMax()+"页");	
		System.out.println("有"+listpage.getCount()+"条记录");
		
		return "superselect_ok";
	}




	public Integer getDictId() {
		return dictId;
	}




	public void setDictId(Integer dictId) {
		this.dictId = dictId;
	}




	public String getDictType() {
		return dictType;
	}




	public void setDictType(String dictType) {
		this.dictType = dictType;
	}




	public String getDictItem() {
		return dictItem;
	}




	public void setDictItem(String dictItem) {
		this.dictItem = dictItem;
	}




	public String getDictValue() {
		return dictValue;
	}




	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}




	public Integer getDictIsEditable() {
		return dictIsEditable;
	}




	public void setDictIsEditable(Integer dictIsEditable) {
		this.dictIsEditable = dictIsEditable;
	}




	public BasDict getBasDict() {
		return basDict;
	}




	public void setBasDict(BasDict basDict) {
		this.basDict = basDict;
	}




	public List<BasDict> getBasDictlist() {
		return basDictlist;
	}




	public void setBasDictlist(List<BasDict> basDictlist) {
		this.basDictlist = basDictlist;
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
	
	
	
}
