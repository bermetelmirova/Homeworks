package com.company;

import com.company.Parent.Liquid;
import com.company.Parent.Testable;
import com.company.children.Juice;
import com.company.children.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        taskA();
        taskB();
    }

    public static void taskA() {
        List<Liquid> liquids = new ArrayList<>();
        List<Juice> juices = new ArrayList<>();
        liquids.add(new Liquid());
        juices.add(new Juice());
        flowLiquid(liquids);
        flowLiquid(juices);
    }

    public static void taskB() {
        Student student = new Student("Ivan");
        student.passTest();
        Testable testable = new Testable() {
            @Override
            public void passTest() {
                System.out.println("Petr" + " не сдал тест!");
            }
        };
        Testable testable1 = new Testable() {
            @Override
            public void passTest() {
                System.out.println("Sergey" + " сдал тест!");
            }
        };
        testable.passTest();
        testable1.passTest();
    }
    public static void flowLiquid(List<? extends Liquid> liquids) {
        for (Liquid liquid : liquids) {
            liquid.flow();
        }
    }
}
