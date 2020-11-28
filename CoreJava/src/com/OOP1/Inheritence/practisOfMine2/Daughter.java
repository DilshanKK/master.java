package com.OOP1.Inheritence.practisOfMine2;

public class Daughter extends Father {

    private int boobs;
    private int logsHairs;

    public Daughter(String surName, String voice, int height, int boobs, int logsHairs) {
        super(surName, 2, 1, 2, 2, voice, height);
        this.boobs = boobs;
        this.logsHairs = logsHairs;
    }

    @Override
    public void shout() {
        int i = 11;
        System.out.println("She is getting afraid. du.shot() called" +i);
        super.shout();
    }

    public int boobs(){
        return boobs;
    }
    public int getLogsHairs(){
        return logsHairs;
    }

}
