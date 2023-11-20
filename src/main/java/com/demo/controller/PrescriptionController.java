package com.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
import com.demo.service.IDoctorService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PrescriptionController {

   private IDoctorService iDoctorService;
   
@Autowired
  public PrescriptionController(IDoctorService iDoctorService) {
	super();
	this.iDoctorService = iDoctorService;
}

@GetMapping("/appointments/{stfId}")

  public List<PatientDetails> findAll(@PathVariable int staffId) {

      LocalDate currentDate = LocalDate.now();

      return (List<PatientDetails>) iDoctorService.findPatientByIdandName(staffId, currentDate);

  }

	

	@GetMapping("/patients/{patId}")

	public PatientDetails getPatient(@PathVariable int patId){

		PatientDetails thePatientDetails=iDoctorService.findById(patId);

      if(thePatientDetails==null) {

      	throw new RuntimeException("patient id not found-"+patId);

      }

      return thePatientDetails;	

}

	@GetMapping("/prescription/{patId}")

	public Prescription getPatientPresc(@PathVariable int patId){

		Prescription thePrescription=iDoctorService.findPres(patId);

      if(thePrescription==null) {

      	throw new RuntimeException("patient id not found-"+patId);

      }

      return thePrescription;	

}

	  @PostMapping("/precription")

	    public Prescription addPrescription(@RequestBody Prescription thePrescription) {

	        thePrescription.setPrescId(0);

	        iDoctorService.save(thePrescription);

	        return thePrescription;

	    }



	    @PostMapping("/test")

	    public TestList addTest(@RequestBody TestList theTestList) {

	        theTestList.setTestId(0);

	        iDoctorService.save(theTestList);

	        return theTestList;

	    }
	
}
