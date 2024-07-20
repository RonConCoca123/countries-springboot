package com.daniel.countrys.resttemplate.springboot_countries.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.daniel.countrys.resttemplate.springboot_countries.ExceptionHandler.CountryNotFoundException;
import com.daniel.countrys.resttemplate.springboot_countries.dto.CountrysDTO;

@Service
public class CountryServiceImpl {

    @Value("${spring.private.url.countries}")
    private String BaseUrl;

    @Autowired
    private RestTemplate restTemplate;

    public List<CountrysDTO> getCountryByName(String name) throws CountryNotFoundException{
         String url = UriComponentsBuilder.fromHttpUrl(BaseUrl + name).toUriString();
        CountrysDTO[] response = restTemplate.getForObject(url, CountrysDTO[].class);
        if(response != null && response.length > 0){
            return Arrays.asList(response);
        }else{
            throw new CountryNotFoundException(name);
        }
    }

}
