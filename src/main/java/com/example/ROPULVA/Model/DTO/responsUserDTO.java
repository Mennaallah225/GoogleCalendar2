package com.example.ROPULVA.Model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class responsUserDTO {
	
	private String username;
	private String password;
    private String role;

}
