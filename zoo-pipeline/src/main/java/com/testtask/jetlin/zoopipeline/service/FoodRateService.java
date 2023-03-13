package com.testtask.jetlin.zoopipeline.service;

import com.testtask.jetlin.zoopipeline.model.FoodRate;
import com.testtask.jetlin.zoopipeline.model.MealInfo;

import java.util.List;

public interface FoodRateService {
    List<MealInfo> getFoodRates();

}
