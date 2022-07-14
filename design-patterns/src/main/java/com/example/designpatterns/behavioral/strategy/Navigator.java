package com.example.designpatterns.behavioral.strategy;

public class Navigator {
    private RouteStrategy routeStrategy;

    private String coodrinatesOfA;
    private String coodinatesOfB;

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRoute(String coodrinatesOfA, String coodinatesOfB) {
        this.coodrinatesOfA = coodrinatesOfA;
        this.coodinatesOfB = coodinatesOfB;
    }

    public void buildRout() {
        routeStrategy.buildRouteBetweenAandB(coodrinatesOfA, coodinatesOfB);
    }
}
