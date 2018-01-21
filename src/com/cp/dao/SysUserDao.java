package com.cp.dao;

import com.cp.entity.SysUser;

public interface SysUserDao {

	//登陆，查看是否有此人
	SysUser findNameAndPwd(String usrName, String usrPassword);

}
