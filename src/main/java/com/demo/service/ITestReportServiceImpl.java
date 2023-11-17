package com.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.entity.Prescription;
import com.demo.entity.TestReport;
import com.demo.repository.ITestReportRepository;
@Service
public class ITestReportServiceImpl implements ITestReportService {

	private ITestReportRepository testReportRepository;
	
	
	public ITestReportServiceImpl(ITestReportRepository testReportRepository) {
		super();
		this.testReportRepository = testReportRepository;
	}


	@Override
	public TestReport findById(int patId) {
		Optional<TestReport>result=testReportRepository.findById(patId);
		TestReport tr=null;
		if(result.isPresent()) {
			tr=result.get();
		}
		else {
			throw new RuntimeException("Did not find prescription Id "+patId);
		}
		return tr;
	}

}
