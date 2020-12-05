package com.OOP1.composition.firstExample;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    //pc has a monitor
    //pc has a case
    //pc has a motherboard

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;

    }


    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}


