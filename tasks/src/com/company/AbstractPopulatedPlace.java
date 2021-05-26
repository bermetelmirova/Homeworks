package com.company;

public abstract class AbstractPopulatedPlace {
    private String name;
    private int population;
    private String manager;
    private double totalArea;

    public AbstractPopulatedPlace() {
    }

    public AbstractPopulatedPlace(String name, int population, String manager, double totalArea) {
        this.name = name;
        this.population = population;
        this.manager = manager;
        this.totalArea = totalArea;
    }


    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getManager() {
        return manager;
    }

    public double getTotalArea() {
        return totalArea;
    }
}
