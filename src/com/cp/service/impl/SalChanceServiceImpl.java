package com.cp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.SalChanceDao;
import com.cp.service.SalChanceService;
@Service
public class SalChanceServiceImpl implements SalChanceService{
	@Autowired
	private SalChanceDao salChanceDao;
	public List select(Class clazz) {
		List list=salChanceDao.select(clazz);
		return list;
	}
	public SalChanceDao getSalChanceDao() {
		return salChanceDao;
	}
	public void setSalChanceDao(SalChanceDao salChanceDao) {
		this.salChanceDao = salChanceDao;
	}
}
