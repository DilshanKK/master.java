package com.OOP1.Inheritence.practisOfMine2;

public class Son extends Father {
    private int weight;
    private int fingers;
    private String fairness;
    private String birthMarks;


    public Son(String surName, int eyes, int nose, int legs, int hands, String voice, int height, int weight, int fingers, String fairness, String birthMarks) {
        super(surName, eyes, nose, legs, hands, voice, height);

        this.weight = weight;
        this.fingers = fingers;
        this.fairness = fairness;
        this.birthMarks = birthMarks;
    }

    @Override
    public void shout() {
        System.out.println(" Do not know the reason");
        super.shout();
        clam();
    }

    public void cry() {
        System.out.println("he crys always");

    }

    public void clam() {
        System.out.println("but son is a clam person");
        cry();
    }

    public int getWeight() {
        return weight;
    }

    public int getFingers() {
        return fingers;
    }

    public String getFairness() {
        return fairness;
    }

    public String getBirthMarks() {
        return birthMarks;
    }


}
