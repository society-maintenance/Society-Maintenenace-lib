package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.MemberFlat;

@Repository
public interface MemberFlatRepository extends JpaRepository<MemberFlat, Object>{

}
