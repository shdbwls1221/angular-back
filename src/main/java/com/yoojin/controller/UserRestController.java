package com.yoojin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.yoojin.dto.Group;
import com.yoojin.dto.User;
import com.yoojin.service.GroupService;
import com.yoojin.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private GroupService groupService;

	@GetMapping(value="/{groupId}/users")
	public List<User> getUsers(@PathVariable long groupId){
		Group group = groupService.getGroupById(groupId).get();
		List<User> users = group.getUsers();
		return users;
	}
	
	@PostMapping(value="/users")
	public void addUser(@RequestBody User user) throws JsonMappingException, JsonProcessingException {
		userService.addUser(user);
	}
	
}
