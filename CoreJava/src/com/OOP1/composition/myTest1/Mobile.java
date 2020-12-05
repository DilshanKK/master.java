package com.OOP1.composition.myTest1;

public class Mobile {
    private Display display;
    private Bettery bettery;
    private MotherBoard motherBoard;


    public Mobile(Display display, Bettery bettery, MotherBoard motherBoard) {
        this.display = display;
        this.bettery = bettery;
        this.motherBoard = motherBoard;
    }

    public Display getDisplay() {
        return display;
    }


    public Bettery getBettery() {
        return bettery;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
