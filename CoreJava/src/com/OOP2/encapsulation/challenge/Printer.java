package com.OOP2.encapsulation.challenge;

public class Printer {

    private int tonerLevel;
    private int noOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.noOfPagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                this.tonerLevel = +tonerLevel;
                return this.tonerLevel;
            }

        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint /= 2;
            System.out.println(" printing in duplex mode");
        }
        this.noOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }
}
