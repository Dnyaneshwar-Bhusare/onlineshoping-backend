package com.lti.ol.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CART_ITEMS")
public class CartItem {
	@Id
	@Column(name="CART_ITEM_ID")
	private int cartItemId;
	@Column(name="CART_ID")
	private int cartId;
	@Column(name="PRODUCT_ID")
	private int productId;
	@Column(name="QUANTITY")
	private int quantity;
	

	public CartItem(int cartItemId, int cartId, int productId, int quantity) {
		super();
		this.cartItemId = cartItemId;
		this.cartId = cartId;
		this.productId = productId;
		this.quantity = quantity;
	}

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
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

	@Override
	public String toString() {
		return "CartItems [cartItemId=" + cartItemId + ", cartId=" + cartId + ", productId=" + productId + ", quantity="
				+ quantity + "]";
	}

}
