package com.example.ROPULVA.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ROPULVA.Model.Entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long>{

  
}
