package com.cp.service;

import java.util.List;

import com.cp.entity.CstService;

public interface CstServiceService {

	void add(CstService cstService);

	List select();

	int count();

	List<CstService> byPage(int pageIndex, int pageSize);

	void updatesvrDueId(Integer svrDueId, Integer svrId);

	void delete(Integer svrId);

	CstService selectid(Integer svrId);

	void detailupdate(Integer svrId, CstService cstService);

	void detailupdate2(Integer svrId, CstService cstService);


}
