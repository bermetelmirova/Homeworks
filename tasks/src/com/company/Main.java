package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        A();
        B();
    }

    public static void A(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        String str = "Strm";
        for (int i = 1; i <= 11; i++) {
            hashMap.put(i, str + i);
        }
        hashMap.entrySet().stream()
                .filter(x -> x.getKey() > 5)
                .forEach(System.out::println);
        hashMap.entrySet().stream()
                .filter(x -> x.getKey() % 3 == 0)
                .forEach(x -> System.out.printf("%s, ", x));

        System.out.println();

        Stream<Integer> stream = hashMap.entrySet()
                .stream()
                .filter(x -> x.getValue().length() > 5)
                .map(x -> x.getKey());

        Optional<Integer> reduced = stream.reduce((x, y) -> x * y);
        System.out.println(reduced);
    }
    public static void B(){
        Random random = new Random();
        List <Integer> integers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            integers.add(i, random.nextInt(100) +1);
        }
        integers.stream()
                .filter(y -> y % 2 == 0)
                .forEach(System.out::println);
        List <Integer> integers1 = integers.stream()
                .filter(y -> y % 2 != 0)
                .map(y -> y + 10)
                .collect(Collectors.toList());
    }
}
