package com.testtask.jetlin.zoopipeline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private Integer quantityPerDay;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "animalId")
    private Animal animal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "foodstuffId")
    private Foodstuff foodstuff;

}
