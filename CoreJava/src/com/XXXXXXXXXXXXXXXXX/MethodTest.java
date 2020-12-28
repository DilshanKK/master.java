package com.XXXXXXXXXXXXXXXXX;

public class MethodTest {

    public static void main(String[] args) {

        int position = caclulateHighScorePosition(3000);
        displayHighScorePosition(" Sampath", position);

        position = caclulateHighScorePosition(1200);
        displayHighScorePosition(" Tim", position);

        position = caclulateHighScorePosition(500);
        displayHighScorePosition(" Yaki", position);

    }

    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " manage into get position " + position + " on the high Score table");
    }

    public static int caclulateHighScorePosition(int score) {

        int position = 0;

        if (score >= 1000) {
            position = 1;

        } else if (score >= 500 && score <= 1000) {
            position = 2;
        } else if (score >= 100 && score <= 501) {
            position = 3;
        }
        return position;
    }


}

