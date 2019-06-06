package com.minerav.smlib.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="rule")
@Data
public class Rule {

	@Id
	@Column(name="rule_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="rule_rule_id_seq")
	private Integer ruleId;
	private String description;
	@Column(name="rule_enforcement_date")
	private Date ruleEnforcementDAte;
	@Column(name="rule_removal_date")
	private Date ruleRemovalDate;
	@Column(name="rule_type")
	private String ruleType;
	@JoinColumn(name="rule_enformcement_committee")
	@ManyToOne(targetEntity=SocietyCommittee.class)
	private SocietyCommittee commitiee;
	@Enumerated(EnumType.STRING)
	private com.minerav.smlib.util.RuleStatus ruleStatus;
	private String fine;
	private String comments;
}
