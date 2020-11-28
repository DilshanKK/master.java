package com.OOP1.Inheritence.practisOfMine1;

public class Father {

    private String surName = "Kodit";
    private int eyes =2;
    private int nose ;
    private int legs;
    private int hands;
    private String voice;
    private final String sex = "Male"; //sex eka wenas karanna one nathnm final karanna
    private int height;



    public String getSurName() {
        return surName;
    }

    public int getEyes(){
        return eyes;
    }
    public int getNose(){
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

    public String getSex() {
        return sex;
    }

    public int getHeight() {
        return height;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setNose(int nose) {
        this.nose = nose;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }

    public void setHeight(int height) {
        this.height = height;
    }
}
