package com.example.ROPULVA.Controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ROPULVA.Model.DTO.GoogleCalendarRespoDTO;
import com.example.ROPULVA.Model.DTO.GoogleCalendarSendDTO;
import com.example.ROPULVA.Model.DTO.GoogleCalendarServiceUpdateDTO;
import com.example.ROPULVA.Model.Entity.GoogleCalendarEntity;
import com.example.ROPULVA.Model.Mapper.GoogleCalendarMapper;
import com.example.ROPULVA.Repository.GoogleCalendarRepo;
import com.example.ROPULVA.Service.GoogleCalendarService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GoogleCalendarController {
	private final GoogleCalendarService service;
	private final GoogleCalendarRepo repo;
	private final GoogleCalendarMapper map;

	
	
	@GetMapping("/events/{id}")
	public GoogleCalendarRespoDTO GetEventById(@PathVariable(name = "id") Long id) {
		return this.service.GetEventById(id);    
	        
	}
	
	@PostMapping("/events")
	
	
	public GoogleCalendarSendDTO CreateEvent( @RequestBody GoogleCalendarSendDTO entity) {
		return this.service.CreateEvent(entity);
		
		
	}
	
	@DeleteMapping("/events/{id}")
	public String DeleteEvent ( @PathVariable  Long id) {
		return this.service.DeleteEvent(id);}
	
	@PutMapping("/events")
	
	
	public GoogleCalendarServiceUpdateDTO UpdateEvent(@RequestBody GoogleCalendarServiceUpdateDTO entity) {
		return this.service.UpdateEvent(entity);
		
	}

	
	}






