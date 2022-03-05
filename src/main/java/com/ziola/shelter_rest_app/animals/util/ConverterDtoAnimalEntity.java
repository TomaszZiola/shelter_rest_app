package com.ziola.shelter_rest_app.animals.util;

import com.ziola.shelter_rest_app.animals.domain.Animal;
import com.ziola.shelter_rest_app.animals.dto.AnimalDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConverterDtoAnimalEntity {

    private final ModelMapper modelMapper;

    public Animal convertToEntity(AnimalDto animalDto) {
        Animal animalEntity = modelMapper.map(animalDto, Animal.class);
        return animalEntity;
    }
}
