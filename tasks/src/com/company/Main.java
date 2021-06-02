package com.company;

public class Main {

    public static void main(String[] args) {
        Runnable [] runnables = {new Human(), new Cat()};
        Swimable [] swimables = {new Shark(), new Ship(), new Duck(), new Whale()};
        Flyable [] flyables = {new Parrot(), new Plane()};
        for (int i = 0; i < runnables.length; i++) {
            runnables[i].run();
        }
        for (int i = 0; i < swimables.length; i++) {
            swimables[i].swim();
        }
        for (int i = 0; i < flyables.length; i++) {
            flyables[i].fly();
        }
    }
}
