package com.company;

public class Keyboard {
    private boolean isBackLighting;
    private boolean isAdditionalFigures;

    public Keyboard(boolean isBackLighting, boolean isAdditionalFigures) {
        this.isBackLighting = isBackLighting;
        this.isAdditionalFigures = isAdditionalFigures;
    }

    public Keyboard() {
    }

    public boolean isBackLighting() {
        return isBackLighting;
    }

    public boolean isAdditionalFigures() {
        return isAdditionalFigures;
    }

    public void setBackLighting(boolean backLighting) {
        isBackLighting = backLighting;
    }

    public void setAdditionalFigures(boolean additionalFigures) {
        isAdditionalFigures = additionalFigures;
    }
}
