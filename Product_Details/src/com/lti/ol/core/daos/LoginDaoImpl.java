/**
 * @Author: Grishma
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.daos;


import java.util.ArrayList;
import java.util.List;

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
	public List<WorkingUser> login(WorkingUser login) throws PrException {
		// TODO Auto-generated method stub
		System.out.println(login.getEmail());
		String qry = "select u from WorkingUser u where u.email=:email and u.password=:password";
		Query q = manager.createQuery(qry);
		q.setParameter("email", login.getEmail());
		q.setParameter("password", login.getPassword());
		List<WorkingUser> user = q.getResultList();
//		List<WorkingUser> log = new ArrayList<>();
//		log.add(login);
		
			return user;	
	}
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public boolean signup(WorkingUser login) throws PrException {
		// TODO Auto-generated method stub
		manager.persist(login);
		return true;
	}
}
