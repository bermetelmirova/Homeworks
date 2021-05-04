package com.company;

public class Display {
    private double diagonal;
    private String producer;
    private String typeOfMatrix;

    public Display(double diagonal, String producer, String typeOfMatrix) {
        this.diagonal = diagonal;
        this.producer = producer;
        this.typeOfMatrix = typeOfMatrix;
    }

    public Display() {
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getProducer() {
        return producer;
    }

    public String getTypeOfMatrix() {
        return typeOfMatrix;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setTypeOfMatrix(String typeOfMatrix) {
        this.typeOfMatrix = typeOfMatrix;
    }
}
