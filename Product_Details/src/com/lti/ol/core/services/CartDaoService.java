package com.lti.ol.core.services;

import com.lti.ol.core.entities.CartItem;
import com.lti.ol.core.exceptions.PrException;


public interface CartDaoService {

	public String addToCart(CartItem cart) throws PrException;
}
