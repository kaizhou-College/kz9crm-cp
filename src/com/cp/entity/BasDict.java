package com.cp.entity;

/**
 * BasDict entity. @author MyEclipse Persistence Tools
 */

public class BasDict implements java.io.Serializable {

	// Fields

	private Integer dictId;
	private String dictType;
	private String dictItem;
	private String dictValue;
	private Integer dictIsEditable;
	public Integer getDictId() {
		return dictId;
	}
	public void setDictId(Integer dictId) {
		this.dictId = dictId;
	}
	public String getDictType() {
		return dictType;
	}
	public void setDictType(String dictType) {
		this.dictType = dictType;
	}
	public String getDictItem() {
		return dictItem;
	}
	public void setDictItem(String dictItem) {
		this.dictItem = dictItem;
	}
	public String getDictValue() {
		return dictValue;
	}
	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}
	public Integer getDictIsEditable() {
		return dictIsEditable;
	}
	public void setDictIsEditable(Integer dictIsEditable) {
		this.dictIsEditable = dictIsEditable;
	}
	@Override
	public String toString() {
		return "BasDict [dictId=" + dictId + ", dictIsEditable="
				+ dictIsEditable + ", dictItem=" + dictItem + ", dictType="
				+ dictType + ", dictValue=" + dictValue + "]";
	}
	public BasDict(Integer dictId, String dictType, String dictItem,
			String dictValue, Integer dictIsEditable) {
		super();
		this.dictId = dictId;
		this.dictType = dictType;
		this.dictItem = dictItem;
		this.dictValue = dictValue;
		this.dictIsEditable = dictIsEditable;
	}
	public BasDict() {
		super();
		// TODO Auto-generated constructor stub
	}
}