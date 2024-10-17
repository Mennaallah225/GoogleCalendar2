package com.example.ROPULVA.Service;

import org.springframework.stereotype.Service;
import com.example.ROPULVA.Model.DTO.responsUserDTO;

@Service
public interface UserService {
      

responsUserDTO findAll(long id);

}
