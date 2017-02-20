/*package com.talespin.users.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateDaoImpl implements UpdateDao {

	@Autowired
    private MongoTemplate mongoTemplate;
	
	// General Method to add data
	public boolean update(Class<?> oldVoName, Class<?> newVoName, String column, String value) {

		Query query = new Query(Criteria.where("status").is(true).and(column).is(value));
		Update entityClass = new Update();
		try
		{
			this.mongoTemplate.upsert(query, entityClass, newVoName);
			
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
}*/