package com.cp.entity;

/**
 * CstLinkman entity. @author MyEclipse Persistence Tools
 */

public class CstLinkman implements java.io.Serializable {

	// Fields

	private Integer lkmId;
//	private String lkmCustNo;
	private String lkmCustName;
	private String lkmName;
	private String lkmSex;
	private String lkmPostion;
	private String lkmTel;
	private String lkmMobile;
	private String lkmMemo;
	
	
	private CstCustomer cstCustomer;

	// Constructors

	/** default constructor */
	public CstLinkman() {
	}

	/** minimal constructor */
	public CstLinkman(Integer lkmId, String lkmTel) {
		this.lkmId = lkmId;
		this.lkmTel = lkmTel;
	}

	/** full constructor */
	public CstLinkman(Integer lkmId, String lkmCustName,
			String lkmName, String lkmSex, String lkmPostion, String lkmTel,
			String lkmMobile, String lkmMemo) {
		this.lkmId = lkmId;
		this.lkmCustName = lkmCustName;
		this.lkmName = lkmName;
		this.lkmSex = lkmSex;
		this.lkmPostion = lkmPostion;
		this.lkmTel = lkmTel;
		this.lkmMobile = lkmMobile;
		this.lkmMemo = lkmMemo;
	}
	
	

	// Property accessors

	
	


	@Override
	public String toString() {
		return "CstLinkman [lkmCustName=" + lkmCustName + ", lkmId=" + lkmId
				+ ", lkmMemo=" + lkmMemo + ", lkmMobile=" + lkmMobile
				+ ", lkmName=" + lkmName + ", lkmPostion=" + lkmPostion
				+ ", lkmSex=" + lkmSex + ", lkmTel=" + lkmTel + "]";
	}


	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}

	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}

	public Integer getLkmId() {
		return this.lkmId;
	}

	public void setLkmId(Integer lkmId) {
		this.lkmId = lkmId;
	}


	public String getLkmCustName() {
		return this.lkmCustName;
	}

	public void setLkmCustName(String lkmCustName) {
		this.lkmCustName = lkmCustName;
	}

	public String getLkmName() {
		return this.lkmName;
	}

	public void setLkmName(String lkmName) {
		this.lkmName = lkmName;
	}

	public String getLkmSex() {
		return this.lkmSex;
	}

	public void setLkmSex(String lkmSex) {
		this.lkmSex = lkmSex;
	}

	public String getLkmPostion() {
		return this.lkmPostion;
	}

	public void setLkmPostion(String lkmPostion) {
		this.lkmPostion = lkmPostion;
	}

	public String getLkmTel() {
		return this.lkmTel;
	}

	public void setLkmTel(String lkmTel) {
		this.lkmTel = lkmTel;
	}

	public String getLkmMobile() {
		return this.lkmMobile;
	}

	public void setLkmMobile(String lkmMobile) {
		this.lkmMobile = lkmMobile;
	}

	public String getLkmMemo() {
		return this.lkmMemo;
	}

	public void setLkmMemo(String lkmMemo) {
		this.lkmMemo = lkmMemo;
	}

}