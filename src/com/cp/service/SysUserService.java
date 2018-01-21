package com.cp.service;

import com.cp.entity.SysUser;

public interface SysUserService {
	//登陆
	SysUser login(String usrName, String usrPassword);

}
