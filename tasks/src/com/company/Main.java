package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Country> countries = new ArrayList<>();
        countries.addAll(setCountry());
        System.out.println(countries.size());
        HashSet<Country> countrySet = new HashSet<>();
        TreeSet<Country> countryTreeSet = new TreeSet<>();
        for (int i = 0; i < countries.size(); i++) {
            if(countries.get(i).getCodeOfCountry() % 2 == 0){
                countrySet.add(countries.get(i));
            }else{
                countryTreeSet.add(countries.get(i));
            }
        }
        System.out.println("ASC SET");
        iteratorASC(countrySet);
        System.out.println("ASC TREESET");
        iteratorASC(countryTreeSet);
        System.out.println("DESC");
        iteratorDesc(countryTreeSet);
    }


    static ArrayList<Country> setCountry(){
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country(1, "Kyrgyzstan"));
        countries.add(new Country(2, "Russia"));
        countries.add(new Country(3, "Uzbekistan"));
        countries.add(new Country(4, "China"));
        countries.add(new Country(5, "USA"));
        countries.add(new Country(6, "England"));
        countries.add(new Country(7, "Korea"));
        countries.add(new Country(8, "France"));
        countries.add(new Country(9, "Spain"));
        countries.add(new Country(10, "Germany"));
        return countries;
    }

    static void iteratorASC(Set<Country> countries){
        Iterator<Country> iterator = countries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    static void iteratorDesc(TreeSet<Country> countries){
        Iterator<Country> iterator = countries.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
