package com.cp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.dao.BasDictDao;
import com.cp.entity.BasDict;
import com.cp.service.BasDictService;

@Service
public class BasDictServiceImol implements BasDictService {
	
	@Autowired
	private BasDictDao basDictDao;

	public long count() {
		// TODO Auto-generated method stub
		long count = basDictDao.count();
		return count;
	}

	public List<BasDict> byPage(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		List list =basDictDao.bypage(pageIndex, pageSize);
		return list;
	}

	public BasDict toupdate(Integer dictId) {
		// TODO Auto-generated method stub
		BasDict basDict=basDictDao.toupdate(dictId);
		return basDict;
	}

	public void update(BasDict basDict,Integer dictId) {
		// TODO Auto-generated method stub
		basDictDao.update(basDict,dictId);
		
	}

	public void delete(Integer dictId) {
		// TODO Auto-generated method stub
		basDictDao.delete(dictId);
		
	}

	public void add(BasDict basDict) {
		// TODO Auto-generated method stub
		basDictDao.add(basDict);
		
	}

	public List<BasDict> superselect(BasDict basDict, int page, int pageSize) {
		// TODO Auto-generated method stub
		List list=basDictDao.superselect(basDict,  page, pageSize);
		return list;
	}

	public long supercount(BasDict basDict) {
		// TODO Auto-generated method stub
		long count=basDictDao.supercount(basDict);
		return count;
	}


}
