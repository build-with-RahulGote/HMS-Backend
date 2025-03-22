package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Model.Patients;

public interface PatientsRepository {
	public boolean isAddNewPatients(Patients patients);
	public List<Patients> getAllPatients();
	
	public List<Patients> searchPatientsByName(String patients) ;
}
