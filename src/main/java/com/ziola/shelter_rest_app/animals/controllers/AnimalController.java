package com.ziola.shelter_rest_app.animals.controllers;

import com.ziola.shelter_rest_app.animals.domain.Animal;
import com.ziola.shelter_rest_app.animals.domain.AnimalsPlaces;
import com.ziola.shelter_rest_app.animals.dto.AnimalDto;
import com.ziola.shelter_rest_app.animals.exceptions.EmptyAnimalDtoFieldException;
import com.ziola.shelter_rest_app.animals.repository.AnimalPlacesRepository;
import com.ziola.shelter_rest_app.animals.service.AnimalService;
import com.ziola.shelter_rest_app.animals.util.ConverterDtoAnimalEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class AnimalController {

    private final ConverterDtoAnimalEntity converterDtoAnimalEntity;
    private final AnimalService animalService;
    private final AnimalPlacesRepository animalPlacesRepository;

    String exceptionWarningMessage = "Fields cannot be empty!";

    @PostMapping("/addAnimal")
    public AnimalDto addNewAnimal(@Valid @RequestBody AnimalDto animalDto) {
        checkAnimalDto(animalDto);
        Animal animalToSave = converterDtoAnimalEntity.convertToEntity(animalDto);
        animalService.saveAnimal(animalToSave);
        return animalDto;
    }

//    @GetMapping("/addAnimal")
//    public AnimalsPlaces provideNumberOfFreePlaces() {
//        return animalPlacesRepository.getById(1);
//    }

    @GetMapping("animalDetail/{id}")
    public Animal showDetails(@PathVariable("id") Integer animalId) {
        return animalService.findById(animalId);
    }

    @DeleteMapping("animalRemove/{id}")
    public void deleteAnimal(@PathVariable("id") int animalId) {
        animalService.deleteAnimal(animalId);
    }

    private void checkAnimalDto(AnimalDto animalDto) {
        if (animalDto.getName().isBlank() || animalDto.getCity().isBlank()
                || animalDto.getDescription().isBlank() || animalDto.getSpecie().isBlank()) {
            throw new EmptyAnimalDtoFieldException(exceptionWarningMessage);
        }
    }
}
