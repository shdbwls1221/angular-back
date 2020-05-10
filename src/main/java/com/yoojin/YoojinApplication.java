package com.yoojin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yoojin.dao.GroupRepository;
import com.yoojin.dao.UserRepository;
import com.yoojin.dto.Group;
import com.yoojin.dto.User;

@SpringBootApplication
public class YoojinApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(YoojinApplication.class, args);
	}
	
	@Autowired
	private GroupRepository groupRepository;
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Group group1 = new Group("GROUP01");
		Group group2 = new Group("GROUP02");
		
		List<User> user1 = new ArrayList<>();
		user1.add(new User("Yoojin", "yoojin@email.com"));
		user1.add(new User("Cheolsu", "cheolsu@email.com"));
		group1.addUsers(user1.get(0));
		group1.addUsers(user1.get(1));
		groupRepository.save(group1);
		
		List<User> user2 = new ArrayList<>();
		user2.add(new User("Younghee", "younghee@email.com"));
		user2.add(new User("Badook", "badook@email.com"));
		group2.addUsers(user2.get(0));
		group2.addUsers(user2.get(1));
		groupRepository.save(group2);
		
		List<Group> groupList = (List<Group>)groupRepository.findAll();
		System.out.println(groupList.get(0));
		System.out.println(groupList.get(1));
	}
}
