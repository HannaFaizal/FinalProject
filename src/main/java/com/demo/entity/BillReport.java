package com.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BillReport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int billNo;
	private int patId;
	private Date billDate;
	private Long amount;
	public BillReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BillReport(int billNo, int patId, Date billDate, Long amount) {
		super();
		this.billNo = billNo;
		this.patId = patId;
		this.billDate = billDate;
		this.amount = amount;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public int getPatId() {
		return patId;
	}
	public void setPatId(int patId) {
		this.patId = patId;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	

}