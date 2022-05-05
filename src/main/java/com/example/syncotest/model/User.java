package com.example.syncotest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	 @Id
	 @Column(nullable=false)
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	private String userId;
	private String fname;
	private String lname;
	private String email;
	private String mobile;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String fname, String lname, String email, String mobile) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
	}
	
	
}
