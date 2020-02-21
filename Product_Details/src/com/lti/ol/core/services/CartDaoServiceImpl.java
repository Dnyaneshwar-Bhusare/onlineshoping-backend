package com.lti.ol.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.ol.core.daos.CartDao;
import com.lti.ol.core.entities.CartItem;
import com.lti.ol.core.exceptions.PrException;

@Service
public class CartDaoServiceImpl implements CartDaoService{

	@Autowired
	private CartDao cartDao;
	@Override
	public String addToCart(CartItem cart) throws PrException {

		cartDao.addToCart(cart);
		return null;
	}
	

}
