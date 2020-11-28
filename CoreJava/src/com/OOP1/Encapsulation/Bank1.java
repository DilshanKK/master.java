package com.OOP1.Encapsulation;

public class Bank1 {
    private String name;
    private String dob;
    private double balace = 200000;

    public void setName(String name) {

        if (name.equals("Ramesha") || name.equals("Dilshan")) {
            this.name = name;
        }
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public double getBalace() {
        return balace;
    }


}
