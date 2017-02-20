package com.talespin.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.talespin.users.dao.InsertDao;

@Service
public class InsertServiceImpl implements InsertService {

	@Autowired
	private InsertDao insertDao;
	
	// General Method to add data
	@Transactional
	public boolean insert(Object object) {

		return this.insertDao.insert(object);

	}

	// Insert multiple from list
	@Transactional
	public void insertMultiple(List<?> vo) {
		
		this.insertDao.insertMultiple(vo);
		
	}
	
}
