package com.IFthen;

public class AssignmentVsEqualOperator {
    public static void main(String[] args) {

        //Senario 1
        int newValue = 50;
        //if(newValue = 50){
        //    System.out.println("This is an error!");
        //}
        //Senario 2
        if (newValue == 50){
            System.out.println("Solve this error!");
        }
        //Senario 3

        boolean isCar = false;

        if (isCar = true) {
            System.out.println("1. This not supposed to happen");
        }
        //"isCar equals true" even though thats an equals operator that is returning true because the isCar variable is a boolean and has been assigned to the value true. so thats why not getting an error.


        //Senario 4
        if (isCar == true){
            System.out.println("2. This is not suppsed to happen");
        }

        //Senario 5
        if (isCar != true){// not equal to true
            System.out.println("3. This is not suppsed to happen");
        }
        // check isCar was not equal to true
        //Senario 6
        if (!isCar){// not equal to true
            System.out.println("4. This is not suppsed to happen");
        }
        //Senario 7
//        if (isCar == false){//  equal to false
//            System.out.println("5. This is not suppsed to happen");
//        }
    }
}
