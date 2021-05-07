package com.company;

public class Lavash extends Bread{
    private String name;
    @Override
    public void bake(){
        System.out.println("I am lavash, i am ready!");
    }
    public void wrap(){
        System.out.println("Lavash is wrapped!");
    }


    public Lavash(double weight, double price, String producerCompany, String name) {
        super(weight, price, producerCompany);
        this.name = name;
    }
}
