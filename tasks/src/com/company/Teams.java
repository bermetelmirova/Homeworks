package com.company;

import java.util.Random;

public class Teams extends Thread {
    private  String teamName;
    private volatile int ballCount;
    private volatile int yellowCards;
    private volatile int offsideCount;

    public Teams() {
    }

    public Teams(String teamName) {
        this.teamName = teamName;
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public int getOffsideCount() {
        return offsideCount;
    }

    public String getTeamName() {
        return teamName;
    }


    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public void run() {
        Random random = new Random();
        this.ballCount = random.nextInt(16);
        this.yellowCards = random.nextInt(16);
        this.offsideCount = random.nextInt(16);
    }
}
