package com.lti.ol.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.lti.ol.core.daos.UserDao;
import com.lti.ol.core.entities.User;
import com.lti.ol.core.exceptions.UserException;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserDao dao; 
	
	@Override
	public ArrayList<User> getUserList() throws UserException {
		// TODO Auto-generated method stub
		return dao.getUserList();
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public boolean createNewUser(User user) throws UserException {
		
		return dao.insertnewuser(user);
	}
	
	
	@Override
	public User getUserId(int i) throws UserException {
		
		return dao.getUserId(i);
	}

	

	

	/*@Override
	public ArrayList<User> getUserList() throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createNewUser(User user) throws UserException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProduct(User user) {
		// TODO Auto-generated method stub
		
	}*/

	/*@Override
	public String addProduct(Product product) throws PrException {
		dao.addProduct(product);
		return "inserted successfully";*/
	}

