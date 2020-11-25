package com.MethodsInJava;

public class methodChallange2 {

    public static void main(String[] args) {

        printConversion(0);
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kiloMeterPerHour) {

        if (kiloMeterPerHour <= 0) {
            return -1;
        } else {
            //calculation 1km = 0.621371 miles
            return Math.round(kiloMeterPerHour * 0.621371);
        }
    }

    public static void printConversion(double kiloMeterPerHour) {
        long toMilesPerHour = toMilesPerHour(kiloMeterPerHour);
        if (toMilesPerHour < 0) {
            System.out.println("Invalid Value ");
        } else {
            System.out.println(kiloMeterPerHour + "km/h = " + toMilesPerHour + " mi/h ");
        }
    }
}