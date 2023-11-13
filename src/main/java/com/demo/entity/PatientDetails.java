package com.demo.entity;

import java.util.Date;

public class PatientDetails {
	private int patID;
	private String patFName;
	private String patAdd;
	private String patBldGrp;
	private Date patDob;
	private int patAge;
	private Long patMob;
	private Long patEmg;
	private String patGend;
	private String patEmail;
	
	public PatientDetails() {
		super();
	}

	public PatientDetails(int patID, String patFName, String patAdd, String patBldGrp, Date patDob, int patAge, Long patMob,
			Long patEmg, String patGend, String patEmail) {

		super();
		this.patID=patID;
		this.patFName = patFName;
		this.patAdd = patAdd;
		this.patBldGrp = patBldGrp;
		this.patDob = patDob;
		this.patAge = patAge;
		this.patMob = patMob;
		this.patEmg = patEmg;
		this.patGend = patGend;
		this.patEmail = patEmail;
	}

	
	
	public int getPatID() {
		return patID;
	}

	public void setPatID(int patID) {
		this.patID = patID;
	}

	public String getPatFName() {
		return patFName;
	}

	public void setPatFName(String patFName) {
		this.patFName = patFName;
	}

	public String getPatAdd() {
		return patAdd;
	}

	public void setPatAdd(String patAdd) {
		this.patAdd = patAdd;
	}

	public String getPatBldGrp() {
		return patBldGrp;
	}

	public void setPatBldGrp(String patBldGrp) {
		this.patBldGrp = patBldGrp;
	}

	public Date getPatDob() {
		return patDob;
	}

	public void setPatDob(Date patDob) {
		this.patDob = patDob;
	}

	public int getPatAge() {
		return patAge;
	}

	public void setPatAge(int patAge) {
		this.patAge = patAge;
	}

	public Long getPatMob() {
		return patMob;

	}

	public void setPatMob(Long patMob) {
		this.patMob = patMob;

	}

	public Long getPatEmg() {
		return patEmg;

	}

	public void setPatEmg(Long patEmg) {
		this.patEmg = patEmg;

	}

	public String getPatGend() {
		return patGend;

	}

	public void setPatGend(String patGend) {
		this.patGend = patGend;

	}

	public String getPatEmail() {
		return patEmail;

	}

	public void setPatEmail(String patEmail) {
		this.patEmail = patEmail;

	}

}
