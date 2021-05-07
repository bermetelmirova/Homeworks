package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("1. Task A\n2. Task B\nВведите номер:");
        int choice = sc.nextInt();
        if (choice == 1)
            taskA();
        else
            taskB();
    }

    static void taskA() {
        Course java = new Course("JV", "18/03/21", 21, "Nursultan Taalaibekov");
        Student[] students = new Student[2];
        students[0] = new Student("30.12.01", "Elmirova", "Bermet", "Female", 19);
        students[1] = new Student("22.12.00", "Ulan u", "Nurdin", "Male", 20);
        Group group = new Group(students, java, "18/03/21", 9);
        Lesson lesson = new Lesson("07/05/21", students, java, "19:00", true, false);
        System.out.println(java);
        for (Student temp : students) {
            System.out.println(temp);
        }
        System.out.println(group);
        System.out.println(lesson);
    }

    static void taskB() {
        Bread bread = new Bread(0.5, 25, "RIXA");
        System.out.println("Хлеб:");
        bread.bake();
        bread.pack();
        Lepeshka lepeshka = new Lepeshka(12, 25, "JK", 5);
        System.out.println("Лепешка:");
        lepeshka.drawPrints();
        lepeshka.varnish();
        Lavash firmLavash = new Lavash(12, 20, "KL", "Дилижана");
        System.out.println("Лаваш:");
        firmLavash.bake();
        firmLavash.wrap();
        Baget firmBaget = new Baget(12, 50, "JKL", 16, 3, "Провансльский");
        System.out.println("Багет:");
        firmBaget.cut();
    }
}
