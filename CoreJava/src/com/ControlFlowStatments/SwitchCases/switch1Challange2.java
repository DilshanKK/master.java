package com.ControlFlowStatments.SwitchCases;

public class switch1Challange2 {
    public static void main(String[] args) {

        String month = "November";
        //after JDK 7 we can use String for switch cases
        switch (month) {
            case "January":
                System.out.println("found the month of " + month);
                break;
            case "February":
                System.out.println("Found the month of " + month);
                break;
            case "March":
                System.out.println("Found the month of " + month);
                break;
            case "April":
                System.out.println("Found the month of " + month);
                break;
            case "May":
                System.out.println("Found the month of " + month);
                break;
            case "June":
                System.out.println("Found the month of " + month);
                break;
            case "July":
                System.out.println("Found the month of " + month);
                break;
            case "August":
                System.out.println("Found the month of " + month);
                break;
            case "Septhember":
                System.out.println("Found the month of " + month);
                break;
            case "October":
                System.out.println("Found the month of " + month);
                break;
            case "November":
            case "December":
                System.out.println("Found the month of " + month);
                break;
            default:
                System.out.println("Not found");
                break;
        }
        //String values are case sensitive

    }
}
