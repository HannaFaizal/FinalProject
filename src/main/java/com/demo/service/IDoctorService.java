package com.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.demo.entity.PatientDetails;
import com.demo.entity.PatientList;
import com.demo.entity.Prescription;
import com.demo.entity.TestList;
import com.demo.entity.TestReport;

public interface IDoctorService {
	public abstract List<PatientDetails> findPatientByIdandName(int staffId,LocalDate apptDate);
	public abstract PatientDetails findPatient(int patId);
	public abstract PatientDetails findById(int patId);
	public abstract Prescription findPres(int patId);
	public abstract void save(Prescription thePres);
	public abstract void save(TestList testlist);
	public abstract TestReport findReport(int patId);

}
