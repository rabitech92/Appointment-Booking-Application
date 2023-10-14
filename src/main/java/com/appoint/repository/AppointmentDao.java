package com.appoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appoint.entity.Appointment;

public interface AppointmentDao extends JpaRepository<Appointment, Integer> {

}
