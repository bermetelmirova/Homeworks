package com.company;

public class FourthThread extends Thread{
    private int number;

    public FourthThread(int number) {
    }

    @Override
    public void run() {
        number = number - 2;
        System.out.println(getName() + ". "+ number );
    }
}
