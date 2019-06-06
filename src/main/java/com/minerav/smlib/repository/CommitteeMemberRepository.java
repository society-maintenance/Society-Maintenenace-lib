package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.CommitteeMember;

@Repository
public interface CommitteeMemberRepository extends JpaRepository<CommitteeMember, Object>{

}
