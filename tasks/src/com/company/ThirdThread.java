package com.company;

public class ThirdThread extends Thread{
    private int number;

    public ThirdThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        number += 2;
        System.out.println(getName() + ". "+ number );
    }
}
