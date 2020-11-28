package com.OOP1.Inheritence.practisOfMine2;

public class Father {
    private String surName ;
    private int eyes =2;
    private int nose ;
    private int legs;
    private int hands;
    private String voice;
    private final String sex = "Male"; //sex eka wenas karanna one nathnm final karanna
    private int height;

    public Father(String surName, int eyes, int nose, int legs, int hands, String voice, int height){

        this.surName = surName;
        this.eyes = eyes;
        this.nose = nose;
        this.legs = legs;
        this.hands = hands;
        this.voice = voice;
        this.height = height;

    }

    public void shout(){
        int i =10;
        System.out.println("Father is shoting, Father class shot() called" +i);
    }


    public String getSurName() {
        return surName;
    }

    public int getEyes() {
        return eyes;
    }

    public int getNose() {
        return nose;
    }

    public int getLegs() {
        return legs;
    }

    public int getHands() {
        return hands;
    }

    public String getVoice() {
        return voice;
    }

    public int getHeight() {
        return height;
    }
}
