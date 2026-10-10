package com.rt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao ud;
	
	public boolean checkUser(String username, String password) {
		
		return ud.checkUser(username, password);
		
	}

}
