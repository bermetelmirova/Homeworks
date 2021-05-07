package com.company;

public class Bread {
    private double weight;
    private double price;
    private String producerCompany;

    public Bread() {
    }

    public Bread(double weight, double price, String producerCompany) {
        this.weight = weight;
        this.price = price;
        this.producerCompany = producerCompany;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getProducerCompany() {
        return producerCompany;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProducerCompany(String producerCompany) {
        this.producerCompany = producerCompany;
    }

    public void bake() {
        System.out.println("Bread is ready!");
    }

    public void pack() {
        System.out.println("Bread is pack!");
    }
}