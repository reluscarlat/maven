package com.example.designpatterns.behavioral.strategy;

public class CarRouteStrategy implements RouteStrategy{
    @Override
    public void buildRouteBetweenAandB(String coordinatesOfA, String coodrinatesOfB) {
        System.out.println("Calculating the car route between " + coordinatesOfA + " and " + coodrinatesOfB);
    }
}
