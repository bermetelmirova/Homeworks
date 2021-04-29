package com.company;


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Parrot parrot1 = new Parrot();
        Parrot parrot2 = new Parrot();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Fish fish1 = new Fish();
        Fish fish2 = new Fish();

        parrot1.setName("Чип");
        parrot1.setColor("Белый");
        parrot1.setSpecies("Клоун");
        parrot1.setAge(2);

        parrot2.setName("Рикки");
        parrot2.setColor("Желтый");
        parrot2.setSpecies("чсв");
        parrot2.setAge(3);

        dog1.setName("Арчи");
        dog1.setColor("Коричневый");
        dog1.setSpecies("Лабрадор");
        dog1.setAge(5);

        dog2.setName("Рекс");
        dog2.setColor("Черный");
        dog2.setSpecies("Хаски");
        dog2.setAge(6);

        dog1.setName("Арчи");
        dog1.setColor("Коричневый");
        dog1.setSpecies("Лабрадор");
        dog1.setAge(5);

        dog1.setName("Арчи");
        dog1.setColor("Коричневый");
        dog1.setSpecies("Лабрадор");
        dog1.setAge(5);

        cat1.setName("Том");
        cat1.setColor("Коричневый");
        cat1.setSpecies("КОТ");
        cat1.setAge(12);

        cat2.setName("Каспер");
        cat2.setColor("Черный");
        cat2.setSpecies("Котяра");
        cat2.setAge(7);

        fish1.setName("Айба");
        fish1.setColor("Радужный");
        fish1.setSpecies("риба");
        fish1.setAge(1);

        fish2.setName("Тамара");
        fish2.setColor("Синий");
        fish2.setSpecies("РЫБА");
        fish2.setAge(3);

        System.out.printf("Попугаи:\nКличка: %s\nЦвет: %s\nВид: %s\nВзраст: %s\n\n", parrot1.getName(),parrot1.getColor(),parrot1.getSpecies(), parrot1.getAge() );
        System.out.printf("Кличка: %s\nЦвет: %s\nВид: %s\nВзраст: %s\n\n", parrot2.getName(),parrot2.getColor(),parrot2.getSpecies(), parrot2.getAge() );
        System.out.printf("Собаки:\nКличка: %s\nЦвет: %s\nВид: %s\nВзраст: %s\n\n", dog1.getName(),dog1.getColor(),dog1.getSpecies(), dog1.getAge() );
        System.out.printf("Кличка: %s\nЦвет: %s\nВид: %s\nВзраст: %s\n\n", dog2.getName(),dog2.getColor(),dog2.getSpecies(), dog2.getAge() );
        System.out.printf("Коты:\n Кличка: %s\nЦвет: %s\nВид: %s\nВзраст: %s\n\n", cat1.getName(),cat1.getColor(),cat1.getSpecies(), cat1.getAge() );
        System.out.printf("Кличка: %s\nЦвет: %s\nВид: %s\nВзраст: %s\n\n", cat2.getName(),cat2.getColor(),cat2.getSpecies(), cat2.getAge() );
        System.out.printf("Рыбы:\nКличка: %s\nЦвет: %s\nВид: %s\nВзраст: %s\n\n", fish1.getName(),fish1.getColor(),fish1.getSpecies(), fish1.getAge() );
        System.out.printf("Кличка: %s\nЦвет: %s\nВид: %s\nВзраст: %s\n\n", fish2.getName(),fish2.getColor(),fish2.getSpecies(), fish2.getAge() );
    }
}
