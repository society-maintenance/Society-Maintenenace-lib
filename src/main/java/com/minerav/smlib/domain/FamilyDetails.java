package com.minerav.smlib.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="family_details")
@Data
public class FamilyDetails {

	@Id
	@Column(name="family_member_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="family_details_family_member_id_seq")
	private Integer familyMemberId;
	@ManyToOne(targetEntity=Member.class)
	@JoinColumn(name="member_id")
	private Member member;
	@Column(name="family_name")
	private String familyName;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	private String occupation;
	private Integer age;
	@Column(name="society_primay_candidate")
	private Boolean societyPrimaryCandidate;
}
