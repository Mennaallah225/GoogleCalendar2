package com.example.ROPULVA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ROPULVA.Model.Entity.GoogleCalendarEntity;

public interface GoogleCalendarRepo extends  JpaRepository<GoogleCalendarEntity, Long> {

}
