package com.ziola.shelter_rest_app.animals.service.impl.service;

import com.ziola.shelter_rest_app.animals.domain.Animal;
import com.ziola.shelter_rest_app.animals.repository.AnimalRepository;
import com.ziola.shelter_rest_app.animals.service.SaveAnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveAnimalServiceImpl implements SaveAnimalService {

    private final AnimalRepository animalRepository;

    @Override
    public void saveAnimal(Animal animalToBeSaved) {
        animalRepository.save(animalToBeSaved);
    }
}
