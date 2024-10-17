package com.example.ROPULVA.Model.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.ROPULVA.Model.DTO.GoogleCalendarRespoDTO;
import com.example.ROPULVA.Model.DTO.GoogleCalendarSendDTO;
import com.example.ROPULVA.Model.DTO.GoogleCalendarServiceUpdateDTO;
import com.example.ROPULVA.Model.Entity.GoogleCalendarEntity;

@Mapper(componentModel = "spring")
public interface GoogleCalendarMapper {
GoogleCalendarEntity toEntity(GoogleCalendarRespoDTO dto);
GoogleCalendarRespoDTO dto (GoogleCalendarEntity toEntity);


List<GoogleCalendarEntity> listtoEntity(List<GoogleCalendarRespoDTO> dto);
List<GoogleCalendarRespoDTO> listdto (List<GoogleCalendarEntity> toEntity);


GoogleCalendarEntity toEntitysend (GoogleCalendarSendDTO Send);
GoogleCalendarSendDTO Send (GoogleCalendarEntity toEntity);

GoogleCalendarEntity toEntityupdate (GoogleCalendarServiceUpdateDTO Send);
GoogleCalendarServiceUpdateDTO update (GoogleCalendarEntity toEntity);

}
