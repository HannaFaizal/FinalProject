package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.entity.Prescription;
import com.demo.repository.IPrescriptionRepository;
@Service
public class IPrescriptionServiceImpl implements IPrescriptionService{
	
	private IPrescriptionRepository prescriptionRepository;
	public IPrescriptionServiceImpl(IPrescriptionRepository prescriptionRepository) {
		super();
		this.prescriptionRepository = prescriptionRepository;
	}

	@Override
	public List<Prescription> findAll() {
		return prescriptionRepository.findAll();
	}

	@Override
	public Prescription findById(int patId) {
		Optional<Prescription>result=prescriptionRepository.findById(patId);
		Prescription thePres=null;
		if(result.isPresent()) {
			thePres=result.get();
		}
		else {
			throw new RuntimeException("Did not find prescription Id "+patId);
		}
		return thePres;
	}
	

	@Override
	public void save(Prescription thePres) {
		prescriptionRepository.save(thePres);
	}

	@Override
	public void deleteById(int prescId) {
		prescriptionRepository.deleteById(prescId);
	}

}
