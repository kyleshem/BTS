package com.enwan.mp.dto;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
// USING UPDATE STATUS DTO LANG SA KAY PAREHA RA MAN PUD
@Data
@AllArgsConstructor
public class UserProgressDto {

	private Integer user;
	
	private Integer plan;
	
	private Integer module;
	
	private String moduleName;
	
	private Integer status;
	
	private Date startDate;
	
	private Date endDate;
	
}

