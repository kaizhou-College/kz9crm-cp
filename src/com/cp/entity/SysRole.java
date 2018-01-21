package com.cp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * SysRole entity. @author MyEclipse Persistence Tools
 */

public class SysRole implements java.io.Serializable {

	// Fields

	private Integer roleId;
	private String roleName;
	private String roleDesc;
	private String roleFlag;
	private Set<SysUser> sysUser=new HashSet<SysUser>(0);
	private Set<SysRight> sysRight=new HashSet<SysRight>(0);
	// Constructors

	/** default constructor */
	public SysRole() {
	}

	/** minimal constructor */
	public SysRole(String roleName, String roleDesc) {
		this.roleName = roleName;
		this.roleDesc = roleDesc;
	}

	/** full constructor */
	public SysRole(String roleName, String roleDesc, String roleFlag) {
		this.roleName = roleName;
		this.roleDesc = roleDesc;
		this.roleFlag = roleFlag;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getRoleFlag() {
		return this.roleFlag;
	}

	public void setRoleFlag(String roleFlag) {
		this.roleFlag = roleFlag;
	}

	public Set<SysUser> getSysUser() {
		return sysUser;
	}

	public void setSysUser(Set<SysUser> sysUser) {
		this.sysUser = sysUser;
	}

	public Set<SysRight> getSysRight() {
		return sysRight;
	}

	public void setSysRight(Set<SysRight> sysRight) {
		this.sysRight = sysRight;
	}

	@Override
	public String toString() {
		return "SysRole [roleDesc=" + roleDesc + ", roleFlag=" + roleFlag
				+ ", roleId=" + roleId + ", roleName=" + roleName + "]";
	}
}