package com.testtask.jetlin.zoopipeline.service.impl;

import com.testtask.jetlin.zoopipeline.model.FoodRate;
import com.testtask.jetlin.zoopipeline.model.MealInfo;
import com.testtask.jetlin.zoopipeline.repo.FoodRateRepo;
import com.testtask.jetlin.zoopipeline.service.FoodRateService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

@Log
@Service
@AllArgsConstructor
public class FoodRateServiceImpl implements FoodRateService {

    public static final Integer WEEK_DAYS = 7;

    private FoodRateRepo foodRateRepo;

    @Override
    public List<MealInfo> getFoodRates() {
        List<FoodRate> foodRates = foodRateRepo.findAll();
        List<MealInfo> mealInfos = new ArrayList<>();
        foodRates.forEach(x -> {
            MealInfo mealInfo = new MealInfo();
            mealInfo.setAnimal(x.getAnimal().getName());
            mealInfo.setFoodStuff(x.getFoodstuff().getName());
            int neededFoodstuff = x.getQuantityPerDay() * WEEK_DAYS;
            mealInfo.setQuantityPerWeek(neededFoodstuff);
            Integer currentQuantity = x.getFoodstuff().getCurrentQuantity();
            if (neededFoodstuff < currentQuantity) {
                mealInfo.setFoodstuffLack(null);
            } else mealInfo.setFoodstuffLack(neededFoodstuff - currentQuantity);
            mealInfo.setUnit(x.getFoodstuff().getUnit());
            mealInfos.add(mealInfo);
        });
        mealInfos.forEach(x -> log.log(Level.SEVERE, x.toString()));
        return mealInfos;
    }

}
