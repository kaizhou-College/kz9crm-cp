package com.cp.entity;

import java.util.Date;

public class CstLost implements java.io.Serializable {

	// Fields

	private Integer lstId;
	//private String lstCustNo;
	private String lstCustName;
	private Integer lstCustManagerId;
	private String lstCustManagerName;
	private Date lstLastOrderDate;
	private Date lstLostDate;
	private String lstDelay;
	private String lstReason;
	private String lstStatus;
	private CstCustomer cstCustomer;
	// Fields

	// Constructors

	/** default constructor */
	public CstLost() {
	}



	// Property accessors

	public CstLost(Integer lstId, String lstCustNo, String lstCustName,
			Integer lstCustManagerId, String lstCustManagerName,
			Date lstLastOrderDate, Date lstLostDate, String lstDelay,
			String lstReason, String lstStatus) {
		super();
		this.lstId = lstId;
		//this.lstCustNo = lstCustNo;
		this.lstCustName = lstCustName;
		this.lstCustManagerId = lstCustManagerId;
		this.lstCustManagerName = lstCustManagerName;
		this.lstLastOrderDate = lstLastOrderDate;
		this.lstLostDate = lstLostDate;
		this.lstDelay = lstDelay;
		this.lstReason = lstReason;
		this.lstStatus = lstStatus;
	}
	


	public Integer getLstId() {
		return this.lstId;
	}

	public void setLstId(Integer lstId) {
		this.lstId = lstId;
	}
/*
	public String getLstCustNo() {
		return this.lstCustNo;
	}

	public void setLstCustNo(String lstCustNo) {
		this.lstCustNo = lstCustNo;
	}*/

	public String getLstCustName() {
		return this.lstCustName;
	}

	public void setLstCustName(String lstCustName) {
		this.lstCustName = lstCustName;
	}

	public Integer getLstCustManagerId() {
		return this.lstCustManagerId;
	}

	public void setLstCustManagerId(Integer lstCustManagerId) {
		this.lstCustManagerId = lstCustManagerId;
	}

	public String getLstCustManagerName() {
		return this.lstCustManagerName;
	}

	public void setLstCustManagerName(String lstCustManagerName) {
		this.lstCustManagerName = lstCustManagerName;
	}

	public Date getLstLastOrderDate() {
		return this.lstLastOrderDate;
	}

	public void setLstLastOrderDate(Date date) {
		this.lstLastOrderDate = date;
	}

	public Date getLstLostDate() {
		return this.lstLostDate;
	}

	public void setLstLostDate(Date lstLostDate) {
		this.lstLostDate = lstLostDate;
	}

	public String getLstDelay() {
		return this.lstDelay;
	}

	public void setLstDelay(String lstDelay) {
		this.lstDelay = lstDelay;
	}

	public String getLstReason() {
		return this.lstReason;
	}

	public void setLstReason(String lstReason) {
		this.lstReason = lstReason;
	}

	public String getLstStatus() {
		return this.lstStatus;
	}

	public void setLstStatus(String lstStatus) {
		this.lstStatus = lstStatus;
	}

	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}

	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}

	@Override
	public String toString() {
		return "CstLost [lstCustManagerId=" + lstCustManagerId
				+ ", lstCustManagerName=" + lstCustManagerName
				+ ", lstCustName=" + lstCustName + ", lstDelay=" + lstDelay
				+ ", lstId=" + lstId + ", lstLastOrderDate=" + lstLastOrderDate
				+ ", lstLostDate=" + lstLostDate + ", lstReason=" + lstReason
				+ ", lstStatus=" + lstStatus + "]";
	}
}