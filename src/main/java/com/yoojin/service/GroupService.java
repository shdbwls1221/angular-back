package com.yoojin.service;

import java.util.Optional;

import com.yoojin.dto.Group;

public interface GroupService {

	public Optional<Group> getGroupById(long id);
}
