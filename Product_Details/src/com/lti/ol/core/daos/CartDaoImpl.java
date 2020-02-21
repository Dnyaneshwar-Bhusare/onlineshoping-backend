package com.lti.ol.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;

import com.lti.ol.core.entities.CartItem;
import com.lti.ol.core.exceptions.PrException;

@Repository
public class CartDaoImpl implements CartDao {
	
	@PersistenceContext 
	private EntityManager manager;

	@org.springframework.transaction.annotation.Transactional(propagation = Propagation.REQUIRED)
	@Override
	public String addToCart(CartItem cartItem) throws PrException {
		manager.persist(cartItem);
		return null;
	}


	
	

}
