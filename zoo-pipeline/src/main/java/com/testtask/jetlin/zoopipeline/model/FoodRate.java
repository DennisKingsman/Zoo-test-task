package com.testtask.jetlin.zoopipeline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FOOD_RATE")
public class FoodRate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "quantity_Per_Day")
    private Integer quantityPerDay;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "animal_Id")
    private Animal animal;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "foodstuff_Id")
    private Foodstuff foodstuff;

}
