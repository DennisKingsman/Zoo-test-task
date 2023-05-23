package com.testtask.jetlin.zoopipeline.repo;

import com.testtask.jetlin.zoopipeline.model.FoodRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRateRepo extends JpaRepository<FoodRate, Long> {
}
