package com.example.demo.Repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.DBConfig;
import com.example.demo.Model.Appointment;
import com.example.demo.Model.Patients;
@Repository("patientrepo")
public class PatientsRepositoryImpl implements PatientsRepository {
	@Autowired
	JdbcTemplate jdbctemplate;

	@Override
	public boolean isAddNewPatients(Patients patients) {
		int value=jdbctemplate.update("insert into patients values(?,?,?,?,?,?,?,?,?,?,?,?)",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, patients.getPatientid());
				ps.setString(2, patients.getName());
				ps.setString(3, patients.getGender());
				ps.setDate(4, patients.getDob());
				ps.setString(5, patients.getMaritalstatus());
				ps.setString(6, patients.getAddress());
				ps.setString(7, patients.getEmail());
				ps.setBoolean(8, patients.isVipstatus());
				ps.setString(9, patients.getReferredby());
				ps.setInt(10,patients.getFamilycode());
				ps.setString(11,patients.getWpnumber());
				ps.setString(12, patients.getMobilenumber());
			
				
			}
			
		});
		return value>0?true:false;
	}

	@Override
	public List<Patients> getAllPatients() {
		
		List<Patients>list=jdbctemplate.query("select * from Patients", new RowMapper<Patients>() {

			@Override
			public Patients mapRow(ResultSet rs, int rowNum) throws SQLException {
				Patients pmp=new Patients();
				pmp.setPatientid(rs.getInt("patientid"));
				pmp.setName(rs.getString("name"));
				pmp.setGender(rs.getString("gender"));
				pmp.setDob(rs.getDate("dob"));
				pmp.setMaritalstatus(rs.getString("maritalstatus"));
				pmp.setAddress(rs.getString("address"));
				pmp.setEmail(rs.getString("email"));
				pmp.setVipstatus(rs.getBoolean("vipstatus"));
				pmp.setReferredby(rs.getString("referredby"));
				pmp.setFamilycode(rs.getInt("familycode"));
				pmp.setWpnumber(rs.getString("wpnumber"));
				pmp.setMobilenumber(rs.getString("mobilenumber"));
				return pmp;
			}
			
		});
		
		return  list;
	}

	@Override
	public List<Patients> searchPatientsByName(String patientName) {
	    String sql = "SELECT * FROM Patients WHERE name LIKE ?";
	    
	    List<Patients> list = jdbctemplate.query(sql, new Object[]{"%" + patientName + "%"}, new RowMapper<Patients>() {
	        @Override
	        public Patients mapRow(ResultSet rs, int rowNum) throws SQLException {
	        	Patients pmp = new Patients();
	        	pmp.setPatientid(rs.getInt("patientid"));
				pmp.setName(rs.getString("name"));
				pmp.setGender(rs.getString("gender"));
				pmp.setDob(rs.getDate("dob"));
				pmp.setMaritalstatus(rs.getString("maritalstatus"));
				pmp.setAddress(rs.getString("address"));
				pmp.setEmail(rs.getString("email"));
				pmp.setVipstatus(rs.getBoolean("vipstatus"));
				pmp.setReferredby(rs.getString("referredby"));
				pmp.setFamilycode(rs.getInt("familycode"));
				pmp.setWpnumber(rs.getString("wpnumber"));
				pmp.setMobilenumber(rs.getString("mobilenumber"));
	            return pmp;
	        }
	    });

	    return list;
		
	    
	   
	}

	@Override
	public boolean BookAppointment(Appointment apt) {
			int value=jdbctemplate.update("insert into appointments values(?,?,?,?,?,?)",new PreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					// TODO Auto-generated method stub
					ps.setInt(1, apt.getAppointmentid());
					ps.setInt(2, apt.getPatientid());
					ps.setInt(3, apt.getDoctorid());
					ps.setDate(4,apt.getDate());
					ps.setTime(5,apt.getTime());
					ps.setString(6,apt.getStatus());
					
				}
			});
		return value>0?true:false;
	}

		
	
	}
	

