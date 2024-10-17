package com.example.ROPULVA.Service;


import org.springframework.stereotype.Service;

import com.example.ROPULVA.Model.DTO.GoogleCalendarSendDTO;
import com.example.ROPULVA.Model.DTO.GoogleCalendarRespoDTO;
import com.example.ROPULVA.Model.DTO.GoogleCalendarServiceUpdateDTO;

@Service
public interface GoogleCalendarService {
	
	GoogleCalendarRespoDTO  GetEventById(  Long id);
	
	GoogleCalendarSendDTO  CreateEvent (GoogleCalendarSendDTO entity);
	
	
	  String DeleteEvent(Long id);
	
	
	  GoogleCalendarServiceUpdateDTO UpdateEvent(GoogleCalendarServiceUpdateDTO entity);
	

}
