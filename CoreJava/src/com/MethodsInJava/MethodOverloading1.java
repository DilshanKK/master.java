package com.MethodsInJava;

public class MethodOverloading1 {
    public static void main(String[] args) {
        int newScore = calculateScore("Dilshan", 52);
        System.out.println("New score is : " + newScore);

        int unknownScore = calculateScore(25);
        System.out.println("unknown name : " + unknownScore);

        //calculateScore();

    }

    public static int calculateScore(String name, int score) {
        System.out.println("Player name is : " + name + " score :" + score);
        int scoreBoard = score *= 100;
        return scoreBoard;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown name  : " + " score :" + score);
        return score * 100;
    }

    //    public static void calculateScore(){
//        System.out.println("No parameter");
//
//    }
//    public static void calculateScore() {
//        System.out.println("No parameter");
//        return 0;


}
