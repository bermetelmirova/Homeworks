package com.company;

public class PublicTransportStrategy implements RouteStrategy{
    @Override
    public void buildRoute() {
        System.out.println("215th bus is coming!");
    }
}
