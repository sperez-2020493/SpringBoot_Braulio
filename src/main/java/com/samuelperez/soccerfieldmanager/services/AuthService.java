package com.samuelperez.soccerfieldmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuelperez.soccerfieldmanager.models.User;
import com.samuelperez.soccerfieldmanager.repository.AuthRepository;

@Service
public class AuthService implements IAuthService {
    @Autowired
    private AuthRepository authRepository;

    @Override
    public User save(User user){
        return authRepository.save(user);
    }

}
