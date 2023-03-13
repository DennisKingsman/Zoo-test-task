package com.testtask.jetlin.zoopipeline.rest.impl;

import com.testtask.jetlin.zoopipeline.model.Animal;
import com.testtask.jetlin.zoopipeline.model.Foodstuff;
import com.testtask.jetlin.zoopipeline.rest.FoodstuffInfoController;
import com.testtask.jetlin.zoopipeline.service.FoodstuffService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Level;

@Log
@RestController
@RequestMapping("/foodstuff")
@AllArgsConstructor
public class FoodstuffInfoControllerImpl implements FoodstuffInfoController {

    private FoodstuffService foodstuffService;

    @GetMapping(path = "/getAll")
    public List<Foodstuff> getAllFoodstuff() {
        log.log(Level.SEVERE, "getAllFoodstuff");
        return foodstuffService.getAll();
    }

    @GetMapping(path = "/{foodstuffId}")
    public Foodstuff getById(@PathVariable Long foodstuffId) {
        return foodstuffService.getById(foodstuffId);
    }

}
