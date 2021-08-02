package com.company.Model;


public class Country {
    private int id_country;
    private String name_country;
    private int population;
    private String prezident;
    private String state_language;

    public void setState_language(String state_language) {
        this.state_language = state_language;
    }

    public String getState_language() {
        return state_language;
    }

    public Country() {
    }

    public Country(int id_country, String name_country, int population, String prezident) {
        this.id_country = id_country;
        this.name_country = name_country;
        this.population = population;
        this.prezident = prezident;
    }

    public int getId_country() {
        return id_country;
    }

    public void setId_country(int id_country) {
        this.id_country = id_country;
    }

    public String getName_country() {
        return name_country;
    }

    public void setName_country(String name_country) {
        this.name_country = name_country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPrezident() {
        return prezident;
    }

    public void setPrezident(String prezident) {
        this.prezident = prezident;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id_country=" + id_country +
                ", name_country='" + name_country + '\'' +
                ", population=" + population +
                ", prezident='" + prezident + '\'' +
                '}';
    }
}
