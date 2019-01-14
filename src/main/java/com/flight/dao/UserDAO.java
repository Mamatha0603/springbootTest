package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.entities.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
	
	void saveUser(User user);
	
	User findByEmail(String email);

}
