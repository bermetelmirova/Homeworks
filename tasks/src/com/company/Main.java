package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {
        taskA();
        taskB();
    }

    static void taskA() {
        ArrayList<String> song = new ArrayList<>();
        ArrayList<String> copySong = new ArrayList<>();
        song.add("Ветер с моря дул");
        song.add("Нагонял беду");
        song.add("И сказал ты мне");
        song.add("Больше не приду");
        song.addAll(song);
        for (int i = 0; i < song.size(); i++) {
            if (song.get(i).length() >= 15) {
                copySong.add(song.get(i));
            }
        }
        System.out.println(copySong);
        for (int i = 0; i < copySong.size(); i++) {
            copySong.remove("И сказал ты мне");
        }

        System.out.println(copySong);
        System.out.println(song);

    }

    static void taskB() {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbersOdd = new ArrayList<>();
        ArrayList<Integer> numbersEvening = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(100) + 1);
            if (numbers.get(i) % 2 == 0)
                numbersEvening.add(numbers.get(i));
            else
                numbersOdd.add(numbers.get(i));
        }
        System.out.println("Начальный массив \n" + numbers);
        System.out.println("Массив четных чисел \n" + numbersEvening);
        System.out.println("Массив нечетных чисел \n" + numbersOdd);
    }
}
