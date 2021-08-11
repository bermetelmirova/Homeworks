package com.company;

public class Car {
    private int idCar;
    private int year;
    private String model;
    private String color;

    public Car() {
    }

    public Car(int idCar, int year, String model, String color) {
        this.idCar = idCar;
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "year: " + year + "\nmodel: " + model + "\ncolor: " + color + "\n";
    }
}
