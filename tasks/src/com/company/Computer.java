package com.company;

import java.security.Key;

public class Computer {
    private Display display;
    private String brand;
    private String color;
    private HardDrive hardDrive;
    private RAM ram;
    private String videoCard;
    private UsbPort[] usbPort;
    private Keyboard keyboard;

    public Computer(Display display, String brand, String color, HardDrive hardDrive, RAM ram, String videoCard, UsbPort[] usbPort, Keyboard keyboard) {
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.hardDrive = hardDrive;
        this.ram = ram;
        this.videoCard = videoCard;
        this.usbPort = usbPort;
        this.keyboard = keyboard;
    }

    public Computer() {
    }

    public Display getDisplay() {
        return display;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public RAM getRam() {
        return ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public UsbPort[] getUsbPort() {
        return usbPort;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public void setUsbPort(UsbPort[] usbPort) {
        this.usbPort = usbPort;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
