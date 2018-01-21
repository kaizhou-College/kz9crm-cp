package com.cp.dao;

import java.util.List;

import com.cp.entity.SysRight;
import com.cp.entity.SysRole;
import com.cp.entity.SysRolePage;

public interface SysRoleDao {
	//拿到权限
	List<SysRight> findRightsByRole(Integer roleId);
//分页
	List byPage(int pageIndex, int pageSize);
	Long count();
	//根据id查修改钱
	SysRole queryById(Integer roleId);
	//实际修改
	void update(SysRole sysRole);
	//查
	SysRole select(Integer integer);

}
