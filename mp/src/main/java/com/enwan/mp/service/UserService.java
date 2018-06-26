package com.enwan.mp.service;

import java.util.List;

import com.enwan.mp.dto.PlanDetailDto;
import com.enwan.mp.dto.UserDetailDto;

public interface UserService {
	List<UserDetailDto> getUsers();
	List<PlanDetailDto> findAllPlan();
}
