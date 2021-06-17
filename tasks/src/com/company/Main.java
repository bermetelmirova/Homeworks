package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> catArrayList = new ArrayList<>(1000000);
        LinkedList<Cat> catLinkedList = new LinkedList<>();
        String name = "Cat";
        int age = 1;
        for (int i = 0; i < 1000000; i++) {
            catArrayList.add(new Cat(name + i, age + i));
            catLinkedList.add(new Cat(name + i, age + i));
        }
        int index = 499999;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catArrayList.add(index, new Cat(name + i, age + i));
        }
        long end = System.currentTimeMillis();
        System.out.println("Время добавления в середину ArrayList: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catLinkedList.add(index, new Cat(name + i, age + i));
        }
        end = System.currentTimeMillis();

        System.out.println("Время добавления в середину LinkedList: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catArrayList.add(0, new Cat(name + i, age + i));
        }
        end = System.currentTimeMillis();
        System.out.println("Время добавления в начало ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catArrayList.add(new Cat(name + i, age + i));
        }
        end = System.currentTimeMillis();

        System.out.println("Время добавления в конец ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catLinkedList.add(0, new Cat(name + i, age + i));
        }
        end = System.currentTimeMillis();
        System.out.println("Время добавления в начало LinkedList: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catLinkedList.add(new Cat(name + i, age + i));
        }
        end = System.currentTimeMillis();
        System.out.println("Время добавления в конец LinkedList: " + (end - start));

        start = System.currentTimeMillis();
            catArrayList.get(catArrayList.size() / 2);
        end = System.currentTimeMillis();
        System.out.println("Время считвания с середины ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        catLinkedList.get(catArrayList.size() / 2);
        end = System.currentTimeMillis();
        System.out.println("Время считвания с середины LinkedList: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = catArrayList.size()-1; i >= 0; i--) {
            catArrayList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Время считвания с конца ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = catLinkedList.size()-1; i >= 0; i--) {
            catLinkedList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Время считвания с конца LinkedList: " + (end - start));

        start = System.currentTimeMillis();
        catArrayList.remove(catArrayList.size() / 2);
        end = System.currentTimeMillis();
        System.out.println("Время удаления с середины ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        catArrayList.remove(catArrayList.size() - 1);
        end = System.currentTimeMillis();
        System.out.println("Время удаления с конца ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        catLinkedList.remove(catLinkedList.size() / 2);
        end = System.currentTimeMillis();
        System.out.println("Время удаления с середины LinkedList: " + (end - start));

        start = System.currentTimeMillis();
        catLinkedList.remove(catLinkedList.size() - 1);
        end = System.currentTimeMillis();
        System.out.println("Время удаления с конца LinkedList: " + (end - start));

    }
}
