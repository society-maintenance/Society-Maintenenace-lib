package com.minerav.smlib.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="society_amenities")
@Data
public class SocietyAmenities {

	@Id
	@Column(name="amenity_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="society_amenities_amenity_id_seq")
	private Integer amenityId;
	private String description;
	private String location;
	private Boolean maintenanceRequired;
	@Enumerated(EnumType.STRING)
	private com.minerav.smlib.util.AmenityStatus status;
}
