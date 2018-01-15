package com.cp.entity;

public class SalPlanTemp {
	private String cname;
	private String cdesc;
	private String lxr;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdesc() {
		return cdesc;
	}
	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	public String getLxr() {
		return lxr;
	}
	public void setLxr(String lxr) {
		this.lxr = lxr;
	}
	public SalPlanTemp(String cname, String cdesc, String lxr) {
		super();
		this.cname = cname;
		this.cdesc = cdesc;
		this.lxr = lxr;
	}
	public SalPlanTemp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SalPlanTemp [cdesc=" + cdesc + ", cname=" + cname + ", lxr="
				+ lxr + "]";
	}
}
