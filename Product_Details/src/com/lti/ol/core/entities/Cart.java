/**
 * @Author: Dnyaneshwar
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import antlr.collections.List;

@Entity
@Table(name="CART_DETAILS")
public class Cart {
	
	@Id
	@Column(name = "CARTID")
	@GeneratedValue(generator="CART_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="CART_seq", sequenceName ="CART_seq", allocationSize=1)
	private int cartId;
	
	@Column(name = "USERID")
	private int userId;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cart",cascade =CascadeType.ALL, fetch=FetchType.EAGER)
	private java.util.List<CartItem> cartItem;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(int cartId, int userId, java.util.List<CartItem> cartItem) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.cartItem = cartItem;
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

	public java.util.List<CartItem> getCartItem() {
		return cartItem;
	}

	public void setCartItem(java.util.List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", cartItem=" + cartItem + "]";
	}
}
