package com.cp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cp.dao.SysRoleDao;
import com.cp.entity.Product;
import com.cp.entity.SalChance;
import com.cp.entity.SysRight;
import com.cp.entity.SysRole;
import com.cp.entity.SysRolePage;

public class SysRoleDaoImpl extends HibernateDaoSupport implements SysRoleDao{
	//获取权限
	public List<SysRight> findRightsByRole(Integer roleId) {
		Session session  =this.getSession();
		List<SysRight> rights = session.createQuery("select b from SysRole a inner join a.sysRight b where a.roleId=? order by b.rightCode")
		.setParameter(0, roleId).list();
		//System.out.println("获取到权限啦啊啊啊");
		return rights;	
		}
//分页

	public List byPage(int pageIndex, int pageSize) {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(SysRole.class);
		int max=(pageIndex-1)*pageSize;
		createCriteria.setFirstResult(max);
		createCriteria.setMaxResults(pageSize);
		List list = createCriteria.list();
		return list;
	}

	public Long count() {
		Session session = this.getSession();
		Criteria createCriteria = session.createCriteria(SysRole.class);
		//加投影
		createCriteria.setProjection(Projections.count("roleId"));
		List<Long> list = createCriteria.list();
		return  list.get(0);
	}
//修改钱查询
	public SysRole queryById(Integer roleId) {
		//System.out.println("Dao里的roleId"+roleId);
		Session session = this.getSession();
		SysRole sysRole = (SysRole) session.get(SysRole.class, roleId);
	//	System.out.println("Dao里的sysRole"+sysRole);
		return sysRole;
	}
	//实际修改
	public void update(SysRole sysRole) {
	//	System.out.println("dao====="+sysRole);
		Session session = this.getSession();
		SysRole sys = (SysRole) session.get(SysRole.class, sysRole.getRoleId());
		sys.setRoleFlag(sysRole.getRoleFlag());
	}


	public SysRole select(Integer integer) {
		Session session = this.getSession();
		SysRole sysRole = (SysRole) session.get(SysRole.class, integer);
		return sysRole;
	}
}
