package com.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.entity.PatientDetails;
import com.demo.entity.PatientList;

public interface IPatientListRepository extends JpaRepository<PatientList, Integer> {

    @Query("SELECT pd FROM PatientList pd WHERE pd.staffId = :staffId AND pd.apptDate = :apptDate")
    List<Integer> findPatientByIdAndApptDate(@Param("staffId") int staffId, @Param("apptDate") LocalDate apptDate);
    
}