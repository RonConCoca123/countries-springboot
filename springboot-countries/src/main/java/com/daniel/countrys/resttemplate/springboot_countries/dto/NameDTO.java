package com.daniel.countrys.resttemplate.springboot_countries.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NameDTO {

    private String common;
    private String official;
}
