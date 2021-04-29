package com.company;

public class Parrot {
    private String name;
    private int age;
    private String color;
    private String species;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0)
            System.err.println("Wrong age!!");
        else
            this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getSpecies() {
        return species;
    }
}
