package com.cp.dao;

import java.util.List;

import com.cp.entity.CstLost;
import com.cp.entity.CstLostTemp;

public interface CstLostDao {
	//分页
	List byPage(int pageIndex, int pageSize);

	Long count();
	//高级
	List superbyPage(CstLostTemp cstLostTemp, int page, int pageSize);

	Long supercountList(CstLostTemp cstLostTemp);
//定时用的
	void add(CstLost cstLost);

	List<CstLost> CheckOutTime();

	CstLost todispatch(int lstId);

	void update(int lstId, String lstReason);

	void update2(int lstId, String lstDelay);
}
