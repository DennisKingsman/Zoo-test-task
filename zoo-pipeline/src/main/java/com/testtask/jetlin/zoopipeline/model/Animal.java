package com.testtask.jetlin.zoopipeline.model;

import com.testtask.jetlin.zoopipeline.enums.AnimalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long animalId;

    @Column
    private String name;

    @Column
    private AnimalType animalType;

    @Column
    private Boolean isPredator;

    @OneToMany(mappedBy = "animal", fetch = FetchType.LAZY)
    private List<FoodRate> foodRates;

}
