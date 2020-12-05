package com.OOP1.composition.myTest1;

public class Ic {
    private String modelName;
    private int modelNumber;
    private int noOfPins;

    public Ic(String modelName, int modelNumber, int noOfPins) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.noOfPins = noOfPins;
    }

    public void power(int power){
        System.out.println("IC power is "+ power);

    }

    public String getModelName() {
        return modelName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public int getNoOfPins() {
        return noOfPins;
    }
}
