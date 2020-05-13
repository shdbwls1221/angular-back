package com.yoojin.service;

import java.util.List;
import java.util.Optional;

import com.yoojin.entity.Group;

public interface GroupService {

	public List<Group> getGroups();
	
	public Optional<Group> getGroupById(long groupId);
	
	public void addGroup(Group group);
}
