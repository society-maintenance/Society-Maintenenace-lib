package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.RuleStatus;

@Repository
public interface RulestatusRepository extends JpaRepository<RuleStatus, Integer>{

}
