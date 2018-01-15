package com.cp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.BasdDao;
import com.cp.entity.Product;
import com.cp.entity.Storage;
import com.cp.service.BasdService;
@Service
public class BasdServiceImpl implements BasdService{
	@Autowired
	private BasdDao basdDao;
	//产品信息用
	public List<Product> byPage(int pageIndex, int pageSize) {
		List list = basdDao.byPage(pageIndex, pageSize);
		//System.out.println("serive里的"+list+"=================");
		return list;
	}

	public long count() {
		Long count = basdDao.count();
		//System.out.println("serive里的"+count+"~~~~~~count");
		return count;
	}
//库存用
	public long Storagecount() {
		Long count = basdDao.Storagecount();
		return count;
	}

	public List<Storage> byStoragePage(int pageIndex, int pageSize) {
		List list = basdDao.byStoragePage(pageIndex, pageSize);
		return list;
	}

}
