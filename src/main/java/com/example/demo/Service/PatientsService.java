package com.example.demo.Service;

import java.util.List;


import com.example.demo.Model.Patients;

public interface PatientsService {
public boolean isAddNewPatients(Patients patients);
public List<Patients> getAllPatients();
public List<Patients> searchPatientsByName(String patients) ;



}
