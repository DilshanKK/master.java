package com.XXXXXXXXXXXXXXXXX;

public class SpeedConverter {

    public static void main(String[] args) {

        printConversaion(1.5);
        printConversaion(10.25);
        printConversaion(-5.6);
        printConversaion(25.42);
        printConversaion(75.114);
}
public static long perMilesPerhour(double killoMetersPerHours) {

        if (killoMetersPerHours < 0) {
            return -1;
        }
        double mphValue = 0.621371;
        long pmh = Math.round(killoMetersPerHours * mphValue);
        return pmh;


    }

    public static void printConversaion(double killoMetersPerHours) {

        if (killoMetersPerHours < 0) {
            System.out.println(" invalid value");
        }
        long mph = perMilesPerhour(killoMetersPerHours);
        System.out.println(killoMetersPerHours + " km/h " + mph + " mi/h");
    }
}
