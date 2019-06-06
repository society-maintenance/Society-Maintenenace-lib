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
@Table(name="member_flat")
@Data
public class MemberFlat {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="member_flat_id_seq")
	private Integer id;
	
	@ManyToOne(targetEntity=Member.class)
	@JoinColumn(name="member_id")
	private Member member;
	@ManyToOne(targetEntity=SocietyBlock.class)
	@JoinColumn(name="block_number")
	private SocietyBlock blockNo;
	private Boolean owner;
	@Column(name="house_no")
	private String houseNo;
	@Column(name="appartment_id")
	private Integer appartmentId;
}
