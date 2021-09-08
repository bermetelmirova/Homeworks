package com.company;

public class FirstThread extends Thread{
    private int number;

    public FirstThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        number *= 2;
        System.out.println(getName() + ". "+ number );
    }
}
