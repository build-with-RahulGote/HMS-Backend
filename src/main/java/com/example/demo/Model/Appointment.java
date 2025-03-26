package com.example.demo.Model;

import java.sql.Date;
import java.sql.Time;


public class Appointment {
	
	private int patientid;
	private int appointmentid;
	private Date date;
	private String status;
	public Appointment() {}
	public Appointment(int patientid, int appointmentid, Date date, String status, Time time,int doctorid) {
		super();
		this.patientid = patientid;
		this.appointmentid = appointmentid;
		this.date = date;
		this.status = status;
		this.time = time;
		this.doctorid=doctorid;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public int getAppointmentid() {
		return appointmentid;
	}
	public void setAppointmentid(int appointmentid) {
		this.appointmentid = appointmentid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	private Time time;
	private int doctorid;
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
}
