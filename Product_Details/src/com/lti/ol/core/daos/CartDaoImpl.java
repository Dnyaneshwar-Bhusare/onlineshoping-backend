package com.lti.ol.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;

import com.lti.ol.core.entities.Cart;
import com.lti.ol.core.entities.CartItem;
import com.lti.ol.core.entities.User;
import com.lti.ol.core.exceptions.PrException;

@Repository
public class CartDaoImpl implements CartDao {
	
	@PersistenceContext 
	private EntityManager manager;

	@org.springframework.transaction.annotation.Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean addToCart(Cart cart) throws PrException {
		manager.persist(cart);
		return true;
	}

	@Override
	public Cart getCartIdByUserId(int userId) throws PrException {
		return manager.find(Cart.class, userId);
	}
}
