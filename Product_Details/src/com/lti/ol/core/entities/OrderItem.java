/**
 * @Author: Grishma and Supraja
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.entities;

import java.util.ArrayList;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ORDER_ITEM")
public class OrderItem {

	@Id
	@Column(name="ORDER_ITEM_ID")
	@GeneratedValue(generator="orderItem_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "orderItem_seq", sequenceName = "orderItem_seq", allocationSize = 1)
	private int orderItemId;
		
	@Column(name="PRODUCTID")
	private int productId;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ORDERID")
	@JsonIgnore
	private OrderDetail orderDetail;

	public OrderItem(int orderItemId, int productId, int quantity, OrderDetail orderDetail) {
		super();
		this.orderItemId = orderItemId;
		this.productId = productId;
		this.quantity = quantity;
		this.orderDetail = orderDetail;
	}

	public OrderItem() {
		super();
	}

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
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

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", productId=" + productId + ", quantity=" + quantity
				+  "]";
	}

	
	
}
