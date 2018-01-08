package com.cp.entity;
//计划表
import java.sql.Timestamp;

/**
 * SalPlan entity. @author MyEclipse Persistence Tools
 */

public class SalPlan implements java.io.Serializable {

	// Fields

	private Integer plaId;
	//private Integer plaChcId;
	private Timestamp plaDate;
	private String plaTodo;
	private String plaResult;
	private SalChance salChance;
	// Constructors

	/** default constructor */
	public SalPlan() {
	}

	/** minimal constructor */
	public SalPlan(Integer plaChcId, Timestamp plaDate, String plaTodo) {
	//	this.plaChcId = plaChcId;
		this.plaDate = plaDate;
		this.plaTodo = plaTodo;
	}

	/** full constructor */
	public SalPlan(Integer plaChcId, Timestamp plaDate, String plaTodo,
			String plaResult) {
		//this.plaChcId = plaChcId;
		this.plaDate = plaDate;
		this.plaTodo = plaTodo;
		this.plaResult = plaResult;
	}

	// Property accessors

	public Integer getPlaId() {
		return this.plaId;
	}

	public void setPlaId(Integer plaId) {
		this.plaId = plaId;
	}
/*
	public Integer getPlaChcId() {
		return this.plaChcId;
	}

	public void setPlaChcId(Integer plaChcId) {
		this.plaChcId = plaChcId;
	}*/

	public Timestamp getPlaDate() {
		return this.plaDate;
	}

	public void setPlaDate(Timestamp plaDate) {
		this.plaDate = plaDate;
	}

	public String getPlaTodo() {
		return this.plaTodo;
	}

	public void setPlaTodo(String plaTodo) {
		this.plaTodo = plaTodo;
	}

	public String getPlaResult() {
		return this.plaResult;
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

	
}