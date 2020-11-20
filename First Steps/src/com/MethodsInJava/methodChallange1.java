package com.MethodsInJava;

public class methodChallange1 {
    public static void main(String[] args) {


        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Sanath Jayasuriya", highScore);


        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("Kusal Mendis", highScore);


        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Mahela Gunawardana", highScore);


        highScore = calculateHighScorePosition(50);
        displayHighScorePosition("Kumara Sangak kaara", highScore);


    }

    public static void displayHighScorePosition(String playerName, int highScore) {
        System.out.println(playerName + " Manage get into position " + highScore + " On the High Score table ");
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500 && score < 1000) {
//            return 2;
//        } else if (score >= 100 && score < 500) {
//            return 3;
//        } else {
//            return 4;
//        } //both ways can do this code.
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500 && score < 1000) {
            position = 2;
        } else if (score >= 100 && score < 500) {
            position = 3;
        }
        return position ;
    }


}
