package com.demo.entity;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docId;
	private String docFN;
	private String docGnd;
	private Date docDob;
	private long docMob;
	private String docAdd;
	private Date docJod;
	private String docQualif;
	private String docSpec;
	private int docSal;
	private String docBldGrp;
	private String docEmail;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int docId, String docFN, String docGnd, Date docDob, long docMob, String docAdd, Date docJod,
			String docQualif, String docSpec, int docSal, String docBldGrp, String docEmail) {
		super();
		this.docId = docId;
		this.docFN = docFN;
		this.docGnd = docGnd;
		this.docDob = docDob;
		this.docMob = docMob;
		this.docAdd = docAdd;
		this.docJod = docJod;
		this.docQualif = docQualif;
		this.docSpec = docSpec;
		this.docSal = docSal;
		this.docBldGrp = docBldGrp;
		this.docEmail = docEmail;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDocFN() {
		return docFN;
	}

	public void setDocFN(String docFN) {
		this.docFN = docFN;
	}

	public String getDocGnd() {
		return docGnd;
	}

	public void setDocGnd(String docGnd) {
		this.docGnd = docGnd;
	}

	public Date getDocDob() {
		return docDob;
	}

	public void setDocDob(Date docDob) {
		this.docDob = docDob;
	}

	public long getDocMob() {
		return docMob;
	}

	public void setDocMob(long docMob) {
		this.docMob = docMob;
	}

	public String getDocAdd() {
		return docAdd;
	}

	public void setDocAdd(String docAdd) {
		this.docAdd = docAdd;
	}

	public Date getDocJod() {
		return docJod;
	}

	public void setDocJod(Date docJod) {
		this.docJod = docJod;
	}

	public String getDocQualif() {
		return docQualif;
	}

	public void setDocQualif(String docQualif) {
		this.docQualif = docQualif;
	}

	public String getDocSpec() {
		return docSpec;
	}

	public void setDocSpec(String docSpec) {
		this.docSpec = docSpec;
	}

	public int getDocSal() {
		return docSal;
	}

	public void setDocSal(int docSal) {
		this.docSal = docSal;
	}

	public String getDocBldGrp() {
		return docBldGrp;
	}

	public void setDocBldGrp(String docBldGrp) {
		this.docBldGrp = docBldGrp;
	}

	public String getDocEmail() {
		return docEmail;
	}

	public void setDocEmail(String docEmail) {
		this.docEmail = docEmail;
	}

}
