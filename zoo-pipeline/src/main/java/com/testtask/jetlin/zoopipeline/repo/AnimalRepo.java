package com.testtask.jetlin.zoopipeline.repo;

import com.testtask.jetlin.zoopipeline.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepo extends JpaRepository<Animal, Long> {
}
