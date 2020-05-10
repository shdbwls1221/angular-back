package com.yoojin.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yoojin.dto.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public List<User> findAllByGroupId(long groupId);
}
