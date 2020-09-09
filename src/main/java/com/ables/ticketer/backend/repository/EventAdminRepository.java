package com.ables.ticketer.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ables.ticketer.backend.entity.EventAdmin;

public interface EventAdminRepository extends JpaRepository<EventAdmin, Long> {

}
