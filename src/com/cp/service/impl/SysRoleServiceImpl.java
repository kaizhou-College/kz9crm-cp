package com.cp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.SysRoleDao;
import com.cp.entity.SalChance;
import com.cp.entity.SysRight;
import com.cp.entity.SysRole;
import com.cp.entity.SysRolePage;
import com.cp.service.SysRoleService;
@Service
public class SysRoleServiceImpl implements SysRoleService{
	@Autowired
	private SysRoleDao sysRoleDao;
	//拿到权限
	public String findRightsByRole(Integer roleId) {
		List<SysRight> rigths = sysRoleDao.findRightsByRole(roleId);
		StringBuffer userRight = new StringBuffer();
		for(SysRight right :rigths){
			if(right.getRightType().equals("Folder")){
				userRight.append(right.getRightCode()+" = theMenu.addChild(l2ID, \"Folder\", \""+right.getRightText()+"\", \"\", \""+right.getRightTip()+"...\");\n");
			}else{
				userRight.append(right.getRightCode()+" = theMenu.addChild("+right.getRightParentCode()+", \"Document\", \""+right.getRightText()+"\", \""+right.getRightUrl()+"\", \""+right.getRightTip()+"...\");");
			}
		}
		return userRight.toString();
	}
	//分页
	public List<SysRole> byPage(int pageIndex, int pageSize) {
		List list = sysRoleDao.byPage(pageIndex, pageSize);
		return list;
	}
	public long count() {
		Long count = sysRoleDao.count();
		return count;
	}
	//修改钱根据id查
	public SysRole queryById(Integer roleId) {
		return (SysRole) sysRoleDao.queryById(roleId);
	}
	//实际修改
	public void update(SysRole sysRole) {
	//System.out.println("bie=========="+sysRole);
		sysRoleDao.update(sysRole);
	}
	//查
	public SysRole select(Integer integer) {
		return sysRoleDao.select(integer);
	}

}
