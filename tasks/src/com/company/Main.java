package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Region [] regions = new Region[2];
        regions[0] = new Region("Токтогул", 23000, "Макеев", 230.6);
        regions[1] = new Region("Каракол", 16000, "Сатаров", 230.6);
        AbstractPopulatedPlace[] populatedPlace = new AbstractPopulatedPlace[5];
        populatedPlace[0] = new City("Бишкек", 1000000, "Эмильбекова", 230.6, regions);
        populatedPlace[1] = new City("Ош", 1000000, "Элмирова", 230.6, regions);
        populatedPlace[2] = new City("Жалал-Абад", 1000000, "Эмиров", 230.6, regions);
        populatedPlace[3]=new Village("Каракул", 1000000, "Назаров", 230.6);
        populatedPlace[4]=new Village("Село", 1000000, "Асанов", 230.6);
        System.out.println("Введите Фамилию руководителя : ");
        String manager = scanner.nextLine();
        System.out.println(searchManager(manager, populatedPlace));
    }

    public static String searchManager(String manager, AbstractPopulatedPlace[] places) {
        for (int i = 0; i < places.length; i++) {
            if (places[i].getManager().equals(manager) ) {

                return places[i].getName();
            }
        }
        return "Нет города с этим руководителем!";
    }
}
