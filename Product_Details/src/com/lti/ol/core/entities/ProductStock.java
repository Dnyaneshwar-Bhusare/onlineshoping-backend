package com.lti.ol.core.entities;

import javax.persistence.CascadeType;
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
@Table(name="PRODUCT_STOCK")
public class ProductStock {
	
	@Id
	@Column(name="STOCKID")
	@GeneratedValue(generator="stock_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="stock_seq",sequenceName="stock_seq",allocationSize=1)
	private int stockId;
	
	@Column(name="PRODUCTID")
	private int productId;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="RETAILERID")
	private Retailer retailer;
	
	@Column(name="QUANTITY")
	private int quantity;

	public ProductStock(int stockId, int productId, Retailer retailerId, int quantity) {
		super();
		this.stockId = stockId;
		this.productId = productId;
		this.retailer = retailerId;
		this.quantity = quantity;
	}

	public ProductStock() {
		super();
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Retailer getRetailer() {
		return retailer;
	}

	public void setRetailer(Retailer retailerId) {
		this.retailer = retailerId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductStock [stockId=" + stockId + ", productId=" + productId
				+ ", quantity=" + quantity + "]";
	}
}
