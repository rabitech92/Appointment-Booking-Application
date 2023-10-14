package com.appoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appoint.entity.Review;

public interface ReviewDao extends JpaRepository<Review, Integer> {

}
