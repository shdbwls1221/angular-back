package com.yoojin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yoojin.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

}
