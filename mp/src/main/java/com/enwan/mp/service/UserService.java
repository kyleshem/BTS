package com.enwan.mp.service;

import java.util.List;

//import com.enwan.mp.dto.ChangePasswordDto;
//import com.enwan.mp.dto.CreateUserDto;
import com.enwan.mp.dto.UserDetailDto;


public interface UserService {
//	User createUser(CreateUserDto createUserDto);
//	User changePassword(ChangePasswordDto changePasswordDto);
//	Boolean checkUsernameExist(String username);
	List<UserDetailDto> getUsers();
}
