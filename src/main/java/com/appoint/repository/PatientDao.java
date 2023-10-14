package com.appoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appoint.entity.Patient;



public interface PatientDao extends JpaRepository<Patient, Integer> {
	
	public Patient findByMobileNo(String mobileNo);
}
