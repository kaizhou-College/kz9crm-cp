package com.cp.dao;

import java.util.List;

import com.cp.entity.CstCustomer;
import com.cp.entity.CstLost;
import com.cp.entity.CstService;
import com.cp.entity.SalChance;

public interface ReptDao {

	List select(Class<CstCustomer> clazz);

	List serSelect(Class<CstService> clazz1);

	//List lostSelect(Class<CstLost> class3);

	List byPage(int pageIndex, int pageSize);

	Long count();

	List conteSelect();

	String queryByIds(Integer oddOrderId);

	List superselect(CstLost cstLost, int pageIndex, int pageSize);

}
