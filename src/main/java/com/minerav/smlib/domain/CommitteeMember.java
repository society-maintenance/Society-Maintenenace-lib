package com.minerav.smlib.domain;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="committee_member")
@Data
public class CommitteeMember {
	
	@EmbeddedId
	private CommitteeMemberPK committeeMember;
	private Boolean active;
	private Boolean main;
	private Boolean backup;
	@ManyToOne(targetEntity=SocietyBlock.class)
	@JoinColumn(name="block_no")
	private SocietyBlock block;
	
}
