package com.testtask.jetlin.zoopipeline.model;

import com.testtask.jetlin.zoopipeline.enums.FoodstuffType;
import com.testtask.jetlin.zoopipeline.enums.Unit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foodstuff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long foodstuffId;

    @Column
    private String name;

    @Column
    private Integer currentQuantity;

    @Column
    private Unit unit;

    @Column
    private FoodstuffType foodstuffType;

    @OneToMany(mappedBy = "foodstuff", fetch = FetchType.LAZY)
    private List<FoodRate> foodRates;

}
