package com.company;

public class Ship implements Swimable{
    @Override
    public void swim() {
        System.out.println("Ship: I can swim");
    }
}
