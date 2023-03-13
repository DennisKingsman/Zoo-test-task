package com.testtask.jetlin.zoopipeline.service;

import com.testtask.jetlin.zoopipeline.model.Foodstuff;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FoodstuffService {
    List<Foodstuff> getAll();

    Foodstuff getById(Long id);

}
