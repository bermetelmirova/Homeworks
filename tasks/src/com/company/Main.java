package com.company;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        Set<Dog> dalmatians = new HashSet<>();
        String name = "Далматинец";
        for (int i = 0; i < 40; i++) {
            dalmatians.add(new Dog(name + " #" + (i + 1), random.nextInt(10) + 1));
        }
        System.out.println(dalmatians);
        System.out.println(dalmatians.size());
    }
}
