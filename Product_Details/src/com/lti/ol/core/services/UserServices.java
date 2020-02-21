package com.lti.ol.core.services;

import java.util.ArrayList;


import com.lti.ol.core.entities.User;
import com.lti.ol.core.exceptions.UserException;


public interface UserServices {

	public ArrayList<User> getUserList() throws UserException;
	public User getUserId(int i) throws UserException;
	/*ArrayList<User> getUserList() throws UserException;
	public void addProduct(User user);*/
	public boolean createNewUser(User user) throws UserException ;
	
	
	
}
