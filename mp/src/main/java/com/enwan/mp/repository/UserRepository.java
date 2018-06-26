package com.enwan.mp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.enwan.mp.dto.PlanDetailDto;
import com.enwan.mp.dto.UserDetailDto;
//import com.enwan.mp.dto.TraineeProgressDto;
import com.enwan.mp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	 @Query("SELECT new com.enwan.mp.dto.UserDetailDto(e.id, e.firstName, e.middleName, e.lastName, e.role.roleName, e.createdAt, p.plan.id) FROM User e INNER JOIN PlanDetail p ON p.user.id = e.id WHERE e.role.roleName IS :role GROUP BY e.id")
	 List<UserDetailDto> userDetailView(@Param("role") String role);
	 												 // Module Name, Module Description, PD Instructor, PD Start, PD End, PD Status, Plan ID, Module ID, PD ID
	 @Query("SELECT new com.enwan.mp.dto.PlanDetailDto(a.module.name, a.module.description, a.module.id, a.plan.id) FROM PlanDetail a ORDER BY a.plan.id ASC")
	 List<PlanDetailDto> findAllBy();

}
