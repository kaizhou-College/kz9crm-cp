package com.cp.dao;

import java.util.Date;
import java.util.List;

import com.cp.entity.CstService;

public interface CstServiceDao {

	void add(CstService cstService);

	List select();

	int count();

	List bypage(int pageIndex, int pageSize);

	void updatesvrDueId(Integer svrDueId, Integer svrId);

	void delete(Integer svrId);

	CstService selectid(Integer svrId);

	void detailupdate(Integer svrId, CstService cstService);

	void detailupdate2(Integer svrId, CstService cstService);

	List superselect(CstService cstService, Date date1, Date date2, int pageIndex, int pageSize);

}
