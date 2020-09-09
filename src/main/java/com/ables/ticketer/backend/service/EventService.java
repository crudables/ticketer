package com.ables.ticketer.backend.service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.ables.ticketer.backend.entity.Event;
import com.ables.ticketer.backend.repository.EventRepository;

@Service
public class EventService {
	EventRepository eventRepo;
	private static final Logger LOGGER = Logger.getLogger(EventService.class.getName());
	
	public EventService() {}
	
	public EventService(EventRepository repo) {
		eventRepo = repo;
	}

	public void saveEvent(Event event) {
		if(event == null) {
			LOGGER.log(Level.SEVERE, "Event is null. Be sure your form is "
					+ "connected to the app");
			return;
		}
		eventRepo.save(event);
	}
	
	public List<Event> findAll(){
		return eventRepo.findAll();
	}
	
	public Optional<Event> findOne(Long id){
		return eventRepo.findById(id);
	}
	
	public void delete(Event event) {
		eventRepo.delete(event);
	}
}
