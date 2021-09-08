package com.company;

import static com.company.Main.number;

public class FirstThread extends Thread{

    @Override
    public void run() {
        number *= 2;
        System.out.println(getName() + ". "+ number );
    }
}
