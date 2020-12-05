package com.OOP1.composition.myTest1;

public class Main {
    public static void main(String[] args) {

        Display theDisplay = new Display(5,"Findland");
        Bettery theBettery = new Bettery("Findland",3500, 3);
        MotherBoard theMotherBoard = new MotherBoard("Intel", 3, new Ic("Intel",000202, 40));

        Mobile theMobile = new Mobile(theDisplay, theBettery, theMotherBoard);
        System.out.println(theMobile.getMotherBoard().getBrandName());




    }
}
