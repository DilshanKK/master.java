package com.IFthen;

public class LogicalOperator {
    public static void main(String[] args) {

        int topScore = 100;

        //Senario 1
        if (topScore == 100){
            System.out.println("1. You got the high score!");
        }

        //Senario 2
        if (topScore != 100){
            System.out.println("2. You got the high score!");
            //the reason is does equal to 100 so therefor the expression topScore  not equal to 100 was false.

        }
        //Senario 3
        if (topScore > 100){
            System.out.println("2. You got the high score!");
        }

        //Senario 4
        if (topScore < 100){
            System.out.println("2. You got the high score!");
        }


    }

}
