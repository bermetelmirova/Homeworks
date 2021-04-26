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
            if(i==0)
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
        for (int i = 0; i < amount; i++) {
            System.out.printf(" ФИО: %s\n Группа: %s\n Средний балл: %s\n Дата рождения: %s\n Адрес : %s\n\n",studentList[i].fullName,studentList[i].group, studentList[i].gpa, studentList[i].dateOfBirth,studentList[i].address);
        }

    }
}
