package com.cp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.SalChanceDao;
import com.cp.entity.SalChance;
import com.cp.service.SalChanceBiz;

@Service
public class SalChanceBizImpl  implements SalChanceBiz{
	@Autowired
	private SalChanceDao salChanceDao;
	
	public SalChance todispatch(int chcId) {
		
		System.out.println("进入了BizImpl");
		System.out.println(chcId);
		SalChance salChance =(SalChance) salChanceDao.todispatch(chcId);
		
		
		return salChance;
	}

}
