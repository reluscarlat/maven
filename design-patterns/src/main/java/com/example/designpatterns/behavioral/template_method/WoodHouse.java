package com.example.designpatterns.behavioral.template_method;

public class WoodHouse extends HouseTemplate{
    @Override
    protected void buildRoof() {
        System.out.println("Build wooden roof");
    }

    @Override
    protected void buildWindows() {
        System.out.println("Build wooden roof");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Build wooden walls");
    }

    @Override
    protected void buildFoundation() {
        System.out.println("Build wooden house foundation");
    }
}
