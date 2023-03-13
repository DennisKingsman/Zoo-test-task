package com.testtask.jetlin.zoopipeline.model;

import com.testtask.jetlin.zoopipeline.enums.FoodstuffType;
import com.testtask.jetlin.zoopipeline.enums.Unit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foodstuff implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foodstuff_Id")
    private long foodstuffId;

    @Column(name = "name")
    private String name;

    @Column(name = "current_Quantity")
    private Integer currentQuantity;

    @Column(name = "unit")
    @Enumerated(EnumType.STRING)
    private Unit unit;

    @Column(name = "foodstuff_Type")
    @Enumerated(EnumType.STRING)
    private FoodstuffType foodstuffType;

//    @OneToMany(mappedBy = "foodstuff", fetch = FetchType.LAZY)
//    private List<FoodRate> foodRates;

}
