package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.CommitteeRole;

@Repository
public interface CommitteeRoleRepository extends JpaRepository<CommitteeRole, Integer>{

}
