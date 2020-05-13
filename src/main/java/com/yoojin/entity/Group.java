package com.yoojin.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@SequenceGenerator(name="GROUP_SEQ_GEN", sequenceName = "GROUP_SEQ", initialValue = 1, allocationSize = 1)
@Table(name = "GROUP_TABLE")
public class Group {
	
	@Id
	@Column(name="GROUP_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="GROUP_SEQ_GEN")
	private long id;
	
	@Column(name="GROUP_NAME")
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "group")
	private List<User> users = new ArrayList<>();
	
	public Group() {	}
	
	public Group(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public void addUsers(User user) {
		users.add(user);
		user.setGroup(this);
	}
}
