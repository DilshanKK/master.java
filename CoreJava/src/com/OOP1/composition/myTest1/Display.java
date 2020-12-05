package com.OOP1.composition.myTest1;

public class Display {
    private int inches;
    private String madeByCOuntry;

    public Display(int inches, String madeByCOuntry) {
        this.inches = inches;
        this.madeByCOuntry = madeByCOuntry;
    }

    public int getInches() {
        return inches;
    }

    public String getMadeByCOuntry() {
        return madeByCOuntry;
    }
}
