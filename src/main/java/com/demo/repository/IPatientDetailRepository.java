package com.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.entity.PatientDetails;
import com.demo.entity.PatientList;

public interface IPatientDetailRepository extends JpaRepository<PatientDetails, Integer> {
    
    @Query("SELECT pd FROM PatientDetails pd WHERE pd.patId = :patId")
	public PatientDetails findPatient(int patId);

}
