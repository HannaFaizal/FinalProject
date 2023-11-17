package com.demo.service;

import java.util.List;
import com.demo.entity.TestDetails;

public interface ITestDetailsService {
	
	public abstract List<TestDetails>findAll();
	public abstract TestDetails findById(int theId);
	public abstract void save(TestDetails theTestDetails);
	public abstract void deleteById(int theId);
	
}
