package com.daniel.countrys.resttemplate.springboot_countries.dto;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountrysDTO {

    private NameDTO name;
    private Map<String,String> flags;
    private List<String> tld;
    private boolean independent;
    private Map<String,Map<String,String>> currencies;
    private List<String> capital;
    private String region;
    private String subregion;
    private Map<String, String> languages;
    private List<String> borders;
    private List<String> continents;
    private int population;
}
