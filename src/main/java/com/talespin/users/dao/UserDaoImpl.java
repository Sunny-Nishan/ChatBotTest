package com.talespin.users.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.talespin.users.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
    private MongoTemplate mongoTemplate;

	public User findByUserName(String username) {

		List<User> users = new ArrayList<User>();

		Query query = new Query(Criteria.where("email").is(username));
		
		users = this.mongoTemplate.find(query, User.class);
		
		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}

	}

}