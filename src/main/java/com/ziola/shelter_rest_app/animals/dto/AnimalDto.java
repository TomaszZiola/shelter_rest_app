package com.ziola.shelter_rest_app.animals.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class AnimalDto {

    @Size(min = 2, max = 20)
    private String name;

    @NotNull
    private int age;

    @NotNull
    private String specie;

    @NotNull
    @Size(min = 2, max = 150)
    private String description;

    @NotNull
    private String city;
}
