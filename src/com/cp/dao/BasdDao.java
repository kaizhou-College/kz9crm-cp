package com.cp.dao;

import java.util.List;
import com.cp.entity.Product;
import com.cp.entity.Storage;

public interface BasdDao {
//产品信息用
	List byPage(int pageIndex, int pageSize);

	Long count();
//库存用
	Long Storagecount();

	List byStoragePage(int pageIndex, int pageSize);

	List superselect(Storage storage, int pageIndex, int pageSize);

	List superselect2(Product product, int pageIndex, int pageSize);

}
