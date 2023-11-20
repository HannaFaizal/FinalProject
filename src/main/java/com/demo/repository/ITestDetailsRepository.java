package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.entity.TestDetails;

public interface ITestDetailsRepository extends JpaRepository<TestDetails, Integer> {

}
