package com.OOP1.composition.firstExample;

public class Main {
    public static void main(String[] args) {

        Dimenstion dimention = new Dimenstion(20, 20, 5);
        Case theCase = new Case("2028B", "Dell", "240 V", dimention);

        Monitor theMonitor = new Monitor("27Inches","Acer" , 24, new Resolution(2540 ,1440));
        // We can use both like this. create a object or create a object inside the parameters.

        MotherBoard theMotherboard = new MotherBoard("082AC", "Intel",4,5,"v 1.0");

        PC thePc = new PC(theCase, theMonitor, theMotherboard);


        thePc.getMonitor().drawPixelAt(1500, 1200, "red");
        thePc.getMotherBoard().loadProgramme("winwdos 1.0");
        thePc.getTheCase().pressPowerButton();

    }
}
