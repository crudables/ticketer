package com.ables.ticketer.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ables.ticketer.backend.entity.Event;

public interface EvenRepository extends JpaRepository<Event, Long> {

}
