package com.lti.ol.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.ol.core.entities.Cart;
import com.lti.ol.core.entities.CartItem;
import com.lti.ol.core.entities.Product;
import com.lti.ol.core.exceptions.PrException;

@Repository
public class CartItemDaoImpl implements CartItemDao {

	@PersistenceContext
	private EntityManager manager;
	
		@Override
		public List<CartItem> getCartItemListByCartId(int cartId) throws PrException {
			Cart cart = manager.find(Cart.class, cartId);
			return cart.getCartItem();
		}

		@Transactional(propagation=Propagation.REQUIRED)
		@Override
		public boolean addCartItem(CartItem cartItem) throws PrException {
			manager.persist(cartItem);
			return true;
		}
}
