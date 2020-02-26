/**
 * @Author: Grishma and Supraja
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.entities;

import java.util.Date;
import java.util.List;

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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Entity
@Table(name="ORDER_DETAILS")
public class OrderDetail {
	
	@Id
	@Column(name="ORDERID")
	@GeneratedValue(generator="order_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "order_seq", sequenceName = "order_seq", allocationSize = 1)
	private int orderId;
	
	
	@Column(name="USERID")		
	private int userId;
	
	@Column(name="ORDEREDDATE")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date orderedDate;
	
	@Column(name="EXPECTED_DELIVERY_DATE")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date expectedDeliveryDate;
	
	@Column(name="TOTALPRICE")
	private int price;
	
	@Column(name="ORDERSTATUS")
	private String orderStatus;
	
	@Column(name="ADDRESSID")
	private String addressId;
	

	@OneToMany(mappedBy = "orderDetail",cascade =CascadeType.ALL, fetch=FetchType.EAGER)
	private List<OrderItem> orderItem;

	public OrderDetail(int orderId, int userId, Date orderedDate, Date expectedDeliveryDate, int price,
			String orderStatus, String addressId, List<OrderItem> orderItem) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.orderedDate = orderedDate;
		this.expectedDeliveryDate = expectedDeliveryDate;
		this.price = price;
		this.orderStatus = orderStatus;
		this.addressId = addressId;
		this.orderItem = orderItem;
	}

	public OrderDetail() {
		super();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}

	public Date getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	@Override
	public String toString() {
		return "OrderDetail [orderId=" + orderId + ", userId=" + userId + ", orderedDate=" + orderedDate
				+ ", expectedDeliveryDate=" + expectedDeliveryDate + ", price=" + price + ", orderStatus=" + orderStatus
				+ ", addressId=" + addressId + "]";
	}

}
