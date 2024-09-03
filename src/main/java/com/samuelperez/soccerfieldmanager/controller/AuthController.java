package com.samuelperez.soccerfieldmanager.controller;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.multipart.MultipartFile;

import com.samuelperez.soccerfieldmanager.DTOs.UserRegisterDTO;
import com.samuelperez.soccerfieldmanager.services.AuthService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("soccerfield/v1/auth")
public class AuthController {
    
private final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    AuthService authService;

    @GetMapping("register")
    public ResponseEntity<?> register(
        @RequestPart("profilePicture") MultipartFile proFile,
        @Valid @ModelAttribute UserRegisterDTO userDto,
        BindingResult result){

            Map<String, Object> res = new Ha                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       shMap<>();

            if(result.hasErrors()){
                List<String> errors = result.getFieldError().stream()
                map(error -> error.getDefaulMessage())
                .collect(Collectors.toList());
                res.put("Errores", errors);
                return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
                
            try{
                logger.info("Enviando el archivo a cloudinary");
                Map<String, object> oploadResult = cloudinaryService.uploadImg

            }catch (IOException e)
                logger.error("Error al entrada de archivo");
                res.put("Mensaje", "Error la subir el archivo");
                res.put("Error", e.getMessage());
                return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);

            }Catch(CannotCreateTransactionException e){
                logger.error("Error al entrada de archivo");
                res.put("Mensaje", "Error la subir el archivo");
                res.put("Error", e.getMessage());
                return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVICE_UNAVAILABLE);
            }Catch(DataAccessException e){
                logger.error("Error al entrada de archivo");
                res.put("Mensaje", "Error la subir el archivo");
                res.put("Error", e.getMessage());
                return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVICE_UNAVAILABLE);
            }
    }
    }
   
}
