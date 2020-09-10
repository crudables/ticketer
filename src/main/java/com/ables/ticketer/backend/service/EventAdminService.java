package com.ables.ticketer.backend.service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ables.ticketer.backend.entity.EventAdmin;
import com.ables.ticketer.backend.repository.EventAdminRepository;

public class EventAdminService {
	private static final Logger LOGGER = Logger.getLogger(EventAdminService.class.getName());
	private EventAdminRepository adminRepo;
	
	protected EventAdminService() {}
	public EventAdminService(EventAdminRepository repo) {
		adminRepo = repo;
	}
	
	public void saveAdmin(EventAdmin admin) {
		if(admin == null) {
			LOGGER.log(Level.SEVERE, "admin is null");
			return;
		}
		adminRepo.save(admin);
	}
	
	public void delete(EventAdmin admin) {
		if(admin == null) {
			LOGGER.log(Level.SEVERE, "admin is null");
			return; }
		adminRepo.delete(admin);
	}
	
	public Long count() {
		return adminRepo.count();
	}
	
	public Optional<EventAdmin> findById(Long id){
		return adminRepo.findById(id);
	}
	
	public List<EventAdmin> findAll(){
		return adminRepo.findAll();
	}
}
