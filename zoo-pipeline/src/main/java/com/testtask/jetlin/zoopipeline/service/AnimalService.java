package com.testtask.jetlin.zoopipeline.service;

import com.testtask.jetlin.zoopipeline.model.Animal;

import java.util.List;


public interface AnimalService {

    List<Animal> getAllAnimals();

    Animal getById(Long animalId);

}
