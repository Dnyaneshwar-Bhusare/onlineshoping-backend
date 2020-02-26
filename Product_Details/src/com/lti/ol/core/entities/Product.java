/**
 * @Author: Sonali
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity 
@Table(name="PRODUCT_TABLE")
public class Product {
	
	@Id
	@GeneratedValue(generator="productid_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="productid_seq", sequenceName ="productid_seq", allocationSize=1)
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
	
	@Column(name="IMAGEPATH")
	private String image;
	
	public Product() {
		
	}

	public Product(int pid, String pname, int price, String desc, int cid, String img) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.desc = desc;
		this.cid = cid;
		this.image = image;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", desc=" + desc + ", cid=" + cid
				+ ", image=" + image + "]";
	}
}
