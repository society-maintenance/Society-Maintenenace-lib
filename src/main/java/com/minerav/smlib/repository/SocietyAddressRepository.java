package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.SocietyAddress;

@Repository
public interface SocietyAddressRepository extends JpaRepository<SocietyAddress, Integer>{

}
