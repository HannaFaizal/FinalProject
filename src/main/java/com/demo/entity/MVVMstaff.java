package com.demo.entity;

import java.util.Date;

public class MVVMstaff {
	private String stfFName;
	private String stfGnd;
	private Date stfDob;
	private long stfMob;
	private String stfAdd;
	private String stfDept;
	private String stfQualif;
	private Date stfJod;
	
	private int stfSal;
	private String stfBldGrp;
	private String stfEmail;
	
	private String stfSpec;
	private String userId;
	private String userPassword;
	
	public MVVMstaff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public MVVMstaff(String stfFName, String stfGnd, Date stfDob, long stfMob, String stfAdd, String stfDept,
			String stfQualif, Date stfJod, int stfSal, String stfBldGrp, String stfEmail, String stfSpec, String userId,
			String userPassword) {
		super();
		this.stfFName = stfFName;
		this.stfGnd = stfGnd;
		this.stfDob = stfDob;
		this.stfMob = stfMob;
		this.stfAdd = stfAdd;
		this.stfDept = stfDept;
		this.stfQualif = stfQualif;
		this.stfJod = stfJod;
		this.stfSal = stfSal;
		this.stfBldGrp = stfBldGrp;
		this.stfEmail = stfEmail;
		this.stfSpec = stfSpec;
		this.userId = userId;
		this.userPassword = userPassword;
	}


	public String getStfFName() {
		return stfFName;
	}
	public void setStfFName(String stfFName) {
		this.stfFName = stfFName;
	}
	public String getStfGnd() {
		return stfGnd;
	}
	public void setStfGnd(String stfGnd) {
		this.stfGnd = stfGnd;
	}
	public Date getStfDob() {
		return stfDob;
	}
	public void setStfDob(Date stfDob) {
		this.stfDob = stfDob;
	}
	public long getStfMob() {
		return stfMob;
	}
	public void setStfMob(long stfMob) {
		this.stfMob = stfMob;
	}
	public String getStfAdd() {
		return stfAdd;
	}
	public void setStfAdd(String stfAdd) {
		this.stfAdd = stfAdd;
	}
	public String getStfDept() {
		return stfDept;
	}
	public void setStfDept(String stfDept) {
		this.stfDept = stfDept;
	}
	public String getStfQualif() {
		return stfQualif;
	}
	public void setStfQualif(String stfQualif) {
		this.stfQualif = stfQualif;
	}
	public Date getStfJod() {
		return stfJod;
	}
	public void setStfJod(Date stfJod) {
		this.stfJod = stfJod;
	}
	public int getStfSal() {
		return stfSal;
	}
	public void setStfSal(int stfSal) {
		this.stfSal = stfSal;
	}
	public String getStfBldGrp() {
		return stfBldGrp;
	}
	public void setStfBldGrp(String stfBldGrp) {
		this.stfBldGrp = stfBldGrp;
	}
	public String getStfEmail() {
		return stfEmail;
	}
	public void setStfEmail(String stfEmail) {
		this.stfEmail = stfEmail;
	}
	public String getStfSpec() {
		return stfSpec;
	}
	public void setStfSpec(String stfSpec) {
		this.stfSpec = stfSpec;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
