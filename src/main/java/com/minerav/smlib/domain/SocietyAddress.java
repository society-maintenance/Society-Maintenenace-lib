package com.minerav.smlib.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="society_address")
@Data
public class SocietyAddress {

	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="society_address_address_id_seq")
	private Integer addressId;
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
