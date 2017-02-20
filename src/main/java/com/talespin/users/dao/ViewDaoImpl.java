package com.talespin.users.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ViewDaoImpl implements ViewDao {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	// General Search method to search with any VO object where status = "Active"
	public List<Object> searchAllData(Class<?> voName) {
		
		List<Object> list = new ArrayList<Object>();
		
		Query query = new Query(Criteria.where("status").is(true));
		try
		{
			list = (List<Object>) this.mongoTemplate.find(query, voName);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	// General Search method to search with any VO object where status = "Active"
	public List<?> searchAllDataWithoutCheckingStatus(Class<?> voName) {
		
		List<?> list = new ArrayList<>();
		
		try
		{
			list = (List<?>) this.mongoTemplate.findAll(voName);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	// Search With Where condition
	public List<?> searchByOneColumn(Class<?> voName, String column, String value) {

		try {
			
			Query query = new Query(Criteria.where("status").is(true).and(column).is(value));

			List<?> list = (List<Object>) this.mongoTemplate.find(query, voName);
			
			return list;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Search With Where condition
	public List<?> searchByTwoColumn(Class<?> voName, String column1, String value1, String column2, String value2) {

		try {
			
			Query query = new Query(Criteria.where("status").is(true).and(column1).is(value1).and(column2).is(value2));

			List<?> list = (List<Object>) this.mongoTemplate.find(query, voName);
			
			return list;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Search With Where condition
	public List<?> searchByTwoColumnOneIsIsId(Class<?> voName, String column1, String value1, String column2, ObjectId value2) {

		try {
			
			Query query = new Query(Criteria.where("status").is(true).and(column1).is(value1).and(column2).is(value2));

			List<?> list = (List<Object>) this.mongoTemplate.find(query, voName);
			
			return list;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Search With Where condition
	public List<?> searchByThreeColumn(Class<?> voName, String column1, String value1, 
			String column2, String value2, String column3, String value3) {

		try {
			
			Query query = new Query(Criteria.where("status").is(true).and(column1).is(value1)
					.and(column2).is(value2).and(column3).is(value3));

			List<?> list = (List<Object>) this.mongoTemplate.find(query, voName);
			
			return list;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Search With Where condition
	public Object searchById(Class<?> voName, String idValue) {

		try {
			
			Query query = new Query(Criteria.where("_id").is(new ObjectId(idValue)));
			
			Object voObj = this.mongoTemplate.findOne(query, voName);
			
			return voObj;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Search With Where condition
	public Object searchByIdWithoutCheckingStatus(Class<?> voName, String idValue) {

		try {
			
			Query query = new Query(Criteria.where("_id").is(new ObjectId(idValue)));
			
			Object voObj = this.mongoTemplate.findOne(query, voName);
			
			return voObj;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Search With Where condition
	public List<?> searchByOneColumnOnIdWithoutCheckingStatus(Class<?> voName, String column1, ObjectId value1) {

		try {
			
			Query query = new Query(Criteria.where(column1).is(value1));

			List<?> list = (List<Object>) this.mongoTemplate.find(query, voName);
			
			return list;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// Search With Where condition
	public List<?> searchByOneColumnOnIdWithoutCheckingStatusCaseInsensative(Class<?> voName, String column1, String value1) {

		try {
			
			Query query = new Query(Criteria.where(column1).regex("^"+value1+"$", "i"));

			List<?> list = (List<Object>) this.mongoTemplate.find(query, voName);
			
			return list;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Search With Where condition
	public List<?> searchByOneColumnAndNotToAnother(Class<?> voName, String column1, String value1, String column2, String value2) {

		try {
			
			Query query = new Query(Criteria.where("status").is(true).and(column1).regex("^"+value1+"$", "i").and(column2).ne(value2));

			List<?> list = (List<Object>) this.mongoTemplate.find(query, voName);
			
			return list;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<?> searchByOneColumnCaseInsensitive(Class<?> voName, String column, String value) {
		
		try {
			
			Query query = new Query(Criteria.where("status").is(true).and(column).
					regex("^"+value+"$", "i"));
			
			List<?> list = (List<Object>) this.mongoTemplate.find(query, voName);
			
			return list;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<?> searchByTwoColumnCaseInsensitive(Class<?> voName, String column1, String value1, String column2,
			String value2) {
		
		try {
			
			Query query = new Query(Criteria.where("status").is(true).and(column1).regex("^"+value1+"$", "i").and(column2).is(value2));

			List<?> list = (List<Object>) this.mongoTemplate.find(query, voName);
			
			return list;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public List<?> searchByTwoColumnCaseInsensitiveAndNotToOther(Class<?> voName, String column1, String value1, String column2,
			String value2, String column3, String value3) {
		
		try {
			
			Query query = new Query(Criteria.where("status").is(true).and(column1).regex("^"+value1+"$", "i").and(column2).is(value2)
					.and(column3).ne(value3));

			List<?> list = (List<Object>) this.mongoTemplate.find(query, voName);
			
			return list;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<?> searchByTwoColumnNotToOther(Class<?> voName, String column1, String value1, String column2,
			String value2, String column3, String value3) {
		
		try {
			
			Query query = new Query(Criteria.where("status").is(true).and(column1).is(value1).and(column2).is(value2)
					.and(column3).ne(value3));

			List<?> list = (List<Object>) this.mongoTemplate.find(query, voName);
			
			return list;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
