package com.yoojin.service;

import java.util.List;

import com.yoojin.dto.User;

public interface UserService {

	public List<User> getUsers();
	
	public void addUser(User user);
}
