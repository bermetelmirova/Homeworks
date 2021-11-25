package com.company;

public class RoadStrategy implements RouteStrategy{

    @Override
    public void buildRoute() {
        System.out.println("Drive the car!");
    }
}
