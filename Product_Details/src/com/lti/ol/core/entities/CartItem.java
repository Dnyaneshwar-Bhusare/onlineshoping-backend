package com.lti.ol.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CART_ITEMS")
public class CartItem {
	
	@Id
	@Column(name="CART_ITEM_ID")
	@GeneratedValue(generator="CART_ITEMS_C_ID_SEQ", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="CART_ITEMS_C_ID_SEQ", sequenceName ="CART_ITEMS_C_ID_SEQ", allocationSize=1)
	private int cartItemId;
	
	@Column(name="PRODUCTID")
	private int productId;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CARTID")
	private Cart cart;
	
	public CartItem() {
		
	}

	public CartItem(int cartItemId, int productId, int quantity, Cart cart) {
		super();
		this.cartItemId = cartItemId;
		this.productId = productId;
		this.quantity = quantity;
		this.cart = cart;
	}

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "CartItem [cartItemId=" + cartItemId + ", productId=" + productId + ", quantity=" + quantity + "]";
	}
}
