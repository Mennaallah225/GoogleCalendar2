package com.example.ROPULVA.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ROPULVA.Model.DTO.responsUserDTO;
import com.example.ROPULVA.Service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService service;
	
  @PostMapping("/users")
	public responsUserDTO findAll(long id) {
	  responsUserDTO users = this.service.findAll(id);
	return users;
  }


}
