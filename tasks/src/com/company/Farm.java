package com.company;

public class Farm {
    private String address;
    private Cow[] herd;
    private Sheep[] flock;
    private Horse[] herdOfHorses;
    private String ownerFullName;

    public Farm() {
    }

    public Farm(String address, Cow[] herd, Sheep[] flock, Horse[] herdOfHorses, String ownerFullName) {
        this.address = address;
        this.herd = herd;
        this.flock = flock;
        this.herdOfHorses = herdOfHorses;
        this.ownerFullName = ownerFullName;
    }

    public String getAddress() {
        return address;
    }

    public Cow[] getHerd() {
        return herd;
    }

    public Sheep[] getFlock() {
        return flock;
    }

    public Horse[] getHerdOfHorses() {
        return herdOfHorses;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHerd(Cow[] herd) {
        this.herd = herd;
    }

    public void setFlock(Sheep[] flock) {
        this.flock = flock;
    }

    public void setHerdOfHorses(Horse[] herdOfHorses) {
        this.herdOfHorses = herdOfHorses;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public void print(int cowLength, int sheepLength, int horseLength) {
        System.out.printf("Адрес фермы:%s\nИмя владельца:%s\n", getAddress(), getOwnerFullName());
        System.out.println();
        System.out.println("Коровы");
        System.out.println();
        for (int c = 0; c < cowLength; c++) {
            System.out.printf("Вес:%s\nВозраст:%s\nПол:%s\nКличка:%s\n\n", herd[c].getWeight(), herd[c].getAge(), herd[c].getGender(), herd[c].getName());
        }
        System.out.println();
        System.out.println("Овцы");
        System.out.println();
        for (int c = 0; c < sheepLength; c++) {
            System.out.printf("Вес:%s\nВозраст:%s\nПол:%s\nКличка:%s\n\n", flock[c].getWeight(), flock[c].getAge(), flock[c].getGender(), flock[c].getName());
        }
        System.out.println();
        System.out.println("Лошади");
        System.out.println();
        for (int c = 0; c < horseLength; c++) {
            System.out.printf("Вес:%s\nВозраст:%s\nПол:%s\nКличка:%s\n\n", herdOfHorses[c].getWeight(), herdOfHorses[c].getAge(), herdOfHorses[c].getGender(), herdOfHorses[c].getName());
        }
    }
}
