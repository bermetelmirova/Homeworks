package com.company;

public class HardDrive {
    private int memoryCapacity;
    private int amountOfDrives;

    public HardDrive(int memoryCapacity, int amountOfDrives) {
        this.memoryCapacity = memoryCapacity;
        this.amountOfDrives = amountOfDrives;
    }

    public HardDrive() {
    }

    public double getMemoryCapacity() {
        return memoryCapacity;
    }

    public int getAmountOfDrives() {
        return amountOfDrives;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public void setAmountOfDrives(int amountOfDrives) {
        this.amountOfDrives = amountOfDrives;
    }
}
