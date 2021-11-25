package com.company;

public class WalkingStrategy implements RouteStrategy{
    @Override
    public void buildRoute() {
        System.out.println("walking down ahunbaev street");
    }
}
