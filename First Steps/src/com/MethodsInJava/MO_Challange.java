package com.MethodsInJava;

public class MO_Challange {
    public static void main(String[] args) {

       double tot= calcFeetAndInchesTOCentemeters(294);
        System.out.println(tot);
       tot= calcFeetAndInchesTOCentemeters(24,6);

        System.out.println(tot);


    }

    public static double calcFeetAndInchesTOCentemeters(double feet, double inches) {
        if (feet <= 0) {
            // if not true retun -1
            return -1;
        } else if (inches >= 0 && inches <= 12) {
            // if not true retun -1
            return feet * 30.48 + inches * 2.54;

        }
        return -1;


    }

    public static double calcFeetAndInchesTOCentemeters(double inches) {
        if (inches <= 0) {
            return -1;
        }
        double feet =  inches / 12;
        return calcFeetAndInchesTOCentemeters(feet, 0);

    }

}
