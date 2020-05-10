package com.yoojin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojin.dao.UserRepository;
import com.yoojin.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}
	
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}
}
