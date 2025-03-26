package com.example.demo.Model;

import java.sql.Date;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class Patients {
	public Patients() {}
	private int  patientid; 
	   public Patients(int patientid, String name, String gender, Date dob, String maritalstatus, String address,
			String email, boolean vipstatus, String referredby, int familycode, String wpnumber, String mobilenumber) {
		super();
		this.patientid = patientid;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.maritalstatus = maritalstatus;
		this.address = address;
		this.email = email;
		this.vipstatus = vipstatus;
		this.referredby = referredby;
		this.familycode = familycode;
		this.wpnumber = wpnumber;
		this.mobilenumber = mobilenumber;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isVipstatus() {
		return vipstatus;
	}
	public void setVipstatus(boolean vipstatus) {
		this.vipstatus = vipstatus;
	}
	public String getReferredby() {
		return referredby;
	}
	public void setReferredby(String referredby) {
		this.referredby = referredby;
	}
	public int getFamilycode() {
		return familycode;
	}
	public void setFamilycode(int familycode) {
		this.familycode = familycode;
	}
	public String getWpnumber() {
		return wpnumber;
	}
	public void setWpnumber(String wpnumber) {
		this.wpnumber = wpnumber;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
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
