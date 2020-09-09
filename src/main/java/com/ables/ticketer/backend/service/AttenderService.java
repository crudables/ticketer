package com.ables.ticketer.backend.service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.ables.ticketer.backend.entity.Attender;
import com.ables.ticketer.backend.repository.AttenderRepository;

@Service
public class AttenderService {
	private static final Logger LOGGER = Logger.getLogger(AttenderService.class.getName());
	private AttenderRepository attndRepo;

	protected AttenderService() {}

	public AttenderService(AttenderRepository repo) {
		attndRepo = repo;
	}

	public void saveAttender(Attender attender) {
		if(attender == null) {
			LOGGER.log(Level.SEVERE, "Attender is null");
			return;
	}
	
		attndRepo.save(attender);
}
	
	public void delete(Attender attender) {
		if(attender == null) {
			LOGGER.log(Level.SEVERE, "Attender is null");
			return;
		}
		attndRepo.delete(attender);
	}
	
	public Long count() {
		return attndRepo.count();
	}
	
	public List<Attender> findAll(){
		return attndRepo.findAll();
	}
	
	public Optional<Attender> findById(Long id){
		return attndRepo.findById(id);
	}
}
