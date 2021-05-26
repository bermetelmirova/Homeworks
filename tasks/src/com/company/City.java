package com.company;

public class City extends AbstractPopulatedPlace{

    private Region region[];

    public City() {

    }

    public City(String name, int population, String manager, double totalArea, Region[] region) {
        super(name, population, manager, totalArea);
        this.region = region;

    }

}
