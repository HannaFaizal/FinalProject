package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String userPass;
	private int stfId;
	@ManyToOne
	@JoinColumn(name = "stfId", insertable = false, updatable = false)
	private StaffDetails staffdetails;
	
	public UserDetails() {
		super();
	}
	
	public UserDetails(int userId, String userPass, int staffId, StaffDetails staffdetails) {
		super();
		this.userId = userId;
		this.userPass = userPass;
		this.stfId = staffId;
		this.staffdetails = staffdetails;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public int getStaffId() {
		return stfId;
	}
	public void setStaffId(int staffId) {
		this.stfId = staffId;
	}
	public StaffDetails getStaffdetails() {
		return staffdetails;
	}
	public void setStaffdetails(StaffDetails staffdetails) {
		this.staffdetails = staffdetails;
	}

	
	
}
