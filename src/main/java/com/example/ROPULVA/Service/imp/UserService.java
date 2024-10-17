package com.example.ROPULVA.Service.imp;

import org.springframework.stereotype.Service;
import com.example.ROPULVA.Model.DTO.responsUserDTO;
import com.example.ROPULVA.Model.Entity.UserEntity;
import com.example.ROPULVA.Model.Mapper.UserMapper;
import com.example.ROPULVA.Repository.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService implements com.example.ROPULVA.Service.UserService {
    private final UserRepo repo;
    private final UserMapper map;

	@Override
	public responsUserDTO findAll(long id) {
		UserEntity find = this.repo.getById(id);
		responsUserDTO findAll = this.map.resp(find);
		return findAll;
	}
    
    
}
