package com.OOP1.Encapsulation;

public class Assiment2VipClass {



    private String name;
    private double creditLimit;
    private String email;


    public Assiment2VipClass() {
        this(" Default name", 10000, "Default@.com");

    }

    public Assiment2VipClass(String name, double creditLimit ) {
      this(name,1000, "unknown@com");

    }

    public Assiment2VipClass(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
