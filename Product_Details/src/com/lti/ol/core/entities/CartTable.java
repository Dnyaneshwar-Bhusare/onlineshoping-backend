/**
 * @Author: Dnyaneshwar
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CART_DETAILS_TABLE")
public class CartTable {

	
	private int cartId;
	@Id
	private int userId;
	private int productId;
	private int quantity;
	
	public CartTable() {
		
	}

	public CartTable(int cartId,int userId, int productId, int quantity) {
		super();
		this.cartId=cartId;
		this.userId = userId;
		this.productId = productId;
		this.quantity = quantity;
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
		return "CartTable [cartId=" + cartId + ", userId=" + userId + ", productId=" + productId + ", quantity="
				+ quantity + "]";
	}

	
}
