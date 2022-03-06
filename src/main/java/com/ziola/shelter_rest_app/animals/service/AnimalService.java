package com.ziola.shelter_rest_app.animals.service;

import com.ziola.shelter_rest_app.animals.domain.Animal;

public interface AnimalService {

    void saveAnimal(Animal animalToBeSaved);

    Animal findById(int id);

    void deleteAnimal(int id);
}
