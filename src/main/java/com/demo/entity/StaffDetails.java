package com.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StaffDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffId;
	private String stfFName;
	private String stfGnd;
	private Date stfDob;
	private long stfMob;
	private String stfAdd;
	private String stfDept;
	private String stfQualif;
	private String stfSpec;
	private Date stfJod;
	private int stfSal;
	private String stfBldGrp;
	private String stfEmail;
	private boolean isActive;
	
	
	
	public StaffDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaffDetails(int staffId, String stfFName, String stfGnd, Date stfDob, long stfMob, String stfAdd,
			String stfDept, String stfQualif, String stfSpec, Date stfJod, int stfSal, String stfBldGrp,
			String stfEmail, boolean isActive) {
		super();
		this.staffId = staffId;
		this.stfFName = stfFName;
		this.stfGnd = stfGnd;
		this.stfDob = stfDob;
		this.stfMob = stfMob;
		this.stfAdd = stfAdd;
		this.stfDept = stfDept;
		this.stfQualif = stfQualif;
		this.stfSpec = stfSpec;
		this.stfJod = stfJod;
		this.stfSal = stfSal;
		this.stfBldGrp = stfBldGrp;
		this.stfEmail = stfEmail;
		this.isActive = isActive;
	}

	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int stfId) {
		this.staffId = stfId;
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
	public String getStfSpec() {
		return stfSpec;
	}
	public void setStfSpec(String stfSpec) {
		this.stfSpec = stfSpec;
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	
}
