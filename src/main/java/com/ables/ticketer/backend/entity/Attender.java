package com.ables.ticketer.backend.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;





@Entity
public  class Attender extends ParentEntity{

	private String firstName;
	private String lastName;
	@Email
	private String email;
	@NotBlank
	private String phone;

	@ManyToMany(mappedBy = "attender")
	private List<Event> myEvent;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
	public String toString() {
		return "[" + getFirstName() + " " +getLastName()+" " +getEmail()+" "+getPhone()+"]";
	}
}
