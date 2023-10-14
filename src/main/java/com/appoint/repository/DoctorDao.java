package com.appoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appoint.entity.Doctor;

public interface DoctorDao extends JpaRepository<Doctor, Integer> {
	
	public Doctor findByMobileNo(String mobileNo);
}
