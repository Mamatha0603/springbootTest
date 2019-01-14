package com.flight.service;

import com.flight.entities.User;

public interface UserService {

	void saveUser(User user);
	User getEmail(String email);
}
