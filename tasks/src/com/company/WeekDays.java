package com.company;

import com.company.DayOfWeek;

import java.util.Objects;

public class WeekDays {
    private DayOfWeek dayOfWeek;

    public WeekDays() {
    }

    public WeekDays(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeekDays weekDays = (WeekDays) o;
        return dayOfWeek == weekDays.dayOfWeek;
//        коллизия
//        return  false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayOfWeek);
//        коллизия
//        return 1;
    }

    @Override
    public String toString() {
        return dayOfWeek + "";
    }
}
