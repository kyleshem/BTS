package com.enwan.mp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.enwan.mp.dto.UserDetailDto;
import com.enwan.mp.model.Role;
import com.enwan.mp.model.User;
import com.enwan.mp.repository.RoleRepository;
import com.enwan.mp.repository.UserRepository;
import com.enwan.mp.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
	
	private static final String DEFAULT_PASSWORD = "Welcome18";


//	@Override
//	public Boolean checkUsernameExist(String username) {
//		return userRepository.existsByUsername(username);
//	}

	@Override
	public List<UserDetailDto> getUsers() {
		return userRepository.userDetailView("ROLE_TRAINEE");
	}

	
}
