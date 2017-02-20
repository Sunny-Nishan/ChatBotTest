package com.talespin.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.talespin.users.dao.UserDao;
import com.talespin.users.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
    @Transactional
	public User findByUserName(String username) {

		return this.userDao.findByUserName(username);

	}
	
}
