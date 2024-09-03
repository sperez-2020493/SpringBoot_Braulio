package com.samuelperez.soccerfieldmanager.models;

import java.io.Serializable;

import com.samuelperez.soccerfieldmanager.DTOs.UserRegisterDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name = "user")
public class User implements Serializable{
    @Id
    @Column(name="id")
    private Long id;

    @Email(message="Debe ingresar un email valido")
    @Column(unique = true, name="email")
    private String email;

    @Column(unique = true)
    private String username;
    private String name;
    private String surname;
    private String password;
    private String urlProfilePhoto;

    public User(UserRegisterDTO userDTO, String img){
        this.email = userDTO.getEmail();
        this.username = username
        this.password
        this.name
        this.surname = 
        this.urlProfilePhoto = img;
    }
}
