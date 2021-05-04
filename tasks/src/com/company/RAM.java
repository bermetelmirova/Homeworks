package com.company;

public class RAM {
    private int volume;
    private String producer;

    public RAM(int volume, String producer) {
        this.volume = volume;
        this.producer = producer;
    }

    public RAM() {
    }

    public int getVolume() {
        return volume;
    }

    public String getProducer() {
        return producer;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
