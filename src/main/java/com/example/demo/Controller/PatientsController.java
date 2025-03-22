package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Exceptions.patientsNotFoundException;

import com.example.demo.Model.Patients;
import com.example.demo.Service.PatientsService;

@RestController
@CrossOrigin("http://localhost:5173")
public class PatientsController {

	@Autowired
	PatientsService patientsService;

	@PostMapping("/createPatients")

	public String createPatients(@RequestBody Patients patients)
	{
		boolean b=patientsService.isAddNewPatients(patients);
		if(b) {
			return "Patients Added Succefully";
		}
		else {
		return "Patients Not Added";
		}
		
	}
	
	 @GetMapping("/getAllPatients")
	public List<Patients>showPatients()
	{
		 List<Patients>list=patientsService.getAllPatients();
			if(list.size()!=0)
			{
				return list;
			}
			else
			{
			   throw new patientsNotFoundException("Data Not Avilable in Database");
			}
		
	}
	 
	
	 @GetMapping("searchpatientsByName/{patients}")
		public ResponseEntity<List<Patients>> searchEmployeeByName(@PathVariable("patients") String patients) {
		 System.out.println("Patient name:"+""+patients);
		    List<Patients> list = patientsService.searchPatientsByName(patients);

		    if (!list.isEmpty()) {
		        return ResponseEntity.ok(list);
		    } else {
		        throw new patientsNotFoundException("Patient with name '" + patients + "' not found in the database.");
		    }
		}
	 
	 

	 
}
