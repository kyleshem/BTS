package com.enwan.mp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.enwan.mp.dto.UserDetailDto;
import com.enwan.mp.service.UserService;

@RestController
@RequestMapping("/api")
public class TraineeController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value={"/", "/facilitator/trainees"}, method = RequestMethod.GET)
	public ModelAndView index() {

		ModelAndView view = new ModelAndView();
//		view.addObject("title", "Trainee Program Plan | Bootcamp Tracking System");
//		view.addObject("content", "/modules");
//		view.addObject("extra", false);
		view.setViewName("facilitator/trainees");
		
		return view;
	}
	
	@GetMapping("/users")
	public List<UserDetailDto> getUsers(){
		return userService.getUsers();
	}
}
