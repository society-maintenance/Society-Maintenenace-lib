package com.minerav.smlib.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import lombok.Data;

@Entity
@Table(name="society_committee")
@Data
public class SocietyCommittee {

	@Id
	@Column(name="committee_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="society_committee_committee_id_seq")
	private Integer committeeId;
	@Column(name="start_date")
	private Date startDate;
	@Column(name="end_date")
	private Date endDate;
	private Boolean active;
	@OneToMany(mappedBy="committeeMember.committee")
	private List<CommitteeMember> committeeMember;
	@OneToMany(mappedBy="commitiee",fetch=FetchType.LAZY)
	private List<Rule> societyRules;
}
