package com.lti.ol.core.daos;

import java.util.ArrayList;

import com.lti.ol.core.entities.User;
import com.lti.ol.core.exceptions.UserException;


public interface UserDao {
	
	public ArrayList<User> getUserList() throws UserException;
	//public User getUserId(int i) throws UserException;
	//public String addProduct(User user) throws UserException;
	public boolean insertnewuser(User user) throws UserException;
	public User getUserId(int i) throws UserException;
}
