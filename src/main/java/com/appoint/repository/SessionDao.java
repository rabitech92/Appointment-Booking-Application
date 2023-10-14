package com.appoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appoint.entity.CurrentSession;


public interface SessionDao extends JpaRepository<CurrentSession, Integer> {
	
	public CurrentSession findByUuid(String uuid);
	
}
