package com.MethodsInJava;

public class methodChallange3Answer {
    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));

    }

    private static String getDurationString(long minute, long second) {
        if ((minute < 0) || (second < 0) || (second > 59)) {  // minute gana 0 wada adunam ,  sec gaana 59 wada wadinam
            return "Invalid Value";
        }
        long hours = minute / 60;
        long remainingMinutes = minute % 60;
        return hours + "h " + remainingMinutes + "m " + second + "s ";
    }

    private static String getDurationString(long second) {
        if (second < 0) {
            return "Invalid Value";
        }
        long minute = second / 60;
        long remainingSecond = second % 60;
        return getDurationString(minute, remainingSecond);

    }
}
