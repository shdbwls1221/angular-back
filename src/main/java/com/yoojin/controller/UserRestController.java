package com.yoojin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.yoojin.entity.User;
import com.yoojin.service.GroupService;
import com.yoojin.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private GroupService groupService;
	
	@PostMapping(value="/users")
	public void addUser(@RequestBody User user) throws JsonMappingException, JsonProcessingException {
		userService.addUser(user);
	}
	
}
