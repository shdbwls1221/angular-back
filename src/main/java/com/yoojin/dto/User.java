package com.yoojin.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)	//모든 필드를 변환할 필요가 없을 때
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String name;
	@Column
	private String email;
	
	public User() {	}
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "{\"id\": \"" + id + "\", \"name\": \"" + name + "\", \"email\": \"" + email + "\"}";
	}
	
}
