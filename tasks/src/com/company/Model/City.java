package com.company.Model;

public class City {
    private int id_city;
    private String name_city;
    private String mayor;
    private int country;
    private int population;

    public City() {
    }

    public City(int id_city, String name_city, String mayor, int country, int population) {
        this.id_city = id_city;
        this.name_city = name_city;
        this.mayor = mayor;
        this.country = country;
        this.population = population;
    }

    public int getId_city() {
        return id_city;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }

    public String getName_city() {
        return name_city;
    }

    public void setName_city(String name_city) {
        this.name_city = name_city;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
