package com.yoojin.service;

import java.util.List;
import java.util.Optional;

import com.yoojin.entity.Group;

public interface GroupService {

	public List<Group> getGroups() throws Exception;
	
	public Optional<Group> getGroupById(long groupId) throws Exception;
	
	public void addGroup(Group group) throws Exception;
	
	public void deleteGroupById(long groupId) throws Exception;
}
