package com.enwan.mp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PlanDetailDto {

	
    private String name;
    private String description;
    private Integer moduleId;
    private Integer planId;
}
