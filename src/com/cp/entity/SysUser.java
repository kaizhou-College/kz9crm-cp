package com.cp.entity;

/**
 * SysUser entity. @author MyEclipse Persistence Tools
 */

public class SysUser implements java.io.Serializable {

	// Fields

	private Integer usrId;
	private String usrName;
	private String usrPassword;
//	private Integer usrRoleId;
	private Integer usrFlag;
	private SysRole sysRole;
	// Constructors

	/** default constructor */
	public SysUser() {
	}

	/** minimal constructor */
	public SysUser(String usrName, String usrPassword, Integer usrFlag) {
		this.usrName = usrName;
		this.usrPassword = usrPassword;
		this.usrFlag = usrFlag;
	}

	/** full constructor */
	public SysUser(String usrName, String usrPassword, Integer usrRoleId,
			Integer usrFlag) {
		this.usrName = usrName;
		this.usrPassword = usrPassword;
		//this.usrRoleId = usrRoleId;
		this.usrFlag = usrFlag;
	}

	// Property accessors

	public Integer getUsrId() {
		return this.usrId;
	}

	public void setUsrId(Integer usrId) {
		this.usrId = usrId;
	}

	public String getUsrName() {
		return this.usrName;
	}

	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}

	public String getUsrPassword() {
		return this.usrPassword;
	}

	public void setUsrPassword(String usrPassword) {
		this.usrPassword = usrPassword;
	}


	public Integer getUsrFlag() {
		return this.usrFlag;
	}

	public void setUsrFlag(Integer usrFlag) {
		this.usrFlag = usrFlag;
	}

	public SysRole getSysRole() {
		return sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}

	@Override
	public String toString() {
		return "SysUser [usrFlag=" + usrFlag + ", usrId=" + usrId
				+ ", usrName=" + usrName + ", usrPassword=" + usrPassword
				+ "]";
	}
}