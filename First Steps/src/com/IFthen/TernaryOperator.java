package com.IFthen;

public class TernaryOperator {
    public static void main(String[] args) {

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 200) ? true : false;
        System.out.println(isEighteenOrOver);
        //if ageOfClient is true assign to the true
        //if ageOfClient is fase assign to the false

        //Operand one ageOfClient == 20 in this case is the condition we are checking. it needs to return true or false
        //Operand two - true here it is the value to assign to the variable isEighteenOrOver if the condtion above is true
        //Operand three - false here is the value to assign to the variable isEighteenOrOver if the condtion avoive was false.


        boolean isCar = false;

        //Senario 1
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("1. wasCar is true");
        }//due to false not execute the wascar is true statment

        //Senario 2
        isCar = true;
        boolean wasCar1 = isCar ? true : false;
        if (wasCar1) {
            System.out.println("2. WasCar is true");
        }

    }
}
