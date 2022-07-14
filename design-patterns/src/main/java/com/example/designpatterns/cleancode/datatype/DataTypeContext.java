package com.example.designpatterns.cleancode.datatype;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

public class DataTypeContext {

    private Car car;

    public Map<String, Object> getCarProperties() {
        Map<String, Object> carProperties = new HashMap<>();
        carProperties.put("brand", "BMW");
        carProperties.put("productionYear", 2022);
        return carProperties;
    }

    public void prepareCar() {
        this.car = new Car();
        Map<String, Object> carProperties = getCarProperties();
        car.setBrand((String)carProperties.get("brand"));
        car.setProductionYear((int)carProperties.get("productionYear"));

        System.out.println(car.toString());
    }
}

@AllArgsConstructor
@NoArgsConstructor
@ToString
class Car {

    @Setter
    @Getter
    private String brand;

    @Setter
    @Getter
    private int productionYear;
}