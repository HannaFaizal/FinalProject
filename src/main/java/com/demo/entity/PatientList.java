package com.demo.entity;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PatientList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int appNbr;
	private int patId;
	@ManyToOne
    @JoinColumn(name = "patId",insertable = false,updatable=false)
	private PatientDetails patientDetails;
	private int staffId;
	@ManyToOne
    @JoinColumn(name = "staffId",insertable = false,updatable=false)
	private StaffDetails staffDetails;
	private Date apptDate;
	
	public PatientList() {
		super();
	}
	
	public PatientList(int appNbr, int patId, PatientDetails patientDetails, int stfId, StaffDetails staffDetails,
			Date apptDate) {
		super();
		this.appNbr = appNbr;
		this.patId = patId;
		this.patientDetails = patientDetails;
		this.staffId = staffId;
		this.staffDetails = staffDetails;
		this.apptDate = apptDate;
	}
	public int getAppNbr() {
		return appNbr;
	}
	public void setAppNbr(int appNbr) {
		this.appNbr = appNbr;
	}
	public int getPatId() {
		return patId;
	}
	public void setPatId(int patId) {
		this.patId = patId;
	}
	public PatientDetails getPatientDetails() {
		return patientDetails;
	}
	public void setPatientDetails(PatientDetails patientDetails) {
		this.patientDetails = patientDetails;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStfId(int stfId) {
		this.staffId = stfId;
	}
	public StaffDetails getStaffDetails() {
		return staffDetails;
	}
	public void setStaffDetails(StaffDetails staffDetails) {
		this.staffDetails = staffDetails;
	}

	public Date getApptDate() {
		return apptDate;
	}

	public void setApptDate(Date apptDate) {
		this.apptDate = apptDate;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	
	
	

}