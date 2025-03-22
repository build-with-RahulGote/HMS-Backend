package com.example.demo.Model;

import java.sql.Date;


import lombok.Data;

@Data
public class Patients {
	private int  patientid; 
	   private String name; 
	   private String gender;
	    private Date dob ;
	    
	   private String maritalstatus;
	   
	    private String address;
	    private String email; 
	   
	    private boolean vipstatus ;
	    private String referredby ;
	    private int familycode; 
	    private  String  wpnumber;
	    private  String  mobilenumber;
		
	    
		

	    
	    

}
