package com.company;

import java.util.Scanner;

public enum User {
    Manager(1),
    Waiter(2),
    Client(3);
    private int code;

    User(int code) {
        this.code = code;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Manager\n2.Waiter\n3.Client\nChoose your role: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Welcome " + User.Manager);
                break;
            case 2:
                System.out.println("Welcome " + User.Waiter);
                break;
            case 3:
                System.out.println("Welcome " + User.Client);
                break;
        }
    }
}
