package com.cp.service;

import java.util.List;

import com.cp.entity.CstCustomer;
import com.cp.entity.CstLost;
import com.cp.entity.CstService;
import com.cp.entity.OrdersLine;
import com.cp.entity.SalChance;

public interface ReptService {

	List<CstCustomer> select(Class<CstCustomer> class1);

	List<CstService> serSelect(Class<CstService> class2);

	//List<CstLost> lostSelect(Class<CstLost> class3);
//分页
	long count();

	List<CstLost> byPage(int pageIndex, int pageSize);

	List<OrdersLine> conteSelect();

	String queryByIds(Integer oddOrderId);
}
