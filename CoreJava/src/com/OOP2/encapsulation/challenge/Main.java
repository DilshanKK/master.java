package com.OOP2.encapsulation.challenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println(" initial page count"+ printer.getNoOfPagesPrinted());

        int pagePrinted = printer.printPages(4);
        System.out.println(" pages printed was " + pagePrinted + " new total printer count of printer = " + printer.getNoOfPagesPrinted());

        pagePrinted = printer.printPages(2);
        System.out.println(" pages printed was " + pagePrinted + " new total printer count of printer = " + printer.getNoOfPagesPrinted());

    }


}
