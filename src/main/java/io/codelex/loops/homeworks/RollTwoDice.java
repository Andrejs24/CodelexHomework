package io.codelex.loops.homeworks;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Please enter your desire sum : ");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        boolean gameOver = true;
        if (sum <= 12 && sum > 0) {
            while (gameOver) {

                int diсe1 = random.nextInt(6) + 1;
                int diсe2 = random.nextInt(6) + 1;
                if (diсe1 + diсe2 != sum) {
                    System.out.println(diсe1 + " + " + diсe2 + " = " + (diсe1 + diсe2));
                } else if (diсe1 + diсe2 == sum) {
                    System.out.println(diсe1 + " + " + diсe2 + " = " + (diсe1 + diсe2));
                    gameOver = false;
                }

            }
        }
        else System.out.println("It can't be bigger than 12, I have only two dices");
    }
}
