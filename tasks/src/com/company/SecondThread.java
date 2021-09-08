package com.company;

import static com.company.Main.number;

public class SecondThread extends Thread{

    @Override
    public void run() {
        number /= 2.0;
        System.out.println(getName() + ". "+ number );
    }
}
