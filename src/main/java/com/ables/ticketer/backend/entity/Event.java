package com.ables.ticketer.backend.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Event extends ParentEntity{
	
	@NotBlank
	private String name;
	private String description;
	@NotBlank
	private String venue;
	private LocalDateTime date;
	
	@ManyToOne
	@JoinColumn(name ="admin_ID")
	private EventAdmin admin;
	
	@ManyToMany
	List<Attender> attender;

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
