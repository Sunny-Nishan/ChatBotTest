package com.talespin.users.dao;

import com.talespin.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}