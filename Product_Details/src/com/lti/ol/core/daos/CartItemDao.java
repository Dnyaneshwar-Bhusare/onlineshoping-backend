package com.lti.ol.core.daos;

import java.util.ArrayList;
import java.util.List;

import com.lti.ol.core.entities.CartItem;
import com.lti.ol.core.entities.Product;
import com.lti.ol.core.exceptions.PrException;

public interface CartItemDao {

	public List<CartItem> getCartItemListByCartId(int cartId) throws PrException;
	public boolean addCartItem(CartItem cartItem) throws PrException;
}
