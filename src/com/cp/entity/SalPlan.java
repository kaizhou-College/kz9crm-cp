package com.cp.entity;

//计划表

import java.util.Date;
/**
 * SalPlan entity. @author MyEclipse Persistence Tools
 */

public class SalPlan implements java.io.Serializable {

	// Fields

	private Integer plaId;
	//private Integer plaChcId;
	private Date plaDate;
	private String plaTodo;
	private String plaResult;
	private SalChance salChance;
	public Integer getPlaId() {
		return plaId;
	}
	public void setPlaId(Integer plaId) {
		this.plaId = plaId;
	}
	public Date getPlaDate() {
		return plaDate;
	}
	public void setPlaDate(Date plaDate) {
		this.plaDate = plaDate;
	}
	public String getPlaTodo() {
		return plaTodo;
	}
	public void setPlaTodo(String plaTodo) {
		this.plaTodo = plaTodo;
	}
	public String getPlaResult() {
		return plaResult;
	}
	public void setPlaResult(String plaResult) {
		this.plaResult = plaResult;
	}
	public SalChance getSalChance() {
		return salChance;
	}
	public void setSalChance(SalChance salChance) {
		this.salChance = salChance;
	}
	public SalPlan(Integer plaId, Date plaDate, String plaTodo, String plaResult) {
		super();
		this.plaId = plaId;
		this.plaDate = plaDate;
		this.plaTodo = plaTodo;
		this.plaResult = plaResult;
	}
	public SalPlan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SalPlan [plaDate=" + plaDate + ", plaId=" + plaId
				+ ", plaResult=" + plaResult + ", plaTodo=" + plaTodo + "]";
	}
	
}