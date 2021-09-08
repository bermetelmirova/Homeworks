package com.company;

public class SecondThread extends Thread{
    private int number;

    public SecondThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        number /= 2.0;
        System.out.println(getName() + ". "+ number );
    }
}
