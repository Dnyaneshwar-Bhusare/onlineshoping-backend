/**
 * @Author: Sonali ans Grishma
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.ol.core.entities.Cart;
import com.lti.ol.core.entities.CartItem;
import com.lti.ol.core.entities.CartTable;
import com.lti.ol.core.entities.User;
import com.lti.ol.core.exceptions.PrException;

@Repository
public class CartDaoImpl implements CartDao {
	
	@PersistenceContext 
	private EntityManager manager;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean addToCartTable(CartTable cartTable) throws PrException {
		manager.persist(cartTable);
		return true;
	}

	@Override
	public CartTable getDetailByUserId(int userId) throws PrException {
		return manager.find(CartTable.class, userId);
	}
}
