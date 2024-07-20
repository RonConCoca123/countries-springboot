package com.daniel.countrys.resttemplate.springboot_countries.ExceptionHandler;

public class CountryNotFoundException extends RuntimeException {
     public CountryNotFoundException(String name){
        super("Product with name " + name + " not found.");
     }
}
