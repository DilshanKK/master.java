package com.XXXXXXXXXXXXXXXXX;

public class PrimitiveChallange {
    public static void main(String[] args) {

        byte by = 120;
        short sh = 1200;
        int i = 10_000;
        long Total = (5000L + 10) * (by + sh + i);
        System.out.println(Total);

        short shortTotal = (short) (by + sh + i);
        System.out.println(shortTotal);

        byte byteTotal = (byte) (by + sh + i);
        System.out.println(byteTotal);

        int intTotal = (by + sh + i);
        System.out.println(intTotal);
    }
}
