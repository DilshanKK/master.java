package com.OOP1.composition.myTest1;

public class MotherBoard {

    private String brandName;
    private int size;
    private Ic ic;

    public MotherBoard(String brandName, int size, Ic ic) {
        this.brandName = brandName;
        this.size = size;
        this.ic = ic;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getSize() {
        return size;
    }

    public Ic getIc() {
        return ic;
    }
}
