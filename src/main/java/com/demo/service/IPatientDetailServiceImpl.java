package com.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.demo.entity.PatientDetails;
import com.demo.repository.IPatientDetailRepository;

public class IPatientDetailServiceImpl implements IPatientDetailService {

	private IPatientDetailRepository patientdetailrepository;
	
	
	public IPatientDetailServiceImpl(IPatientDetailRepository patientdetailrepository) {
		super();
		this.patientdetailrepository = patientdetailrepository;
	}

	@Override
	public PatientDetails findPatient(int patId) {
	    return patientdetailrepository.findById(patId).orElse(null);

	}

	@Override
	public PatientDetails findById(int patId) {
		Optional<PatientDetails>pd=patientdetailrepository.findById(patId);
		PatientDetails pds=null;
		if(pd.isPresent()) {
			pds=pd.get();
		}
		else {
			throw new RuntimeException("Did not find patient detail Id "+patId);
		}
		return pds;
	}

	@Override
	public List<PatientDetails> findPatientByIdandName(int stfId, LocalDate apptDate) {
	    List<PatientDetails> patientDetailsList = patientdetailrepository.findPatientByIdAndApptDate(stfId, apptDate);
	    List<PatientDetails> patientDetailList = new ArrayList<>();

	    for (PatientDetails patientDetails : patientDetailsList) {
	        Integer patientId = patientDetails.getPatID();

	        if (patientId != null) {
	            patientDetailList.add(patientDetails);
	        }
	    }

	    return patientDetailList;
	}


}
