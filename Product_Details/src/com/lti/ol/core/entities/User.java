package com.lti.ol.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="USER_DETAILS")
public class User {
	
	@Id
	@Column(name="USERID")
	private int uid;
	
	@Column(name="NAME")
	private String uname;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="MOBILENO")
	private double mblNo;
	
	@Column(name="PASSWORD")
	private String pwd;
	
	
	@Column(name="ADDRESSID")
	private int addrsid;


	public User(int uid, String uname, String email, double mblNo, String pwd, int addrsid) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
		this.mblNo = mblNo;
		this.pwd = pwd;
		this.addrsid = addrsid;
	}


	public User() {
		super();
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getMblNo() {
		return mblNo;
	}


	public void setMblNo(double mblNo) {
		this.mblNo = mblNo;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public int getAddrsid() {
		return addrsid;
	}


	public void setAddrsid(int addrsid) {
		this.addrsid = addrsid;
	}


	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", email=" + email + ", mblNo=" + mblNo + ", pwd=" + pwd
				+ ", addrsid=" + addrsid + "]";
	}
	
	
}

	
	
	
	
	