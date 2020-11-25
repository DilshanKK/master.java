package com.MethodsInJava;

public class methodChallange3Answer {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";// we create constant varible to for easy access

    public static void main(String[] args) {

        System.out.println(getDurationString(40, 6));
        System.out.println(getDurationString(10));
        System.out.println(getDurationString(-10));

    }

    private static String getDurationString(long minute, long second) {
        if ((minute < 0) || (second < 0) || (second > 59)) {  // minute gana 0 wada adunam ,  sec gaana 59 wada wadinam
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minute / 60;
        long remainingMinutes = minute % 60;

        //add 0 infront of the h and m.
        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minuteString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minuteString = "0" + minuteString;
        }
        String secondString = second + "s";
        if (second < 10) {
            secondString = "0" + secondString;
        }

        return hoursString + " " + minuteString + " " + secondString + " ";
    }

    private static String getDurationString(long second) {
        if (second < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minute = second / 60;
        long remainingSecond = second % 60;
        return getDurationString(minute, remainingSecond);

    }
}
