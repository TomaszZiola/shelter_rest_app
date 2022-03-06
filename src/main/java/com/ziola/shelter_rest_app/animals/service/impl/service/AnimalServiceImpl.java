package com.ziola.shelter_rest_app.animals.service.impl.service;

import com.ziola.shelter_rest_app.animals.domain.Animal;
import com.ziola.shelter_rest_app.animals.repository.AnimalRepository;
import com.ziola.shelter_rest_app.animals.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    @Override
    public void saveAnimal(Animal animalToBeSaved) {
        animalRepository.save(animalToBeSaved);
    }

    @Override
    public Animal findById(int id) {
        return animalRepository.findById(id).get();
    }

    @Override
    public void deleteAnimal(int id) {
        animalRepository.deleteById(id);
    }
}
