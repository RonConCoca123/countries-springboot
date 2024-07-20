package com.daniel.countrys.resttemplate.springboot_countries.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

import com.daniel.countrys.resttemplate.springboot_countries.ExceptionHandler.CountryNotFoundException;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    //Error para validar los productos no encontrados
    @ExceptionHandler(CountryNotFoundException.class)
    public ResponseEntity<String> handleCountryNotFoundException(CountryNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<String> handleCountryErrorException(HttpClientErrorException ex){
        String error = "Country not found!";
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
    
}
