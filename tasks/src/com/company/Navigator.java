package com.company;

public class Navigator {
    private RouteStrategy routeStrategy;
    public Navigator() {
    }

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void buildRoute(){
        routeStrategy.buildRoute();
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public RouteStrategy getRouteStrategy() {
        return routeStrategy;
    }
}
