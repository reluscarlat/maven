package com.example.designpatterns.behavioral.strategy;

public class BikeRouteStrategy implements RouteStrategy{
    @Override
    public void buildRouteBetweenAandB(String coordinatesOfA, String coodrinatesOfB) {
        System.out.println("Calculating the bike route between " + coordinatesOfA + " and " + coodrinatesOfB);
    }
}
