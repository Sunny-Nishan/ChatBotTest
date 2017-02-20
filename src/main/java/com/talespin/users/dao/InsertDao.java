package com.talespin.users.dao;

import java.util.List;

public interface InsertDao {

	public boolean insert(Object object);
	
	public void insertMultiple(List<?> vo);
}
