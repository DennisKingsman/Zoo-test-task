package com.testtask.jetlin.zoopipeline.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.testtask.jetlin.zoopipeline.enums.AnimalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_Id")
    private long animalId;

    @Column(name = "name")
    private String name;

    @Column(name = "animal_Type")
    @Enumerated(EnumType.STRING)
    private AnimalType animalType;

    @Column(name = "is_Predator")
    private Boolean isPredator;

//    @JsonIgnore
//    @OneToMany(mappedBy = "animal", fetch = FetchType.LAZY)
//    private List<FoodRate> foodRates;

}
