package com.company;

import java.util.Random;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
        Cow[] cows = new Cow[5];
        Sheep[] sheep = new Sheep[3];
        Horse[] horse = new Horse[2];
        Cow[] cows2 = new Cow[1];
        Sheep[] sheep2 = new Sheep[1];
        Horse[] horse2 = new Horse[1];
        Farm[] farm = new Farm[2];
        String gender = "Ж.";
        String name = "";
        int age;
        double weight;
        for (int i = 0; i < cows.length; i++) {
            if (i % 2 == 0) gender = "М.";
            else gender = "Ж.";
            age = random.nextInt(20) +1;
            weight = random.nextInt(100) +1;
            if(i==0)name = "Буренка";
            else if(i==1) name= "Му му";
            else if(i==2) name= "Бублик";
            else if(i==3) name= "Чернуха";
            else if(i==4) name= "Мурка";
            cows[i] = new Cow(weight,age, gender, name);
        }
        for (int i = 0; i < sheep.length; i++) {
            if (i % 2 != 0) gender = "М.";
            else gender = "Ж.";
            age = random.nextInt(10) +1;
            weight = random.nextInt(30) +1;
            if(i==0)name = "Ян";
            else if(i==1) name= "Лютый";
            else if(i==2) name= "Сугроб";
            sheep[i] = new Sheep(weight,age, gender, name);
        }

        for (int i = 0; i < horse.length; i++) {
            if (i % 2 != 0) gender = "М.";
            else gender = "Ж.";
            age = random.nextInt(20) +1;
            weight = random.nextInt(100) +1;
            if(i==0)name = "Гром";
            else if(i==1) name= "Докси";
            horse[i] = new Horse(weight,age, gender, name);
        }
        cows2[0] = new Cow(86.3, 5, "М.", "Басси");
        sheep2[0] = new Sheep(89.3, 9, "М.", "Беатрис");
        horse2[0] = new Horse(90, 15, "Ж.", "Дасти");
        farm[0]=new Farm("ул.Суеркулова №34", cows, sheep,horse, "Акжигитов Олжас");
        farm[1]=new Farm("ул.Айтиева №34", cows2, sheep2,horse2, "Макеева Азиза");
        farm[0].print(cows.length, sheep.length,horse.length);
        farm[1].print(cows2.length, sheep2.length,horse2.length);
    }
}
