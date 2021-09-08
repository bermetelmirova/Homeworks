package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int number;

    public static void main(String[] args) {
        System.out.println("Введите переменную:");
        number = scanner.nextInt();
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        ThirdThread thirdThread = new ThirdThread();
        FourthThread fourthThread = new FourthThread();
        firstThread.setName("1");
        secondThread.setName("2");
        thirdThread.setName("3");
        fourthThread.setName("4");
        firstThread.start();
        secondThread.start();
        thirdThread.start();
        fourthThread.start();
    }
}
