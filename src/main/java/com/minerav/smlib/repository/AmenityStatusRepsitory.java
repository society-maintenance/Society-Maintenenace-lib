package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.AmenityStatus;

@Repository
public interface AmenityStatusRepsitory extends JpaRepository<AmenityStatus, Integer>{

}
