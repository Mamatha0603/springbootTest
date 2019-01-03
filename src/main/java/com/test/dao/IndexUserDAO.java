package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.controller.User;
import com.test.entity.IndexUser;

@Repository
public interface IndexUserDAO extends JpaRepository<IndexUser, Long>{

	void addIndexUser(User user);
	
	
	

	

}
