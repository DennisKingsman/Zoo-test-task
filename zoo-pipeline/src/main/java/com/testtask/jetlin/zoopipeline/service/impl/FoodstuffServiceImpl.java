package com.testtask.jetlin.zoopipeline.service.impl;

import com.testtask.jetlin.zoopipeline.model.Foodstuff;
import com.testtask.jetlin.zoopipeline.repo.FoodstuffRepo;
import com.testtask.jetlin.zoopipeline.service.FoodstuffService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;

@Log
@Service
@AllArgsConstructor
public class FoodstuffServiceImpl implements FoodstuffService {

    private FoodstuffRepo foodstuffRepo;

    @Override
    public List<Foodstuff> getAll() {
        return foodstuffRepo.findAll();
    }

    @Override
    public Foodstuff getById(Long id) {
        Optional<Foodstuff> foodstuff = foodstuffRepo.findById(id);
        Foodstuff foodstuffById = new Foodstuff();
        if (foodstuff.isPresent()) {
            foodstuffById = foodstuff.get();
        } else log.log(Level.SEVERE, "foodstuff is not present");
        return foodstuffById;
    }

}
