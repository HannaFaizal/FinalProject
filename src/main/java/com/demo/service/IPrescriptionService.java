package com.demo.service;

import java.util.List;

import com.demo.entity.Prescription;
import com.demo.entity.TestReport;


public interface IPrescriptionService {

	public abstract List<Prescription>findAll();
	public abstract Prescription findById(int patId);
	public abstract void save(Prescription thePres);
	public abstract void deleteById(int prescId);
}
