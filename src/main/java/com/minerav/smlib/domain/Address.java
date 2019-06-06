package com.minerav.smlib.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.minerav.smlib.util.AddressEnum;

import lombok.Data;

@Entity
@Table(name="member_address")
@Data
public class Address {
 
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="member_address_address_id_seq")
	@Column(name="address_id")
	private Integer addressId;
	@ManyToOne(targetEntity=Member.class)
	@JoinColumn(name="member_id")
	private Member member;
	@Column(name="address_type")
	@Enumerated(EnumType.STRING)
	private AddressEnum addressType;
	@Column(name="address_line1")
	private String addressLine1;
	@Column(name="address_line2")
	private String addressLine2;
	@Column(name="address_line3")
	private String addressLine3;
	private String landmark;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pincode;
	
}