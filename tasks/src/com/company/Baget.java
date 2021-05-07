package com.company;

public class Baget extends Bread{
    private double length;
    private int countOfCuts;
    private String name;


    public Baget() {
    }



    public Baget(double weight, double price, String producerCompany, double length, int countOfCuts, String name) {
        super(weight, price, producerCompany);
        this.length = length;
        this.countOfCuts = countOfCuts;
        this.name = name;
    }

    public void cut(){
        System.out.println("Bread is cut!");
    }
    @Override
    public void pack() {
        System.out.println("Only in eco package!");
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getCountOfCuts() {
        return countOfCuts;
    }

    public void setCountOfCuts(int countOfCuts) {
        this.countOfCuts = countOfCuts;
    }

    @Override
    public String toString() {
        return "Baget{" +
                "length=" + length +
                ", countOfCuts=" + countOfCuts +
                ", name='" + name + '\'' +
                '}';
    }
}
