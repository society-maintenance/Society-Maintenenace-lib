package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.MemberIdentity;

@Repository
public interface MemberIdentityRepository extends JpaRepository<MemberIdentity, Object>{

}
