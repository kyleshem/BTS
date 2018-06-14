package com.enwan.mp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.enwan.mp.dto.UserDetailDto;
import com.enwan.mp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	 User findByUsername(String username);
	 Boolean existsByUsername(String username);

	 @Query("select new com.enwan.mp.dto.UserDetailDto(e.id, e.firstName, e.middleName, e.lastName, e.role.roleName, e.createdAt) from User e where e.role.roleName IS :role")
	 List<UserDetailDto> userDetailView(@Param("role") String role);
}
