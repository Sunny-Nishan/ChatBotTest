package com.talespin.users.service;

import com.talespin.users.model.User;

public interface UserService {

	public User findByUserName(String username);
	
}
