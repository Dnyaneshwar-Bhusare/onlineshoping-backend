package com.lti.ol.core.daos;

import com.lti.ol.core.entities.Cart;
import com.lti.ol.core.entities.CartItem;
import com.lti.ol.core.entities.Product;
import com.lti.ol.core.exceptions.PrException;

public interface CartDao {
	public boolean addToCart(Cart cart) throws PrException;
	public Cart getCartIdByUserId(int userId) throws PrException;
}
