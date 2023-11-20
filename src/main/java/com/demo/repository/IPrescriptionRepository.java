package com.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.PatientDetails;
import com.demo.entity.Prescription;

public interface IPrescriptionRepository extends JpaRepository<Prescription, Integer> {


}
