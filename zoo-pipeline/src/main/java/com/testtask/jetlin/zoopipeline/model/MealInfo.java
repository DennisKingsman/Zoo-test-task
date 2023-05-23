package com.testtask.jetlin.zoopipeline.model;

import com.testtask.jetlin.zoopipeline.enums.Unit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MealInfo {

    private String animal;

    private String foodStuff;

    private Integer quantityPerWeek;

    private Integer foodstuffLack;

    private Unit unit;

}
