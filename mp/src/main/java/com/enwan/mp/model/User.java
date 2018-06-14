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

import org.springframework.data.annotation.CreatedDate;

import com.enwan.mp.model.Role;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserID")
	private Integer id;
	
	@Column(name = "FirstName", nullable = false, length = 40)
	private String firstName;
	
	@Column(name = "MiddleName", length = 40)
	private String middleName;
	
	@Column(name = "LastName", nullable = false, length = 40)
	private String lastName;
	
	@Column(name = "Username", nullable = false, length = 20)
	private String username;
	
	@Column(name = "Password", nullable = false)
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "RoleID", nullable = false)
	private Role role;
	
	@Column(updatable = false, nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;
}
