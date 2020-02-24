package com.lti.ol.core.daos;

import com.lti.ol.core.entities.WorkingUser;
import com.lti.ol.core.exceptions.PrException;

public interface LoginDao {

 public boolean login(String email,String password) throws PrException;
 public boolean signup(WorkingUser login) throws PrException;
}
