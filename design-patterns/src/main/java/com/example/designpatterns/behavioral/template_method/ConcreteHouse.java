package com.example.designpatterns.behavioral.template_method;

public class ConcreteHouse extends HouseTemplate {
    @Override
    protected void buildRoof() {
        System.out.println("Build concrete roof");
    }

    @Override
    protected void buildWindows() {
        System.out.println("Build concrete roof");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Build concrete walls");
    }

    @Override
    protected void buildFoundation() {
        System.out.println("Build concrete house foundation");
    }
}
