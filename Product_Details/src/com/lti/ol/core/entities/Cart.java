package com.lti.ol.core.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CART_DETAILS")
public class Cart {
	@Id
	private int cartId;
	private int userId;
	

	public Cart(int cartId, int userId) {
		super();
		this.cartId = cartId;
		this.userId = userId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + "]";
	}
}
