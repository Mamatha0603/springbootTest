package com.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Service;

import com.flight.dao.UserDAO;
import com.flight.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public void saveUser(User user) {
		System.out.println("testing" + userDAO);

		userDAO.saveUser(user);

	}

	@Override
	public User getEmail(String email) {

		User user = userDAO.findByEmail(email);
		System.out.println("In service impl:"+user.getEmail());
		System.out.println("In servirce impl:"+user.getPassword());

		return user;

	}
}
