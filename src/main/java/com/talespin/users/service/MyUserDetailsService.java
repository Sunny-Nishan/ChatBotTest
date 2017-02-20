package com.talespin.users.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Transactional
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
	
		com.talespin.users.model.User user = userService.findByUserName(username);
		/*System.err.println("UserType :: "+user.getUserType().getUserType());*/
		List<GrantedAuthority> authorities = buildUserAuthority(user.getUserType().getUserType());

		return buildUserForAuthentication(user, authorities);
		
	}

	private User buildUserForAuthentication(com.talespin.users.model.User user, List<GrantedAuthority> authorities) {
		return new User(user.getEmail(), user.getPassword(), user.getStatus(), true, true, true, authorities);
	}

	private List<GrantedAuthority> buildUserAuthority(String userRole) {

		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

		setAuths.add(new SimpleGrantedAuthority("ROLE_"+userRole.toUpperCase()));
		
		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

		return Result;
	}

}