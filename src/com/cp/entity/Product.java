package com.cp.entity;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Integer prodId;
	private String prodName;
	private String prodType;
	private String prodBatch;
	private String prodUnit;
	private Integer prodPrice;
	private String prodMemo;

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(String prodName, String prodType) {
		this.prodName = prodName;
		this.prodType = prodType;
	}

	/** full constructor */
	public Product(String prodName, String prodType, String prodBatch,
			String prodUnit, Integer prodPrice, String prodMemo) {
		this.prodName = prodName;
		this.prodType = prodType;
		this.prodBatch = prodBatch;
		this.prodUnit = prodUnit;
		this.prodPrice = prodPrice;
		this.prodMemo = prodMemo;
	}

	// Property accessors

	@Override
	public String toString() {
		return "Product [prodBatch=" + prodBatch + ", prodId=" + prodId
				+ ", prodMemo=" + prodMemo + ", prodName=" + prodName
				+ ", prodPrice=" + prodPrice + ", prodType=" + prodType
				+ ", prodUnit=" + prodUnit + "]";
	}

	public Integer getProdId() {
		return this.prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return this.prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdType() {
		return this.prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public String getProdBatch() {
		return this.prodBatch;
	}

	public void setProdBatch(String prodBatch) {
		this.prodBatch = prodBatch;
	}

	public String getProdUnit() {
		return this.prodUnit;
	}

	public void setProdUnit(String prodUnit) {
		this.prodUnit = prodUnit;
	}

	public Integer getProdPrice() {
		return this.prodPrice;
	}

	public void setProdPrice(Integer prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdMemo() {
		return this.prodMemo;
	}

	public void setProdMemo(String prodMemo) {
		this.prodMemo = prodMemo;
	}

}