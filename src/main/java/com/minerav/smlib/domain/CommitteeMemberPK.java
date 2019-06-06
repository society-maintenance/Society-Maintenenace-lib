package com.minerav.smlib.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter @Setter @ToString
public class CommitteeMemberPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -911047847804144311L;
	@ManyToOne(targetEntity=SocietyCommittee.class)
	@JoinColumn(name="committee_id")
	private SocietyCommittee committee;
	@ManyToOne(targetEntity=Member.class)
	@JoinColumn(name="member_id")
	private Member member;
	@ManyToOne(targetEntity=CommitteeRole.class)
	@JoinColumn(name="role_id")
	private CommitteeRole committeeRole;
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) 
			return false;
		if(!(obj instanceof CommitteeMemberPK))
			return false;
		CommitteeMemberPK o =(CommitteeMemberPK)obj;
		boolean equals=Objects.nonNull(o.getCommittee()) && 
				Objects.equals(o.getCommittee().getCommitteeId(), this.committee.getCommitteeId()) &&
				Objects.nonNull(o.getMember()) && 
				Objects.equals(o.getMember().getMemberId(), this.getMember().getMemberId()) &&
				Objects.nonNull(o.getCommitteeRole()) && 
				Objects.equals(o.getCommitteeRole().getRoleId(), this.committeeRole.getRoleId());
		return equals;
	}
	
	@Override
	public int hashCode() {
		int hash =17;
		hash = 31 * hash + this.getCommittee().getCommitteeId().hashCode();
		hash = 31 * hash + this.getCommitteeRole().getRoleId().hashCode();
		hash = 31 * hash + this.getMember().getMemberId().hashCode();
		return hash;
	}
}
