package com.cp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.SysUserDao;
import com.cp.entity.SysUser;
import com.cp.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService{
	@Autowired
	private SysUserDao sysUserDao;
	//登陆
	public SysUser login(String usrName, String usrPassword) {
		return  sysUserDao.findNameAndPwd(usrName,usrPassword);
	}

}
