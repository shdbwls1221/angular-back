package com.yoojin.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yoojin.dto.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
