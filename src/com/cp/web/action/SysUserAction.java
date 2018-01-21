package com.cp.web.action;


import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cp.core.comm.Const;
import com.cp.entity.SysRole;
import com.cp.entity.SysUser;
import com.cp.service.SysRoleService;
import com.cp.service.SysUserService;
@Controller
@Scope("prototype")
public class SysUserAction {
	@Autowired
	private SysUserService sysUserService;
	
	@Autowired
	private SysRoleService  sysRoleService ;
	
	private SysUser sysUser;
	private String userRight;//角色权限字符串
	//登陆
	public String login(){
		//System.out.println("进来登陆了！！！！！！！！！！！！！");
		//1,对用户名和密码进行验证
		SysUser loginUser = sysUserService.login(sysUser.getUsrName(),sysUser.getUsrPassword());
		//System.out.println(loginUser);
		//2,将用户对象保存到session中
		ServletActionContext.getRequest().getSession().setAttribute(Const.LOGIN_USER, loginUser);
		//3,得到该用户的角色---关联对象
		SysRole sysRole  = loginUser.getSysRole();
		//根据角色获取权限（需要获得排序的权限）
		userRight = sysRoleService.findRightsByRole(sysRole.getRoleId());
		System.out.println("Userright==============="+userRight);
		//将所有权限的放入session
		ServletActionContext.getRequest().getSession().setAttribute("userRight", userRight);
		//System.out.println("获取体哦啊还拉打打算");
		return"login_success";
	}
	
	
	
	public SysUser getSysUser() {
		return sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public String getUserRight() {
		return userRight;
	}
	public void setUserRight(String userRight) {
		this.userRight = userRight;
	}
}
