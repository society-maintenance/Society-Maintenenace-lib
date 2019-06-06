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
@Table(name="member_identity")
@Data
public class MemberIdentity {

	@Id
	@Column(name="identity_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="member_identity_identity_id_seq")
	private Integer id;
	@ManyToOne(targetEntity=Member.class)
	@JoinColumn(name="member_id")
	private Member member;
	@Column(name="id_card_type")
	private String idCardType;
	@Column(name="card_number")
	private String cardNumber;
	private String file;
}
