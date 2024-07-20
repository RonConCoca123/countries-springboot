package com.daniel.countrys.resttemplate.springboot_countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringbootCountriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCountriesApplication.class, args);
	}

}
