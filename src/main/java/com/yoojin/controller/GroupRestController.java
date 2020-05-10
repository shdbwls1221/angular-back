package com.yoojin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yoojin.dto.Group;
import com.yoojin.service.GroupService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GroupRestController {

	@Autowired
	private GroupService groupService;
	
	@GetMapping(value="/groups")
	public List<Group> getGroups() {
		return groupService.getGroups();
	}
	
	@GetMapping(value="/group/{groupId}")
	public Optional<Group> getGroupById(@PathVariable long groupId) {
		return groupService.getGroupById(groupId);
	}
	
	@PutMapping(value="/group/{groupId}")
	public void modifyGroup(@PathVariable long groupId) {
		Group chngGroup = new Group("수정");
		Group group = groupService.getGroupById(groupId).get();
		group.setName(chngGroup.getName());
		groupService.addGroup(group);
	}
}