package com.testtask.jetlin.zoopipeline.rest;

import com.testtask.jetlin.zoopipeline.model.Animal;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface AnimalInfoController {

    List<Animal> getAllAnimal();

    Animal getAnimalById(@PathVariable Long animalId);

}
