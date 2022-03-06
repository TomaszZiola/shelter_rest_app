package com.ziola.shelter_rest_app.animals.repository;

import com.ziola.shelter_rest_app.animals.domain.AnimalsPlaces;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalPlacesRepository extends JpaRepository<AnimalsPlaces, Integer> {
}
