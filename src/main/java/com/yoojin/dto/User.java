package com.yoojin.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="USER_SEQ_GEN", sequenceName = "USER_SEQ", initialValue = 1, allocationSize = 1)
public class User {

	@Id
	@Column(name="USER_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="USER_SEQ_GEN")
	private long id;
	
	@Column(name="USER_NAME")
	private String name;
	
	@Column(name="USER_EMAIL")
	private String email;
	
	@ManyToOne
	@JoinColumn(name="GROUP_SEQ")
	private Group group;
	
	public User() {	}
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

}
