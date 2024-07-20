package com.daniel.countrys.resttemplate.springboot_countries.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.countrys.resttemplate.springboot_countries.ExceptionHandler.CountryNotFoundException;
import com.daniel.countrys.resttemplate.springboot_countries.dto.CountrysDTO;
import com.daniel.countrys.resttemplate.springboot_countries.services.CountryServiceImpl;

@RestController
@RequestMapping("/api/countries")
@CrossOrigin(origins = {"*"})
public class CountryController {

    @Autowired
    private CountryServiceImpl service;

    @GetMapping("/name/{name}")
    public ResponseEntity<List<CountrysDTO>> getCountryByName(@PathVariable String name) throws CountryNotFoundException {
        return new ResponseEntity<>(service.getCountryByName(name), HttpStatus.OK);
    }
}
