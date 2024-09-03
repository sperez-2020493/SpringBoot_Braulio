package com.samuelperez.soccerfieldmanager.DTOs;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRegisterDTO implements Serializable{

    private String id;
    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Ingrese un correo valido")
    private String email;
    private String password;
    @NotBlank(message = "El ususario es obligatorio")
    private String username;
    private String name;
    private String surname;
}
