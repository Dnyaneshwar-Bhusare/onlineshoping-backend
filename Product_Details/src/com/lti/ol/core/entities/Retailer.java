package com.lti.ol.core.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="RETAILER")
public class Retailer {

	@Id
	@Column(name="RETAILERID")
	private int retailerId;
	
	@Column(name="USERID")
	private int uid;
	
	@JsonIgnore
	@OneToMany(mappedBy = "retailer",cascade =CascadeType.ALL, fetch=FetchType.EAGER)
	private List<ProductStock> productStock;

	public Retailer(int retailerId, int uid, List<ProductStock> productStock) {
		super();
		this.retailerId = retailerId;
		this.uid = uid;
		this.productStock = productStock;
	}

	public Retailer() {
		super();
	}

	public int getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public List<ProductStock> getProductStock() {
		return productStock;
	}

	public void setProductStock(List<ProductStock> productStock) {
		this.productStock = productStock;
	}

	@Override
	public String toString() {
		return "Retailer [retailerId=" + retailerId + ", uid=" + uid + ", productStock=" + productStock + "]";
	}

}
