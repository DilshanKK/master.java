package com.MethodsInJava;

public class method3 {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        calCulateScore(gameOver, 5000, levelCompleted, 100);

//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
        calCulateScore(gameOver, 10000, 5, 200);
//        if (gameOver) {
//            int secScore = score + (levelCompleted * bonus);
//            System.out.println("Sec Score is " + secScore);
//        }
        //

    }

    public static void calCulateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final score is :" + finalScore);
        }


    }

}
