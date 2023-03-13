package com.testtask.jetlin.zoopipeline.repo;

import com.testtask.jetlin.zoopipeline.model.Foodstuff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodstuffRepo extends JpaRepository<Foodstuff, Long> {
}
