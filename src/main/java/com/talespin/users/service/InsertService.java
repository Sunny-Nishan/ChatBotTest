package com.talespin.users.service;

import java.util.List;

public interface InsertService {

	public boolean insert(Object object);
	
	public void insertMultiple(List<?> vo);
	
}
