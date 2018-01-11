package com.cp.entity;
//高级查询用到的
public class CstLostTemp {
	private String cstname;
	private String cstmangername;
	private String zt;
	public String getCstname() {
		return cstname;
	}
	public void setCstname(String cstname) {
		this.cstname = cstname;
	}
	public String getCstmangername() {
		return cstmangername;
	}
	public void setCstmangername(String cstmangername) {
		this.cstmangername = cstmangername;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public CstLostTemp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CstLostTemp(String cstname, String cstmangername, String zt) {
		super();
		this.cstname = cstname;
		this.cstmangername = cstmangername;
		this.zt = zt;
	}
	@Override
	public String toString() {
		return "CstLostTemp [cstmangername=" + cstmangername + ", cstname="
				+ cstname + ", zt=" + zt + "]";
	}
}
