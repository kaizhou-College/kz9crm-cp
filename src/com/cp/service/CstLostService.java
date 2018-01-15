package com.cp.service;

import java.util.List;

import com.cp.entity.CstLost;
import com.cp.entity.CstLostTemp;

public interface CstLostService {
//分页
	long count();
	List<CstLost> byPage(int pageIndex, int pageSize);
	
//高级
	Long supercountList(CstLostTemp cstLostTemp);
	List<CstLost> superbyPage(CstLostTemp cstLostTemp, int page, int pageSize);
	//定时
	void work();
	void add(CstLost cstLost);
	CstLost select(int lstId);
	void update(int lstId, String lstReason);
	void update2(int lstId, String lstDelay);

}
