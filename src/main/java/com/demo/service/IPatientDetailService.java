package com.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.demo.entity.PatientDetails;

public interface IPatientDetailService {
	public abstract PatientDetails findPatient(int patId);
	public abstract PatientDetails findById(int patId);
	public abstract List<PatientDetails> findPatientByIdandName(int stfId,LocalDate apptDate);

	
}
