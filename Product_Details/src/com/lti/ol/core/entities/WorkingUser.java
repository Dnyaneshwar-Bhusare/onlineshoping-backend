package com.lti.ol.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class WorkingUser {
	
	@Id
	@Column(name="USERID")
	@GeneratedValue(generator="login_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "login_seq", sequenceName = "login_seq", allocationSize = 1)
	private int uid;
	
	@Column(name="NAME")
	private String uname;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="MOBILENO")
	private double mblNo;
	
	@Column(name="PASSWORD")
	private String password;
	
	
	@Column(name="ADDRESSID")
	private int addrsid;


	public WorkingUser(int uid, String uname, String email, double mblNo, String password, int addrsid) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
		this.mblNo = mblNo;
		this.password = password;
		this.addrsid = addrsid;
	}


	public WorkingUser() {
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getAddrsid() {
		return addrsid;
	}


	public void setAddrsid(int addrsid) {
		this.addrsid = addrsid;
	}


	@Override
	public String toString() {
		return "Login [uid=" + uid + ", uname=" + uname + ", email=" + email + ", mblNo=" + mblNo + ", password=" + password
				+ ", addrsid=" + addrsid + "]";
	}


	public void setResult(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
