package com.yoojin.service;

import java.util.List;
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
	public List<Group> getGroups() {
		return (List<Group>) groupRepository.findAll();
	}
	
	@Override
	public Optional<Group> getGroupById(long groupId) {
		return (Optional<Group>) groupRepository.findById(groupId);
	}
	
	@Override
	public void addGroup(Group group) {
		groupRepository.save(group);
	}
	
}
