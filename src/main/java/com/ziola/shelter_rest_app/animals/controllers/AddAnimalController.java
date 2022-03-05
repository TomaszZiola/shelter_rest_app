package com.ziola.shelter_rest_app.animals.controllers;

import com.ziola.shelter_rest_app.animals.domain.Animal;
import com.ziola.shelter_rest_app.animals.dto.AnimalDto;
import com.ziola.shelter_rest_app.animals.exceptions.EmptyAnimalDtoFieldException;
import com.ziola.shelter_rest_app.animals.service.SaveAnimalService;
import com.ziola.shelter_rest_app.animals.util.ConverterDtoAnimalEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class AddAnimalController {

    private final ConverterDtoAnimalEntity converterDtoAnimalEntity;
    private final SaveAnimalService saveAnimalService;

    String exceptionWarningMessage = "Fields cannot be empty!";

    @PostMapping("/addAnimal")
    public AnimalDto addNewAnimal(@Valid @RequestBody AnimalDto animalDto) {
        checkAnimalDto(animalDto);
        Animal animalToSave = converterDtoAnimalEntity.convertToEntity(animalDto);
        saveAnimalService.saveAnimal(animalToSave);
        return animalDto;
    }

    private void checkAnimalDto(AnimalDto animalDto) {
        if (animalDto.getName().isBlank() || animalDto.getCity().isBlank()
                || animalDto.getDescription().isBlank() || animalDto.getSpecie().isBlank()) {
            throw new EmptyAnimalDtoFieldException(exceptionWarningMessage);
        }
    }
}
