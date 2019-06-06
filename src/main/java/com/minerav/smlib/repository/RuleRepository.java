package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.Rule;

@Repository
public interface RuleRepository extends JpaRepository<Rule, Integer>{

}
