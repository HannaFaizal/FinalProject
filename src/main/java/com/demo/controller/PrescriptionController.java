package com.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.PatientDetails;
import com.demo.entity.Prescription;
import com.demo.entity.TestList;
import com.demo.entity.TestReport;
import com.demo.service.IPatientDetailService;
import com.demo.service.IPrescriptionService;
import com.demo.service.ITestListService;
import com.demo.service.ITestReportService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class PrescriptionController {
	private IPrescriptionService prescriptionService;
	private ITestReportService testReportService;
	private ITestListService testListService;
    private IPatientDetailService patientDetailService;

	
	@Autowired
	public PrescriptionController(IPrescriptionService prescriptionService) {
		super();
		this.prescriptionService = prescriptionService;
	}
	@Autowired
	public PrescriptionController(ITestReportService testReportService) {
		super();
		this.testReportService = testReportService;
	}

	@Autowired
	public PrescriptionController(ITestListService testListService) {
		super();
		this.testListService = testListService;
	}
	
	@Autowired
	public PrescriptionController(IPatientDetailService patientDetailService) {
		super();
		this.patientDetailService = patientDetailService;
	}
	
	
	@GetMapping("/prescription")
	public List<Prescription> findAll() {
		return prescriptionService.findAll();
	}
	
	@GetMapping("/prescription/{patId}")
	public Prescription getprescription(@PathVariable int patId) {
		Prescription thePres = prescriptionService.findById(patId);
		if (thePres == null) {
			throw new RuntimeException("Prescription id not found-" + patId);
		}
		return thePres;
	}

	@PostMapping("/prescription")
	public Prescription addPrescription(@RequestBody Prescription thePres) {
		thePres.setPrescId(0);
		prescriptionService.save(thePres);
		return thePres;
	}

	@PutMapping("/prescription/{patId}")
	public Prescription updatePrescription(@PathVariable int patId, @RequestBody Prescription thePres) {
		Prescription pres = prescriptionService.findById(patId);
		if (thePres == null) {
			throw new RuntimeException("prescription id not found-" + patId);
		}

		pres.setPrescId(thePres.getPrescId());
		pres.setPatId(thePres.getPatId());
		pres.setStfFName(thePres.getStfFName());
		pres.setPresc(thePres.getPresc());
		pres.setMedi(thePres.getMedi());
		prescriptionService.save(pres);
		return pres;
	}

	@DeleteMapping("/prescription/{patId}")
	public String deletePrescription(@PathVariable int patId) {
		Prescription thePres = prescriptionService.findById(patId);
		if (thePres == null) {
			throw new RuntimeException("prescription id not found-" + patId);
		}
		prescriptionService.deleteById(patId);
		return "Deleted prescId: " + patId;

	}
//--------------------------------------------------------------------------

	
	@GetMapping("/testreport/{patId}")
	public TestReport getTestreport(@PathVariable int patId) {
		TestReport tr = testReportService.findById(patId);
		if (tr == null) {
			throw new RuntimeException("Prescription id not found-" + patId);
		}
		return tr;
	}

//---------------------------------------------------------------------

	@PostMapping("/testlist")
	public TestList addTestList(@RequestBody TestList testlist) {
		testlist.setPatId(0);
		testListService.save(testlist);
		return testlist;
	}
//--------------------------------------------------------------
	@GetMapping("/appointments/{stfId}")
	public List<PatientDetails> findall(@RequestParam int stfId) {
	    LocalDate currentDate = LocalDate.now();
	    return (List<PatientDetails>) patientDetailService.findPatientByIdandName(stfId, currentDate);
	}

	@GetMapping("/appointments/{patId}")
	public PatientDetails getPatients(@PathVariable int patId) {
	    PatientDetails patientDetails = patientDetailService.findById(patId);

	    if (patientDetails == null) {
	        throw new RuntimeException("Patient not found with ID: " + patId);
	    }

	    return patientDetails;
	}


	
}
