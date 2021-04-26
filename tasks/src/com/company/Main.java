package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество студентов:");
        int amount = scanner.nextInt();
        Student[] studentList = new Student[amount];
        for (int i = 0; i < studentList.length; i++) {
            studentList[i] = new Student();
            System.out.print("Введите ФИО студента: ");
            if (i == 0)
                scanner.nextLine();
            studentList[i].fullName = scanner.nextLine();
            System.out.print("Введите группу студента: ");
            studentList[i].group = scanner.nextLine();
            System.out.print("Введите средний балл студента: ");
            studentList[i].gpa = scanner.nextLine();
            System.out.print("Введите дату рождения студента: ");
            studentList[i].dateOfBirth = scanner.nextLine();
            System.out.print("Введите адрес проживания студента: ");
            studentList[i].address = scanner.nextLine();
        }
        for (int i = 0; i < studentList.length; i++) {
            System.out.printf(" ФИО: %s\n Группа: %s\n Средний балл: %s\n Дата рождения: %s\n Адрес : %s\n\n", studentList[i].fullName, studentList[i].group, studentList[i].gpa, studentList[i].dateOfBirth, studentList[i].address);
        }
        System.out.println("Введите количество рас:");
        int amount2 = scanner.nextInt();
        IntergalacticRace[] raceList = new IntergalacticRace[amount2];
        for (int i = 0; i < raceList.length; i++) {
            raceList[i] = new IntergalacticRace();
            System.out.print("Введите название планеты: ");
            if (i == 0)
                scanner.nextLine();
            raceList[i].planet = scanner.nextLine();
            System.out.print("Введите код планеты: ");
            raceList[i].codeOfPlanet = scanner.nextInt();
            System.out.print("Есть ли воздух?: ");
            raceList[i].isAir = scanner.nextBoolean();
            System.out.print("Есть ли вода?: ");
            raceList[i].isWater = scanner.nextBoolean();
            System.out.print("Введите название расы планеты: ");
            scanner.nextLine();
            raceList[i].raceName = scanner.nextLine();
            System.out.print("Введите официальный язык планеты: ");
            raceList[i].officialLanguage = scanner.nextLine();
        }
        for (int i = 0; i < raceList.length; i++) {
            System.out.printf(" Планета: %s\n Есть воздух: %s\n Есть вода: %s\n Раса: %s\n Официальный язык : %s\n\n",  raceList[i].planet,  raceList[i].isAir,  raceList[i].isWater,  raceList[i].raceName,  raceList[i].officialLanguage);
        }
    }
}
