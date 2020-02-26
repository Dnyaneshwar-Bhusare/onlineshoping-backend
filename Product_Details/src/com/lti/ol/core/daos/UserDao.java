/**
 * @Author: Supraja
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.daos;

import java.util.ArrayList;

import com.lti.ol.core.entities.User;
import com.lti.ol.core.exceptions.PrException;


public interface UserDao {
	
	public ArrayList<User> getUserList() throws PrException;
	//public User getUserId(int i) throws UserException;
	//public String addProduct(User user) throws UserException;
	public boolean insertnewuser(User user) throws PrException;
	public User getUserId(int i) throws PrException;
}
