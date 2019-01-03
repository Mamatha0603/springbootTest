package com.test.dao;



import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.test.controller.User;
import com.test.entity.IndexUser;

@Repository("IndexUserDAO")
public class IndexUserDAOImpl implements IndexUserDAO {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public void addIndexUser(User user) {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		System.out.println("Session object in DAOIMPL::"+session);
		IndexUser indexUser=new IndexUser(user.getId(),user.getUsername(),user.getEmail());
		
		session.save(indexUser);
		
		
	}
	

	@Override
	public IndexUser getOne(Long id) {
		
		return null;
	}
	
	

	@Override
	public List<IndexUser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IndexUser> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IndexUser> findAll(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IndexUser> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends IndexUser> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<IndexUser> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <S extends IndexUser> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IndexUser> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<IndexUser> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IndexUser> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndexUser findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(IndexUser entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends IndexUser> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends IndexUser> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IndexUser> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IndexUser> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends IndexUser> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

		
	
}
