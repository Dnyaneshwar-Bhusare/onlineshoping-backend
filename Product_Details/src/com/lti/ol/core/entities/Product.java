package com.lti.ol.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="PRODUCT_DETAILS")
public class Product {
	
	@Id
	@Column(name="productid")
	private int pid;
	
	@Column(name="productname")
	private String pname;
	
	@Column(name="price")
	private int price;
	
	@Column(name="DESCRIPTION")
	private String desc;
	
	@Column(name="categoryid")
	private int cid;
	
	public Product() {
		
	}

	public Product(int pid, String pname, int price, String desc, int cid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.desc = desc;
		this.cid = cid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", desc=" + desc + ", cid=" + cid
				+ "]";
	}
}
