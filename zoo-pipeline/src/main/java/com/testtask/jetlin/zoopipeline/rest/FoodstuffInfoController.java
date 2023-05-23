package com.testtask.jetlin.zoopipeline.rest;

import com.testtask.jetlin.zoopipeline.model.Foodstuff;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface FoodstuffInfoController {

    List<Foodstuff> getAllFoodstuff();

    Foodstuff getById(@PathVariable Long foodstuffId);

}
