package com.enwan.mp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "plandetail")
public class PlanDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DetailID")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "PlanID", nullable = false)
	private Plan plan;
	
	@ManyToOne
	@JoinColumn(name = "UserID", nullable = false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "ModuleID", nullable = false)
	private Module module;
	
	@Column(name = "StartDate", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	@Column(name = "EndDate", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	
	@Column(name = "Instructor", nullable = false)
	private String instructor;
	
	@Column(name = "DetailStatus", nullable = false, columnDefinition = "BIT")
	private Integer status;
	
}
