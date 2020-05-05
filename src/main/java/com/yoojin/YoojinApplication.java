package com.yoojin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yoojin.dao.UserRepository;
import com.yoojin.dto.User;

@SpringBootApplication
public class YoojinApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(YoojinApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Yoojin", "yoojin@email.com"));
		userRepository.save(new User("Cheolsu", "cheolsu@email.com"));
		userRepository.save(new User("Younghee", "younghee@email.com"));
		userRepository.save(new User("Badook", "badook@email.com"));
		
		System.out.println(userRepository.findAll());
	}
}
