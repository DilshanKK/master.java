package com.MethodsInJava;

public class methodChallange3 {
    public static void main(String[] args) {


        int invalidTime = getDuringString(3600);
        System.out.println("invalidTime :" + invalidTime);
    }

    public static int getDuringString(int minutes, int sec) {
        if ((minutes >= 0) && (sec >= 0 && sec <= 59)) {

            int hrs = minutes / 60;
            int reminMinit = minutes % 60;

            System.out.println("h :" + hrs + " m: " + reminMinit + " s: " + sec);
        }
        return -1;
    }

    public static int getDuringString(int sec) {

        if (sec <= 0) {
            return -1;
        }
        int miniteAvalable = sec / 60;
        int reminingSec = sec % 60;
        return getDuringString(miniteAvalable, reminingSec);



    }

}