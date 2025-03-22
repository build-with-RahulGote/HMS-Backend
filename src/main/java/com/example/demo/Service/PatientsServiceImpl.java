package com.example.demo.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Patients;
import com.example.demo.Repository.PatientsRepository;

@Service("patientsService")
public class PatientsServiceImpl implements PatientsService {
	
	@Autowired
	PatientsRepository patientsrepo;

	@Override
	public boolean isAddNewPatients(Patients patients) {
		return patientsrepo.isAddNewPatients(patients);
	}

	@Override
	public List<Patients> getAllPatients() {
		return patientsrepo.getAllPatients();
	}

	@Override
	public List<Patients> searchPatientsByName(String patients) {
		
		return patientsrepo.searchPatientsByName(patients);
	}

	

	



	
	
	
	

}
