package com.test.service;

import java.util.List;

import com.test.controller.User;
import com.test.entity.IndexUser;


public interface IndexUserService {
	
	 void createIndexUser(User user);
	 
	 int deleteIndexUser(int id);
	
	public List<IndexUser> getAllUsers();

}
