package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.SocietyBlock;

@Repository
public interface SocietyBlockRepository extends JpaRepository<SocietyBlock, Integer>{

}
