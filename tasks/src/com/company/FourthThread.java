package com.company;

import static com.company.Main.number;

public class FourthThread extends Thread{

    @Override
    public void run() {
        number -= 2;
        System.out.println(getName() + ". "+ number );
    }
}
