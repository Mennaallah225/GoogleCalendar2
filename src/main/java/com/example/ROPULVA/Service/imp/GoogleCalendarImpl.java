package com.example.ROPULVA.Service.imp;

import java.util.Optional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.ROPULVA.Component.EventValidatorComponent;
import com.example.ROPULVA.Model.DTO.GoogleCalendarRespoDTO;
import com.example.ROPULVA.Model.DTO.GoogleCalendarSendDTO;
import com.example.ROPULVA.Model.DTO.GoogleCalendarServiceUpdateDTO;
import com.example.ROPULVA.Model.Entity.GoogleCalendarEntity;
import com.example.ROPULVA.Model.Mapper.GoogleCalendarMapper;
import com.example.ROPULVA.Repository.GoogleCalendarRepo;
import com.example.ROPULVA.Service.GoogleCalendarService;

import jakarta.persistence.Entity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j 
public class GoogleCalendarImpl implements GoogleCalendarService {

    private final GoogleCalendarRepo repo;
    private final GoogleCalendarMapper map;
    
    private final EventValidatorComponent component;

    @Override
    @Cacheable(value = "events", key = "#id") 
    public GoogleCalendarRespoDTO GetEventById(Long id) {
    	component.logEventAction("GET", id);
        
        GoogleCalendarEntity get = this.repo.getById(id);
        GoogleCalendarRespoDTO getall = this.map.dto(get);
       
        return getall;
    }

    @Override
    public GoogleCalendarSendDTO CreateEvent(GoogleCalendarSendDTO entity) {
    	component.validateEventData(entity.getTitle(), entity.getDescription());
        GoogleCalendarEntity send = this.map.toEntitysend(entity);
        GoogleCalendarEntity savedEntity = this.repo.save(send);
        GoogleCalendarSendDTO savedDTO = this.map.Send(savedEntity);
        return savedDTO;
    }

    @Override
    @CacheEvict(value = "events", key = "#id")
    public String DeleteEvent(Long id) {
    	component.logEventAction("DELETE", id);
        Optional<GoogleCalendarEntity> taskToDelete = this.repo.findById(id);

        if (taskToDelete.isPresent()) {
            this.repo.deleteById(id);
            return "Done this task Deleted";
        } else {
            return "Refused";
        }
    }

    @Override
    @CachePut(value = "events", key = "#entity.id") 
    public GoogleCalendarServiceUpdateDTO UpdateEvent(GoogleCalendarServiceUpdateDTO entity) {
    	component.validateEventData(entity.getTitle(), entity.getDescription());
        GoogleCalendarEntity update = this.map.toEntityupdate(entity);
        GoogleCalendarEntity updatedEntity = this.repo.save(update);
        GoogleCalendarServiceUpdateDTO updatedDTO = this.map.update(updatedEntity);
        return updatedDTO;
    }
}
