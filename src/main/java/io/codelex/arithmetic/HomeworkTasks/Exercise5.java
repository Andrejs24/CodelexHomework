package io.codelex.arithmetic.HomeworkTasks;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumb = rand.nextInt(100) + 1;
        System.out.println("I guessed a number from 1 to 100 guess what");
        Scanner scan1 = new Scanner(System.in);
        int firstTry = scan1.nextInt();
        hint(firstTry, randomNumb);
    }

    public static void hint(int a, int randomNumb) {
        if (a > randomNumb) {
            System.out.println("Sorry, you are too high.  I was thinking of " + randomNumb);
        } else if (a < randomNumb) {
            System.out.println("Sorry, you are too low.  I was thinking of " + randomNumb);
        } else if (a == randomNumb) {
            System.out.printf("You guessed it!  What are the odds?!?");
        } else System.out.println("Hmmm.... something went wrong.....");
    }

}
