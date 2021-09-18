package com.company.children;

import com.company.Parent.Testable;

public class Student implements Testable {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void passTest() {
        System.out.println( this.name + " сдал тест!");
    }
}
