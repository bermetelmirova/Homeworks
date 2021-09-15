package com.company;

public class Main {

    public static void main(String[] args) {
        Generic <Integer, String> generic = new Generic<>(666, "LOL");
        System.out.println(generic);
        System.out.println(generic.first());
        System.out.println(generic.second());
        System.out.println(generic.check());
    }
}