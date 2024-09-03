package com.samuelperez.soccerfieldmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuelperez.soccerfieldmanager.models.User;

public interface AuthRepository extends JpaRepository<User, String> {

    
} 
    

