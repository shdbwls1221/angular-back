package com.yoojin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yoojin.entity.Group;
import com.yoojin.service.GroupService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GroupRestController {

	@Autowired
	private GroupService groupService;
	
	@GetMapping(value="/")
	public @ResponseBody List<Group> getGroups() throws Exception {
		return groupService.getGroups();
	}
	
	@GetMapping(value="/group/{groupId}")
	public @ResponseBody Optional<Group> getGroupById(@PathVariable long groupId) throws Exception {
		return groupService.getGroupById(groupId);
	}
	
	@PostMapping(value="/group")
	public void addGroup(@RequestBody Group group) throws Exception {
		groupService.addGroup(group);
	}
	
	@PutMapping(value="/group/{groupId}")
	public void updateGroup(@PathVariable long groupId, @RequestBody Group updtGroup) throws Exception {
		Group group = groupService.getGroupById(groupId).get();
		group = updtGroup;
		groupService.addGroup(group);
	}
	
	@DeleteMapping(value="/group/{groupId}")
	public void deleteUser(@PathVariable long groupId) throws Exception {
		groupService.deleteGroupById(groupId);
	}
}
