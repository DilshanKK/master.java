package com.OOP1.composition.firstExample;

public class Case {

    private String model;
    private String manuFacture;
    private String powerSupply;
    private Dimenstion dimenstion;

    public Case(String model, String manuFacture, String powerSupply, Dimenstion dimenstion) {
        this.model = model;
        this.manuFacture = manuFacture;
        this.powerSupply = powerSupply;
        this.dimenstion = dimenstion;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed ");
    }

    public String getModel() {
        return model;
    }

    public String getManuFacture() {
        return manuFacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimenstion getDimenstion() {
        return dimenstion;
    }
}
