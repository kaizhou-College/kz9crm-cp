package com.cp.dao;

import java.util.List;

public interface BasdDao {
//产品信息用
	List byPage(int pageIndex, int pageSize);

	Long count();
//库存用
	Long Storagecount();

	List byStoragePage(int pageIndex, int pageSize);

}
