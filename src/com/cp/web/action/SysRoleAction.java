package com.cp.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.ListPage;
import com.cp.entity.SysRole;
import com.cp.entity.SysRolePage;
import com.cp.service.SysRoleService;

@Controller
@Scope("prototype")
public class SysRoleAction {
	@Autowired
	private SysRoleService sysRoleService;
	
	private List<SysRole> listSysRole;
	private ListPage listpage;
	private int pageIndex;
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=2;
	
	private SysRole sysRole;
	//分页
	public String byPage(){
		if(pageIndex==0){
			listpage=new ListPage();
			listpage.setPageIndex(PAGE_CUSTOMER_INDEX);
			
		}else{
			listpage=new ListPage();
			listpage.setPageIndex(pageIndex);
		}
		listpage.setPageSize(PAGE_CUSTOMER_SIZE);
		listpage.setPageUrl("sysRole_byPage");//跳转路径
		listpage.setCount(sysRoleService.count());//一共多少条数据
		int max=new Long(listpage.getCount()).intValue();
		listpage.setPageMax(((max-1)/listpage.getPageSize())+1);//多少页
		listSysRole = sysRoleService.byPage(listpage.getPageIndex(), listpage.getPageSize());
		return"byPage_success";
	}
	//去修改
	public String toupdate(){
		sysRole=sysRoleService.queryById(sysRole.getRoleId());
		return"toupdate_success";
	}
	//实际修改
	public String update(){
		//System.out.println("进来了；；；；；；；；；；；；；；；；；；；"+sysRole);
		sysRoleService.update(sysRole);
		return"update_success";
	}
	//查看
	public String select(){
		//System.out.println("查看============"+sysRole);
		sysRole=sysRoleService.select(sysRole.getRoleId());
		return"select_success";
	} 
	
	public List<SysRole> getListSysRole() {
		return listSysRole;
	}

	public void setListSysRole(List<SysRole> listSysRole) {
		this.listSysRole = listSysRole;
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

	public SysRole getSysRole() {
		return sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	
}