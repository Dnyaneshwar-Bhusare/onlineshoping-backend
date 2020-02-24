package com.lti.ol.core.daos;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.ol.core.entities.WorkingUser;
import com.lti.ol.core.exceptions.PrException;

@Repository
public class LoginDaoImpl implements LoginDao{

	@PersistenceContext
	private EntityManager manager;

	@Override
	public boolean login(String email, String password) throws PrException {
		// TODO Auto-generated method stub
		String qry = "select u from WorkingUser u where u.email=:email and u.password=:password";
		Query q = manager.createQuery(qry);
		q.setParameter("email", email);
		q.setParameter("password", password);
		WorkingUser login = (WorkingUser) q.getSingleResult();
		if(login.getEmail().equals(email) && login.getPassword().equals(password)){
			System.out.println("true");
			return true;
		}
		else
		{
			System.out.println("false");
			return false;
		}
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public boolean signup(WorkingUser login) throws PrException {
		// TODO Auto-generated method stub
		manager.persist(login);
		return true;
	}
}
