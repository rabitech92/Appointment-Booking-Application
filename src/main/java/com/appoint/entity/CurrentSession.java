package com.appoint.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@Entity
@ToString
public class CurrentSession {

	@Id
	private Integer userId;
	private String uuid;
	private String userType;
	private LocalDateTime localDateTime;
	public CurrentSession() {
	}
	public CurrentSession(Integer userId, String uuid, LocalDateTime localDateTime) {
		super();
		this.userId = userId;
		this.uuid = uuid;
		this.localDateTime = localDateTime;
	}
}
