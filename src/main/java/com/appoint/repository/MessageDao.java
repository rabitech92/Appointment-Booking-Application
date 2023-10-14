package com.appoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appoint.entity.Message;

public interface MessageDao extends JpaRepository<Message, Integer> {

}
