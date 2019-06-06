package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.SocietyAmenities;

@Repository
public interface SocietyAmenitiesRepository extends JpaRepository<SocietyAmenities, Integer>{

}
