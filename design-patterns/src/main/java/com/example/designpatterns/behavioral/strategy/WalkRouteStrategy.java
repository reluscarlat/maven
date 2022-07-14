package com.example.designpatterns.behavioral.strategy;

public class WalkRouteStrategy implements RouteStrategy{
    @Override
    public void buildRouteBetweenAandB(String coordinatesOfA, String coodrinatesOfB) {
        System.out.println("Calculating the walk route between " + coordinatesOfA + " and " + coodrinatesOfB);
    }
}
