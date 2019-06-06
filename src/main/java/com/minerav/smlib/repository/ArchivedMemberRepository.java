package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.ArchivedMember;

@Repository
public interface ArchivedMemberRepository extends JpaRepository<ArchivedMember, Integer>{

}
