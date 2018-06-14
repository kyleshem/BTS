package com.enwan.mp.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDetailDto {
	
	private Integer id;

	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String roleName;
	
	private Date createdAt; 
}
