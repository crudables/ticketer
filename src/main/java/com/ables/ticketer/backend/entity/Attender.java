package com.ables.ticketer.backend.entity;

import java.util.List;

import javax.persistence.OneToMany;





public class Attender extends Entity{

	private String firstName;
	private String lastName;
	private String email;
	private String phone;

	@OneToMany
	private List<Event> myEvent;
}
