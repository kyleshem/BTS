package com.enwan.mp.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateStatusDto {
	private Integer plan;
	
	private Integer user;
	
	private Integer module;
	
	private Integer status;
	
	private Date startDate;
	
	private Date endDate;
	
}
