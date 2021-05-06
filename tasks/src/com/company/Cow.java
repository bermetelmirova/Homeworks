package com.company;

public class Cow {
    private double weight;
    private int age;
    private String gender;
    private String name;

    public Cow() {
    }

    public Cow(double weight, int age, String gender, String name) {
        this.weight = weight;
        if (age <= 0)
            System.err.println("Возраст отрицательный!!!");
        else
            this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age <= 0)
            System.err.println("Возраст отрицательный!!!");
        else
            this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
}
