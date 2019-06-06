package com.minerav.smlib.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="committee_role")
@Data
public class CommitteeRole {

	@Id
	@Column(name="role_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="committee_role_role_id_seq")
	private Integer roleId;
	private String role;
	private String responsibility;
}
