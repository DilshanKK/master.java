package com.ControlFlowStatments.ForLoops;

public class ForLoopChallange2 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 2; i <= 30; i++) {

            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a primery number");
                if (count == 5) {
                    break;
                }

            } else {

            }

        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

}

