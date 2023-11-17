package com.demo.service;

import com.demo.entity.TestReport;

public interface ITestReportService {
	public abstract TestReport findById(int patId);
	
}
