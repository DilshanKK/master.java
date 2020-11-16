package com.MethodsInJava;

public class method4 {
    public static void main(String[] args) {

        calculateScore(true, 5000, 5, 100);
        calculateScore(true, 10000, 5, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final score is :" + finalScore);
        }

    }
}
// we did more short the code. now the code is very clear. not messy.