package io.codelex.arithmetic.HomeworkTasks;

import java.util.Random;
import java.util.Scanner;

//Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd,
// or “Even Number” otherwise. The program shall always print “bye!” before exiting
public class Exercise2 {

    public static void main(String[] args) {
        System.out.println("Let's start our program!");
        Random rand = new Random();
        int variable = rand.nextInt();
        System.out.println("I generated random number and it's " + variable);
        checkOddEven(variable);
        System.out.println("bye!");
    }


    public static void checkOddEven(int a) {
        String result;
        if (a % 2 == 0) {
            result = "Even Number";
        } else if (a % 2 != 0) {
            result = "Odd Number";
        } else result = "Looks like it is 0 right?";
        System.out.println(result);
    }


}
