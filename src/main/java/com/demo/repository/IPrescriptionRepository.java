package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.entity.Prescription;

public interface IPrescriptionRepository extends JpaRepository<Prescription, Integer> {

}
