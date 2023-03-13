package com.testtask.jetlin.zoopipeline.service.impl;

import com.testtask.jetlin.zoopipeline.model.Animal;
import com.testtask.jetlin.zoopipeline.repo.AnimalRepo;
import com.testtask.jetlin.zoopipeline.service.AnimalService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;

@Log
@AllArgsConstructor
@Service
public class AnimalServiceImpl implements AnimalService {

    private AnimalRepo animalRepo;

    @Override
    public List<Animal> getAllAnimals() {
        return animalRepo.findAll();
    }

    @Override
    public Animal getById(Long animalId) {
        Optional<Animal> animal = animalRepo.findById(animalId);
        Animal referenceById = new Animal();
        if (animal.isPresent()) {
            referenceById = animal.get();
        } else log.log(Level.SEVERE, "animal is not present");
        return referenceById;
    }

}
