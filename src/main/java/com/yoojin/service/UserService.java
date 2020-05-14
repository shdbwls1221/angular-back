package com.yoojin.service;

import java.util.List;
import java.util.Optional;

import com.yoojin.entity.User;

public interface UserService {

	public List<User> getUsers() throws Exception;
	
	public Optional<User> getUserById(long userId) throws Exception;
	
	public void addUser(User user) throws Exception;
	
	public void deleteUserById(long userId) throws Exception;
}
