package com.Operators;

public class Plus {
    public static void main(String[] args) {

        int result = 1 + 2 ;
            System.out.println(" 1 + 2 = " + result);

        int previousResult = result;
            System.out.println("PreviousResults = " + previousResult);

        result = result - 1;
            System.out.println(" 3 - 1 = " + result);
        System.out.println(" previousResult = " + previousResult);

        result = result * 20;
            System.out.println(" 2 * 20 is " + result);

        result = result / 2;
            System.out.println(" 40  / 2 " + result);

        result = result % 3; // The Reminder of (4 % 3) = 1
            System.out.println("4 % 3 = " + result);

        System.out.println("---------------------------------------");

         //Obbreviating Operator

        result ++; // 2+1 = 3
            System.out.println("2 + 1 = " + result);
        result --;
            System.out.println("3 - 1 = " + result);

        //Result = Result + 1
        result += 1;
            System.out.println(" 2 + 1 = " + result);

        //result = result * 10;
        result *= 10;
            System.out.println(" 3 * 10 = " + result);

        //result = result / 3;
        result /= 3;
            System.out.println(" 30 / 3 = " + result);

        //result = result - 2;
        result -= 2;
        System.out.println(" 10 - 2 = " + result);



    }
}
                      