package io.codelex.loops.homeworks;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        System.out.println("Lets play a game!");
        Random random = new Random();
        int dice;
        int score = 0;
        boolean gambling = true;
        do {
            dice = random.nextInt(6) + 1;
            if (dice == 1) {
                System.out.println("Sorry you rolled : " + dice);
                score=0;
                break;
            } else {
                System.out.println("You rolled : " + dice);
                score += dice;
                System.out.println("Roll again? y/n");
                Scanner scanner = new Scanner(System.in);
                String answer = scanner.nextLine();
                if (!answer.equals("y")) {
                    gambling = false;
                    break;
                }
            }

        } while (gambling);
        System.out.println("Game over! Your score is : " + score);

    }
}



