package com.talespin.users.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InsertDaoImpl implements InsertDao {

	@Autowired
    private MongoTemplate mongoTemplate;
	
	// General Method to add data
	public boolean insert(Object object)
	{
		try
		{
			this.mongoTemplate.save(object);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// Insert multiple from list
	public void insertMultiple(List<?> vo)
	{
		try
		{
			this.mongoTemplate.insertAll(vo);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}