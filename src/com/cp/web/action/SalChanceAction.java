package com.cp.web.action;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.entity.SalChance;
import com.cp.service.SalChanceBiz;


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
	
	@Autowired
	private SalChance salchance;
	@Autowired
	private SalChanceBiz salChanceBiz;
	
	public String todispatch(){
		System.out.println("进入了SalChanceAction");
		
		salchance=salChanceBiz.todispatch(1);
		
		System.out.println("这里是Action"+salchance);
		
		return "todispatch_ok";
	}

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

	public SalChance getSalchance() {
		return salchance;
	}

	public void setSalchance(SalChance salchance) {
		this.salchance = salchance;
	}

	
	
}
