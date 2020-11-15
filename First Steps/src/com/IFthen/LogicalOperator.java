package com.IFthen;

public class LogicalOperator {
    public static void main(String[] args) {

        int topScore = 80;


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
        if (topScore < 100){ //Topscore is not less than 100.its equal to 100
            System.out.println("3. You got the high score!");
        }

        //Senario 4
        if (topScore <= 100){ //greater than equal
            System.out.println("4. You got the high score!");
        }

        System.out.println("Updated topscore 100 to 80------------------------");

                                        //&& (AND)
        int secTopScore  =  60;

        if (topScore > secTopScore && topScore <100){
            System.out.println("Greater than second top score and less  than 100");
        }
        if ((topScore > secTopScore) && (topScore <100)){
            System.out.println("Greater than second top score and less  than 100");
        }//Its better put those bracket because it will be easy to read in the future..

                                    //  || (OR)

        //sernario 1
        if ((topScore > 90) || (secTopScore <100)){ //false - true = true
            System.out.println(" 1. Either or both of the condition are true");
        }

        //senario 2

        if ((topScore > 90) || (secTopScore > 100)){ //false - false = false
            System.out.println(" 2 Either or both of the condition are true");
        }

    }

}
