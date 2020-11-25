package com.ControlFlowStatments.WhileLoop;

public class WhileLoopChallange1 {

    public static void main(String[] args) {

        int anyNumber = 3;
        int tot = 0;
        int sum = 0;
//Senario 1
        while (anyNumber < 20) {

            anyNumber++;

            if (!isEvenNumber(anyNumber)) { // !false = true
                continue;
            } else {
                System.out.println(anyNumber);
                sum += anyNumber;
                tot++;
                if (tot == 5) {
                    break;
                }
            }

        }
        System.out.println("number is count " + tot);
        System.out.println("total sum is : " + sum);


        //Senario 2
//        int num = 3;
//        int step = 0;
//        int sum = 0;

//        do {
//            if (isEvenNumber(num)) {
//                System.out.println(num);
//                step++;
//                sum += num;
//            }
//            num++;
//        }
//        while (step < 5);


        //Senario 3

//        int num = 3;
//        int step = 0;
//        int sum = 0;

        //        while (num <= 20) {
//            num++;
//            if (step < 5) {
//                if (isEvenNumber(num)) {
//                    System.out.println(num);
//                    step++;
//                    sum+=num;
//                }
//            }
    }

    private static boolean isEvenNumber(int numbers) {

        if (numbers % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
