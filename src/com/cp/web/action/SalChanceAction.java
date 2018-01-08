package com.cp.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.SalChance;
import com.cp.service.SalChanceService;
@Controller
@Scope("prototype")
public class SalChanceAction {
	private List<SalChance> listsalChance;
	@Autowired
	private SalChanceService salChanceService;
	private SalChance salChance;
	public String bypage(){
		//System.out.println("劲来了了~~~~~");
		listsalChance=salChanceService.select(SalChance.class);
		return"salchancelist_success";
	}
/*	public String delete(){
		System.out.println("delete将啦啦啦~~~~~");
		return"salchancedelete_success";
	}*/
	public String toupdate(){
		System.out.println("成功经阿里郎。。。。");
		return"salchancetoupdate_success";
	}
	public List<SalChance> getListsalChance() {
		return listsalChance;
	}
	public void setListsalChance(List<SalChance> listsalChance) {
		this.listsalChance = listsalChance;
	}
}
