package com.OOP1.composition.myTest1;

public class Bettery {
    private String name;
    private int mah;
    private int size;

    public Bettery(String name, int mah, int size) {
        this.name = name;
        this.mah = mah;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getMah() {
        return mah;
    }

    public int getSize() {
        return size;
    }
}
