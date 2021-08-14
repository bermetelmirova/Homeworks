package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        Map<WeekDays, Integer> dayMap = new LinkedHashMap<>();
        WeekDays weekDays = null;
        for (int i = 0; i < 100; i++) {
            weekDays = new WeekDays(getDayOfWeek(random.nextInt(7) +1));
            if(dayMap.containsKey(weekDays)){
                dayMap.put(weekDays, dayMap.get(weekDays) + 1);
            }else {
                dayMap.put(weekDays, 1);
            }
        }
        System.out.println(dayMap);
    }

    static DayOfWeek getDayOfWeek(int n) {
        switch (n) {
            case 1:
                return DayOfWeek.MONDAY;
            case 2:
                return DayOfWeek.TUESDAY;
            case 3:
                return DayOfWeek.WEDNESDAY;
            case 4:
                return DayOfWeek.THURSDAY;
            case 5:
                return DayOfWeek.FRIDAY;
            case 6:
                return DayOfWeek.SATURDAY;
            case 7:
                return DayOfWeek.SUNDAY;
        }
        return null;
    }
}
