package com.cp.dao;

import java.util.List;

import com.cp.entity.BasDict;

public interface BasDictDao {

	long count();

	List bypage(int pageIndex, int pageSize);

	BasDict toupdate(Integer dictId);

	void update(BasDict basDict, Integer dictId);

	void delete(Integer dictId);

	void add(BasDict basDict);

	List superselect(BasDict basDict, int page, int pageSize);

	long supercount(BasDict basDict);

}
