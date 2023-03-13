package com.testtask.jetlin.zoopipeline.rest.impl;

import com.testtask.jetlin.zoopipeline.model.Animal;
import com.testtask.jetlin.zoopipeline.model.FoodRate;
import com.testtask.jetlin.zoopipeline.model.MealInfo;
import com.testtask.jetlin.zoopipeline.rest.AnimalInfoController;
import com.testtask.jetlin.zoopipeline.service.AnimalService;
import com.testtask.jetlin.zoopipeline.service.FoodRateService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Level;

@Log
@RestController
@RequestMapping("/animal")
@AllArgsConstructor
public class AnimalInfoControllerImpl implements AnimalInfoController {

    private AnimalService animalService;

    private FoodRateService foodRateService;

    @GetMapping(path = "/getAll")
    public List<Animal> getAllAnimal() {
        return animalService.getAllAnimals();
    }

    @GetMapping(path = "/{animalId}")
    public Animal getAnimalById(@PathVariable Long animalId) {
        return animalService.getById(animalId);
    }

    @GetMapping(path = "/foodRates")
    public List<MealInfo> getFoodRates() {
        return foodRateService.getFoodRates();
    }

}
