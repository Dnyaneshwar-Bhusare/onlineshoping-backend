package com.lti.ol.core.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.ol.core.entities.User;
import com.lti.ol.core.exceptions.PrException;


@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext 
	private EntityManager manager;
	
	@Override
	public ArrayList<User> getUserList() throws PrException {
		Query qry = manager.createQuery("FROM User");
		ArrayList<User> getUserList = (ArrayList<User>) qry.getResultList();		
		return getUserList;	
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public boolean insertnewuser(User user) throws PrException {
		manager.persist(user);
		return true;
	}

	@Override
	public User getUserId(int i) throws PrException {
		
		return manager.find(User.class, i);
	}

	

	
	
	/*@org.springframework.transaction.annotation.Transactional(propagation = Propagation.REQUIRED)
	@Override
	public String addProduct(User user) throws UserException {
		manager.persist(product);
		
		return "data inserted";
	}*/

	
}
