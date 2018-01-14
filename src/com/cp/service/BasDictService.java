package com.cp.service;

import java.util.List;

import com.cp.entity.BasDict;

public interface BasDictService {

	long count();

	List<BasDict> byPage(int pageIndex, int pageSize);

	BasDict toupdate(Integer dictId);

	void update(BasDict basDict, Integer dictId);

	void delete(Integer dictId);

	void add(BasDict basDict);

	List<BasDict> superselect(BasDict basDict, int page, int pageSize);

	long supercount(BasDict basDict);


}
