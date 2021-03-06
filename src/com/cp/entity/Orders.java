package com.cp.entity;


import java.util.Date;


/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

//订单表(客户订单信息)

public class Orders implements java.io.Serializable {

	// Fields

	private Integer odrId;
	private String odrCustomer;

	private Date odrDate;
	private String odrAddr;
	private String odrStatus;

	private CstCustomer cstCustomer;

	// Constructors

	/** default constructor */
	public Orders() {
	}
	/** minimal constructor */
	public Orders(Integer odrId, String odrCustomer, Date odrDate,
			String odrStatus) {
		this.odrId = odrId;
		this.odrCustomer = odrCustomer;
		this.odrDate = odrDate;
		this.odrStatus = odrStatus;
	}

	/** full constructor */
	public Orders(Integer odrId, String odrCustomer, Date odrDate,
			String odrAddr, String odrStatus) {
		this.odrCustomer = odrCustomer;
		this.odrDate = odrDate;
		this.odrAddr = odrAddr;
		this.odrStatus = odrStatus;
	}
	

	// Property accessors

	@Override
	public String toString() {
		return "Orders [odrAddr=" + odrAddr + ", odrCustomer=" + odrCustomer
				+ ", odrDate=" + odrDate + ", odrId=" + odrId + ", odrStatus="
				+ odrStatus + "]";
	}




	// Property accessors

	public Integer getOdrId() {
		return this.odrId;
	}

	public void setOdrId(Integer odrId) {
		this.odrId = odrId;
	}

	public String getOdrCustomer() {
		return this.odrCustomer;
	}

	public void setOdrCustomer(String odrCustomer) {
		this.odrCustomer = odrCustomer;
	}

	public Date getOdrDate() {
		return this.odrDate;
	}

	public void setOdrDate(Date odrDate) {
		this.odrDate = odrDate;
	}

	public String getOdrAddr() {
		return this.odrAddr;
	}

	public void setOdrAddr(String odrAddr) {
		this.odrAddr = odrAddr;
	}

	public String getOdrStatus() {
		return this.odrStatus;
	}

	public void setOdrStatus(String odrStatus) {
		this.odrStatus = odrStatus;
	}
	public CstCustomer getCstCustomer() {
		return cstCustomer;
	}

	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}
}