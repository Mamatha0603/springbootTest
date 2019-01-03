package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.controller.User;
import com.test.dao.IndexUserDAO;
import com.test.entity.IndexUser;

@Service("IndexUserService")
@Transactional
public class IndexUserServiceImpl implements IndexUserService {
	
	@Autowired
	private IndexUserDAO indexUserDAO;

	@Override
	public void createIndexUser(User user) {
		
		System.out.println("In service implemation..     "+indexUserDAO);
		//IndexUser  indexUser1=  indexUserDAO.save(indexUser);
		//System.out.println("In service implemation.. indexUser1    "+indexUser1);
		indexUserDAO.addIndexUser(user);
	}
	
	@Override
	public List<IndexUser> getAllUsers() {
		//return indexUserDAO.findAll();
		return null;
		}

	@Override
	public int deleteIndexUser(int id) {
		
		return 0;
	}

}
