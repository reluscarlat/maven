package com.example.designpatterns.behavioral.template_method;

public abstract class HouseTemplate {
    public void buildHouse(){
        buildFoundation();
        buildWalls();
        buildWindows();
        buildRoof();
    }

    protected abstract void buildRoof();

    protected abstract void buildWindows();

    protected abstract void buildWalls();

    protected abstract void buildFoundation();
}
