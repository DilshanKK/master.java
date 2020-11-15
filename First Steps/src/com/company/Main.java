package com.company;

public class Main {

    public static void main(String[] args) {

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;



             System.out.println("Min byte value" + minByteValue);
             System.out.println("Max  byte value" + maxByteValue);
                 System.out.println(" added a +1 = " + (maxByteValue +1));
                 System.out.println(" mini - 1 = " + (minByteValue -1));
                    System.out.println("---------------------------------");

             System.out.println("Min Short value" + minShortValue);
             System.out.println("Max Short value" + maxShortValue);
                System.out.println(" added a +1 = " + (maxShortValue +1));
                System.out.println(" mini - 1 = " + (minShortValue -1));
                    System.out.println("---------------------------------");

             System.out.println("Min Int value" + minValue);
             System.out.println("Max Int value" + maxValue);
                    System.out.println(" added a +1 = " + (maxValue +1));
                    System.out.println(" mini - 1 = " + (minValue -1));
                        System.out.println("---------------------------------");

             System.out.println("Min Long value " + minLongValue);
             System.out.println("Max long value " + maxLongValue);
                    System.out.println(" added a +1 = " + (maxLongValue +1));
                    System.out.println(" mini - 1 = " + (minLongValue -1));

                        System.out.println("---------------------------------");

            System.out.println("min float value " + minFloatValue);
            System.out.println("min float value " + maxFloatValue);
                    System.out.println("---------------------------------");

            System.out.println("min Double Value " + minDoubleValue);
            System.out.println("Max Double Value " + maxDoubleValue);
                    System.out.println("---------------------------------");


         byte newByteValue = (byte) (minByteValue/ 2);
            System.out.println(newByteValue);
         short newShortValue = (short) (minShortValue /2);
        System.out.println(newShortValue);
    }
}
