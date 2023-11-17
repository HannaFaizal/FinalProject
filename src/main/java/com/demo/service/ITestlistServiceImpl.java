package com.demo.service;

import com.demo.entity.TestList;
import com.demo.repository.ITestListRepository;

public class ITestlistServiceImpl implements ITestListService {

	private ITestListRepository testlistRepository;

	
	@Override
	public void save(TestList testlist) {
		testlistRepository.save(testlist);
	}

}
