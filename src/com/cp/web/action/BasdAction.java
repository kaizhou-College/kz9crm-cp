package com.cp.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.ListPage;
import com.cp.entity.Product;
import com.cp.entity.Storage;
import com.cp.service.BasdService;

@Controller
@Scope("prototype")
public class BasdAction {
	@Autowired
	private BasdService basdService;
	
	//分页用到的
	private List<Product> listProduct;
	private List<Storage> listStorage;
	private ListPage listpage;
	private int pageIndex;
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=5;
	
	private Storage storage;
	private Product product;
	
	//产品信息分页
	public String productByPage(){
		//System.out.println("储二狗进来了-----------------");
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("basd_productByPage");//跳转路径
		listpage.setCount(basdService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		listProduct = basdService.byPage(listpage.getPageIndex(), listpage.getPageSize());
		//System.out.println("出去");
		return"basd_product";
	}
	
	
	
	//库存分页查询
	public String storageBypage(){
		//System.out.println("储二狗又要进来了-----------------");
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("basd_storageBypage");//跳转路径
		listpage.setCount(basdService.Storagecount());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		listStorage = basdService.byStoragePage(listpage.getPageIndex(), listpage.getPageSize());
		return"basd_storage";
	}
	
	

	//高级查询
	public String superselect(){
		
		System.out.println("进入了高级查询");
		System.out.println(storage);
		
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("basd_superselect");//跳转路径
		listpage.setCount(basdService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		
		System.out.println("第"+listpage.getPageIndex()+"页");
		System.out.println("有"+listpage.getPageMax()+"页");	
		System.out.println("有"+listpage.getCount()+"条记录");	
		
		listStorage=basdService.superselect(storage,listpage.getPageIndex(), listpage.getPageSize());
		
		return "superselect_ok";
	}
	
	//高级查询2
	public String superselect2(){
		
		System.out.println("进入了高级查询");
		System.out.println(product);
		
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("basd_superselect2");//跳转路径
		listpage.setCount(basdService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		
		System.out.println("第"+listpage.getPageIndex()+"页");
		System.out.println("有"+listpage.getPageMax()+"页");	
		System.out.println("有"+listpage.getCount()+"条记录");	
		
		listProduct=basdService.superselect2(product,listpage.getPageIndex(), listpage.getPageSize());
		
		return "superselect2_ok";
	}
	
	
	
	
	
	
	
	
	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public Storage getStorage() {
		return storage;
	}



	public void setStorage(Storage storage) {
		this.storage = storage;
	}



	public List<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
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
	public List<Storage> getListStorage() {
		return listStorage;
	}
	public void setListStorage(List<Storage> listStorage) {
		this.listStorage = listStorage;
	}
}
