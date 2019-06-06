/**
 * 
 */
package com.minerav.smlib.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Nirav
 *
 */
@Entity
@Table(name="member")
@Data
public class Member {

	@Column(name="member_id")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="member_member_id_seq")
	private Integer memberId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="family_name")
	private String familyName;
	private String title;
	private Boolean owner;
	private String email;
	private String phone;
	@Column(name="society_primary_candidate")
	private Boolean primaryCandidate;
	@Column(name="member_registration_date")
	private Date registrationDate;
	@Column(name="member_leave_date")
	private Date endDate;
	@OneToMany(mappedBy="member", fetch=FetchType.LAZY)
	private List<Address> addresses;
	@OneToMany(mappedBy="member",fetch=FetchType.LAZY)
	private List<MemberIdentity> identities;
	@OneToMany(mappedBy="member")
	private List<MemberFlat> appartment;
	@OneToMany(mappedBy="member",fetch=FetchType.LAZY)
	private List<FamilyDetails> family;
	@OneToMany(mappedBy="committeeMember.member")
	private List<CommitteeMember> committeeMembers;
	
}
