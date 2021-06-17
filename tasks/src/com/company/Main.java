package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        Month[] monthsArray = new Month[12];
        LinkedList<Month> monthLinkedList = new LinkedList<>();
        ArrayList<Month> monthArrayList = new ArrayList<>(12);
        int num;
        for (int i = 0; i < 12; i++) {
            num = random.nextInt(12) + 1;
            monthsArray[i] = setter(num);
            num = random.nextInt(12) + 1;
            monthArrayList.add(setter(num));
            num = random.nextInt(12) + 1;
            monthLinkedList.add(setter(num));
            System.out.print(monthsArray[i] + "  ");
        }
        System.out.println();
        System.out.println(monthArrayList);
        System.out.println(monthLinkedList);

        bubbleSort(monthsArray);
        bubbleSort(monthArrayList);
        bubbleSort(monthLinkedList);

        System.out.println();
        System.out.println("Sorted:");
        for (int i = 0; i < monthsArray.length; i++) {
            System.out.print(monthsArray[i] + "  ");
        }
        System.out.println();
        System.out.println(monthArrayList);
        System.out.println(monthLinkedList);
    }

    static Month setter(int num) {
        switch (num) {
            case 1:
                return Month.January;
            case 2:
                return Month.February;
            case 3:
                return Month.March;
            case 4:
                return Month.April;
            case 5:
                return Month.May;
            case 6:
                return Month.June;
            case 7:
                return Month.July;
            case 8:
                return Month.August;
            case 9:
                return Month.September;
            case 10:
                return Month.October;
            case 11:
                return Month.November;
            case 12:
                return Month.December;
        }
        return Month.January;
    }

    static void bubbleSort(Month[] monthsArr) {
        Month temp;
        boolean f = false;
        for (int i = 0; i < monthsArr.length; i++) {
            f = true;
            for (int j = 0; j < monthsArr.length - 1; j++) {
                if (monthsArr[j].getCode() > monthsArr[j + 1].getCode()) {
                    f = false;
                    temp = monthsArr[j];
                    monthsArr[j] = monthsArr[j + 1];
                    monthsArr[j + 1] = temp;
                }
            }
            if (f) break;
        }
    }

    static void bubbleSort(LinkedList<Month> monthsArr) {
        Month temp;
        boolean f = false;
        for (int i = 0; i < monthsArr.size() - 1; i++) {
            f = true;
            for (int j = 0; j < monthsArr.size() - 1; j++) {
                if (monthsArr.get(j).getCode() > monthsArr.get(j + 1).getCode()) {
                    f = false;
                    temp = monthsArr.get(j);
                    monthsArr.set(j, monthsArr.get(j + 1));
                    monthsArr.set(j + 1, temp);
                }
            }
            if (f) break;
        }
    }

    static void bubbleSort(ArrayList<Month> monthsArr) {
        Month temp;
        boolean f = false;
        for (int i = 0; i < monthsArr.size() - 1; i++) {
            f = true;
            for (int j = 0; j < monthsArr.size() - 1; j++) {
                if (monthsArr.get(j).getCode() > monthsArr.get(j + 1).getCode()) {
                    f = false;
                    temp = monthsArr.get(j);
                    monthsArr.set(j, monthsArr.get(j + 1));
                    monthsArr.set(j + 1, temp);
                }
            }
            if (f) break;
        }
    }
}
