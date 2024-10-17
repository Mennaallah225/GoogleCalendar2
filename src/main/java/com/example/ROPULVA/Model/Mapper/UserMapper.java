package com.example.ROPULVA.Model.Mapper;

import org.mapstruct.Mapper;

import com.example.ROPULVA.Model.DTO.responsUserDTO;
import com.example.ROPULVA.Model.Entity.UserEntity;

@Mapper(componentModel = "spring")

public interface UserMapper {
   
	responsUserDTO resp(UserEntity entity);
	
	UserEntity entity (responsUserDTO resp);
}
