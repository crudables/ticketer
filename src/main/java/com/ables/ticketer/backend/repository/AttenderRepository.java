package com.ables.ticketer.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ables.ticketer.backend.entity.Attender;

public interface AttenderRepository extends JpaRepository<Attender, Long>{

}
