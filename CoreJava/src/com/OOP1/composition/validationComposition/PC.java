package com.OOP1.composition.validationComposition;

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

    public void powerUp() {
        theCase.pressPowerButton();

        drawLogo();

    }// jst access the need method. its jst like a validation // hide the object

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, " yellow");
        System.out.println("Show the logo");
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}





