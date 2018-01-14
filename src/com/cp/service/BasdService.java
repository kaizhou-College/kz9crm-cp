package com.cp.service;

import java.util.List;

import com.cp.entity.Product;
import com.cp.entity.Storage;

public interface BasdService {
//产品信息用
	 long count();

	 List<Product> byPage(int pageIndex, int pageSize);
//库存用
	long Storagecount();

	List<Storage> byStoragePage(int pageIndex, int pageSize);

}
