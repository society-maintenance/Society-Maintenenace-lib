package com.minerav.smlib.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="society_block")
@Data
public class SocietyBlock {
	@Id
	@Column(name="block_number")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="society_block_block_number_seq")
	private String blockNo;

	private String description;
	@Column(name="location_description")
	private String locationDescription;
	private Integer appartments;
	private Integer lifts;
	@Column(name="common_electric_equipment")
	private String commonElectricEquipment;

}
