package com.cp.service;

import java.util.List;

import com.cp.entity.ListPage;
import com.cp.entity.SysRole;
import com.cp.entity.SysRolePage;

public interface SysRoleService {
//查
	String findRightsByRole(Integer roleId);
//分页
	long count();
	List<SysRole> byPage(int pageIndex, int pageSize);
	//修改前根据id查询
	SysRole queryById(Integer roleId);
	//实际修改
	void update(SysRole sysRole);
	//查
	SysRole select(Integer integer);

}
