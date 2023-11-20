package com.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.PatientDetails;
import com.demo.entity.PatientList;
import com.demo.entity.Prescription;
import com.demo.entity.TestList;
import com.demo.entity.TestReport;
import com.demo.repository.IPatientDetailRepository;
import com.demo.repository.IPatientListRepository;
import com.demo.repository.IPrescriptionRepository;
import com.demo.repository.ITestListRepository;
import com.demo.repository.ITestReportRepository;
@Service
public class IDoctorServiceImpl implements IDoctorService{
	
	private IPatientDetailRepository patientdetailrepository;
    private IPatientListRepository patientListRepository;
	private IPrescriptionRepository prescriptionRepository;
	private ITestListRepository testlistRepository;
	private ITestReportRepository testReportRepository;

	
	@Autowired
	public IDoctorServiceImpl(IPatientDetailRepository patientdetailrepository,
			IPatientListRepository patientListRepository, IPrescriptionRepository prescriptionRepository,
			ITestListRepository testlistRepository, ITestReportRepository testReportRepository) {
		super();
		this.patientdetailrepository = patientdetailrepository;
		this.patientListRepository = patientListRepository;
		this.prescriptionRepository = prescriptionRepository;
		this.testlistRepository = testlistRepository;
		this.testReportRepository = testReportRepository;
	}

	@Override
	public List<PatientDetails> findPatientByIdandName(int staffId, LocalDate apptDate) {
	    List<Integer> patIdList = patientListRepository.findPatientByIdAndApptDate(staffId, apptDate);

	    List<PatientDetails> patientDetailsList = new ArrayList<>();

	    for (Integer patId : patIdList) {
	        PatientDetails patientDetails = patientdetailrepository.findPatient(patId);
	        if (patientDetails != null) {
	            patientDetailsList.add(patientDetails);
	        }
	    }
	    return patientDetailsList;
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
	public Prescription findPres(int patId) {
	    return prescriptionRepository.findById(patId).orElse(null);

	}

	@Override
	public void save(Prescription thePres) {
		prescriptionRepository.save(thePres);
	}

	@Override
	public void save(TestList testlist) {
		testlistRepository.save(testlist);
		
	}

	@Override
	public TestReport findReport(int patId) {
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
