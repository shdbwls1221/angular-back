package com.yoojin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yoojin.entity.Group;
import com.yoojin.repository.GroupRepository;

@Service
@Transactional
public class GroupServiceImpl implements GroupService {

	@Autowired
	GroupRepository groupRepository;
	
	@Override
	public List<Group> getGroups() throws Exception {
		return (List<Group>) groupRepository.findAll();
	}
	
	@Override
	public Optional<Group> getGroupById(long groupId) throws Exception {
		return (Optional<Group>) groupRepository.findById(groupId);
	}
	
	@Override
	public void addGroup(Group group) throws Exception {
		groupRepository.save(group);
	}
	
	@Override
	public void deleteGroupById(long groupId) throws Exception {
		groupRepository.deleteById(groupId);
	}
	
}
