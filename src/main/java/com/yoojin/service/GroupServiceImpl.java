package com.yoojin.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojin.dao.GroupRepository;
import com.yoojin.dto.Group;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	GroupRepository groupRepository;
	
	@Override
	public Optional<Group> getGroupById(long id) {
		return groupRepository.findById(id);
	}
}
