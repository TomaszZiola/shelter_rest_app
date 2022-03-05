package com.ziola.shelter_rest_app.animals.repository;

import com.ziola.shelter_rest_app.animals.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
