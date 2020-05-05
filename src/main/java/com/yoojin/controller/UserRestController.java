package com.yoojin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yoojin.dao.UserRepository;
import com.yoojin.dto.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping(value="/users")
	public List<String> getUsers(){
		List<User> users = (List<User>) userRepository.findAll();
		List<String> usersStr = new ArrayList<>();
		for(User user : users)
			usersStr.add(user.toString());
		return usersStr;
	}
	
	@PostMapping(value="/users")
	public void addUser(@RequestBody User user) throws JsonMappingException, JsonProcessingException {
//		ObjectMapper mapper = new ObjectMapper();
//		User addUser = mapper.readValue(user, User.class);
		userRepository.save(user);
	}
}
