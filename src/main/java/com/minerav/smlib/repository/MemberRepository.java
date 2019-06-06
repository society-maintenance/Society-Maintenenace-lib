package com.minerav.smlib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smlib.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{

}
