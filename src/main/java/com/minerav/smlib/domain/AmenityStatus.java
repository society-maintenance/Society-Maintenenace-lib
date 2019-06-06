package com.minerav.smlib.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="amenity_status")
@Data
public class AmenityStatus {
	
	@Id
	@Column(name="status_id")
	private Integer statusId;
	private String status;

}
