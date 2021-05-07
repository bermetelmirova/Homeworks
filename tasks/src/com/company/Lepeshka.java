package com.company;

public class Lepeshka extends Bread{
    private double radius;
    public void drawPrints(){
        System.out.println("Prints are drown!");
    }
    public void varnish(){
        System.out.println("Bread is varnish!");
    }

    public Lepeshka() {

    }

    @Override
    public String toString() {
        return "Lepeshka{" +
                "radius=" + radius +
                '}'+ super.toString();
    }

    public Lepeshka(double weight, double price, String producerCompany, double radius) {
        super(weight, price, producerCompany);
        if(weight<=0)
            System.err.println("Fake!");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
