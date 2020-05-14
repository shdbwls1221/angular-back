package com.yoojin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojin.entity.User;
import com.yoojin.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsers() throws Exception {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(long userId) throws Exception {
		return (Optional<User>) userRepository.findById(userId);
	}

	@Override
	public void addUser(User user) throws Exception {
		userRepository.save(user);
	}
	
	@Override
	public void deleteUserById(long userId) throws Exception {
		userRepository.deleteById(userId);
	}
}
