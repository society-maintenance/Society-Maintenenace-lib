package com.minerav.smlib.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="archived_member")
@Data
public class ArchivedMember {

	@Column(name="member_id")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="archived_member_member_id_seq")
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
	
	@OneToMany()
	@JoinTable(name="archived_member_address",
			joinColumns= {@JoinColumn(referencedColumnName="member_id")},
			inverseJoinColumns= {@JoinColumn(referencedColumnName="address_id")})
	private List<Address> addresses;
	
	@OneToMany()
	@JoinTable(name="archived_member_identity",
			joinColumns={@JoinColumn(referencedColumnName="member_id")},
			inverseJoinColumns= {@JoinColumn(referencedColumnName="identity_id")})
	private List<MemberIdentity> identities;
	
	@OneToMany()
	@JoinTable(name="archived_member_flat",
			joinColumns= {@JoinColumn(referencedColumnName="member_id")},
			inverseJoinColumns= {@JoinColumn(referencedColumnName="appartment_id")})
	private List<MemberFlat> appartment;
	
	
	
}
