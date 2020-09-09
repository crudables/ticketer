package com.ables.ticketer.backend.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class EventAdmin extends ParentEntity {
	@NotBlank
	private String username;
	@Email
	private String email;
	@NotBlank
	private String phone;
	private String password;
	
	@OneToMany(mappedBy = "admin")
	private List<Event> adminEvent;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "[" + getUsername()+" "+getEmail()+" "+getPhone()+"]";
	}
}
