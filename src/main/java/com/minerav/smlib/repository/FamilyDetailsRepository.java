package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.FamilyDetails;

@Repository
public interface FamilyDetailsRepository extends JpaRepository<FamilyDetails, Object>{

}
