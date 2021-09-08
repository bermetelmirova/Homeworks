package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int number = scanner.nextInt();

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread(number);
        SecondThread secondThread = new SecondThread(number);
        ThirdThread thirdThread = new ThirdThread(number);
        FourthThread fourthThread = new FourthThread(number);
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
