package com.yoojin.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yoojin.entity.User;
import com.yoojin.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/group/user/{userId}")
	public @ResponseBody Optional<User> getUser(@PathVariable long userId) throws Exception {
		return userService.getUserById(userId);
	}
	
	@PostMapping(value="/group/user")
	public void addUser(@RequestBody User user) throws Exception {
		userService.addUser(user);
	}
	
	@PutMapping(value="/group/user/{userId}")
	public void updateUser(@PathVariable long userId, @RequestBody User updtUser) throws Exception {
		User user = userService.getUserById(userId).get();
		user = updtUser;
		userService.addUser(user);
	}
	
	@DeleteMapping(value="/group/user/{userId}")
	public void deleteUser(@PathVariable long userId) throws Exception {
		userService.deleteUserById(userId);
	}
}
